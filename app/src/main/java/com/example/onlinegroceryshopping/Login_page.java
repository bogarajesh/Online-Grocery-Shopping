package com.example.onlinegroceryshopping;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login_page extends AppCompatActivity {

    Button btnSubmit;
    EditText et_emailid;
    EditText et_pass;
    TextView tv_forgetpassword;

    FirebaseAuth fba;
    private FirebaseAuth.AuthStateListener asl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        btnSubmit = findViewById(R.id.Submit);
        et_emailid = findViewById(R.id.Email_id);
        et_pass = findViewById(R.id.Password);
        tv_forgetpassword=findViewById(R.id.Forgetpass);
        fba = FirebaseAuth.getInstance();



        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Emailid = et_emailid.getText().toString();
                String password = et_pass.getText().toString();

                if (Emailid.isEmpty()) {
                    et_emailid.setError("Enter Email Id");
                    et_emailid.requestFocus();
                } else if (password.isEmpty()) {
                    et_pass.setError("Enter Password");
                    et_pass.requestFocus();
                } else if (Emailid.isEmpty() && password.isEmpty()) {
                    Toast.makeText(Login_page.this, "field are empty", Toast.LENGTH_SHORT).show();
                } else if (!(Emailid.isEmpty() && password.isEmpty())) {
                    fba.signInWithEmailAndPassword(Emailid, password).addOnCompleteListener(Login_page.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {

                                Toast.makeText(Login_page.this, "Enter Correct User Email & Password", Toast.LENGTH_SHORT).show();

                            } else {
                                Intent j = new Intent(Login_page.this, Home_page.class);
                                startActivity(j);
                            }
                        }
                    });
                }
                else {
                    Toast.makeText(Login_page.this, "Wel-Come", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tv_forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRecoverPasswordDialog();
            }
        });




        asl=new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser fbu=fba.getCurrentUser();
                if (fbu!=null) {
                }
                else {
                    Toast.makeText(Login_page.this,"Successfully Login",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Login_page.this,Home_page.class);
                    startActivity(i);
                }
            }
        };
    }

    private void showRecoverPasswordDialog() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Forget Password");
        LinearLayout linearLayout=new LinearLayout(this);
        final EditText Email_id=new EditText(this);
        Email_id.setHint("Email");
        Email_id.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        linearLayout.addView(Email_id);
        linearLayout.setPadding(10,10,10,10);
        builder.setView(linearLayout);

        builder.setPositiveButton("Recover", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String email=Email_id.getText().toString().trim();
                beginRecover(email);

            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.create().show();
    }

    private void beginRecover(String email) {
        fba.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Toast.makeText(Login_page.this,"Email sent",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Login_page.this,"Failed...",Toast.LENGTH_SHORT).show();
                }

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        fba.addAuthStateListener(asl);
    }
}