package com.example.onlinegroceryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import javax.annotation.Nullable;

public class Profile extends AppCompatActivity {

    TextView shopname,email,gst,mobile,add;
    FirebaseAuth fba;
    FirebaseFirestore db;
    String userId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        shopname=findViewById(R.id.shop_name);
        email=findViewById(R.id.email_address);
        gst=findViewById(R.id.gst_number);
        mobile=findViewById(R.id.mobile_no);
        add=findViewById(R.id.address);


        fba=FirebaseAuth.getInstance();
        db=FirebaseFirestore.getInstance();
        userId=fba.getCurrentUser().getUid();

        DocumentReference documentReference=db.collection("users").document(userId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                mobile.setText(documentSnapshot.getString("Mobile No"));
                shopname.setText(documentSnapshot.getString("Shop Name"));
                gst.setText(documentSnapshot.getString("GST No."));
                add.setText(documentSnapshot.getString("Address"));
                email.setText(documentSnapshot.getString("Email Id"));

            }
        });
    }
}
