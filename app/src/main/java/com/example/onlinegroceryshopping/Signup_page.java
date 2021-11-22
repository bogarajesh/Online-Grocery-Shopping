package com.example.onlinegroceryshopping;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Signup_page extends AppCompatActivity {

    public static final String TAG = "TAG";
    public static final String TAG1 = "TAG";
    Button btnRegister;
    EditText et_tsn;
    EditText et_emailid;
    EditText et_gstno;
    EditText et_add;
    EditText et_mobno;
    EditText et_pass;
    EditText et_repass;

    FirebaseAuth fba;
    FirebaseFirestore db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);


        btnRegister=findViewById(R.id.Register);
        et_tsn=findViewById(R.id.Shop_Name);
        et_emailid=findViewById(R.id.Email_id);
        et_gstno=findViewById(R.id.GST_No);
        et_add=findViewById(R.id.Adress);
        et_mobno=findViewById(R.id.Mobile_Number);
        et_pass=findViewById(R.id.Password);
        et_repass=findViewById(R.id.Repassword);
        fba=FirebaseAuth.getInstance();

        db=FirebaseFirestore.getInstance();



        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String Shopname=et_tsn.getText().toString();
                final String Emailid=et_emailid.getText().toString();
                final String Gstno=et_gstno.getText().toString();
                final String Address=et_add.getText().toString();
                final String Mobileno=et_mobno.getText().toString();
                String password=et_pass.getText().toString();
                String re_password=et_repass.getText().toString();

                if (Shopname.isEmpty()){
                    et_tsn.setError("Enter Shop Name");
                    et_tsn.requestFocus();
                }

                else
                if (Emailid.isEmpty()){
                    et_emailid.setError("Enter Email Id");
                    et_emailid.requestFocus();
                }
                else if (Gstno.isEmpty()){
                    et_gstno.setError("Enter GST Number");
                    et_gstno.requestFocus();
                }

                else if (Address.isEmpty()){
                    et_add.setError("Enter Address");
                    et_add.requestFocus();
                }

                else if (Mobileno.isEmpty()){
                    et_mobno.setError("Enter Mobile Name");
                    et_mobno.requestFocus();
                }

                else if (password.isEmpty()){
                    et_pass.setError("Enter Password");
                    et_pass.requestFocus();
                }

                else if (re_password.isEmpty()){
                    et_repass.setError("Enter Re-Password");
                    et_repass.requestFocus();
                }

                else if (!(password.equals(re_password))){
                    et_repass.setError("Enter Correct password");
                    et_repass.requestFocus();
                }
                else if (Emailid.isEmpty() && password.isEmpty()) {
                    Toast.makeText(Signup_page.this, "field are empty", Toast.LENGTH_SHORT).show();
                }
                else if (!(Emailid.isEmpty()  &&  password.isEmpty()))
                {
                    fba.createUserWithEmailAndPassword(Emailid,password).addOnCompleteListener(Signup_page.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()){
                                Toast.makeText(Signup_page.this,"Unsuccessful,please try again",Toast.LENGTH_SHORT).show();
                                // Create a new user with a first and last name
                                Map<String, Object> user = new HashMap<>();
                                user.put("Shop Name", Shopname);
                                user.put("Email Id", Emailid);
                                user.put("GST No.", Gstno);
                                user.put("Address", Address);
                                user.put("Mobile No", Mobileno);


// Add a new document with a generated ID
                                db.collection("users")
                                        .add(user)
                                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                            @Override
                                            public void onSuccess(DocumentReference documentReference) {
                                                Log.d(TAG,"DocumentSnapshot added with ID: " + documentReference.getId());
                                            }
                                        })
                                        .addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {
                                                Log.w(TAG1, "Error adding document", e);
                                            }
                                        });
                            }
                            else{

                                Intent i =new Intent(Signup_page.this,Login_page.class);
                                Toast.makeText(Signup_page.this,"Registration Successful",Toast.LENGTH_SHORT).show();
                                startActivity(i);
                            }
                        }
                    });
                }

                else{
                    Toast.makeText(Signup_page.this,"Error!!!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
