package com.example.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private static final String TAG = "EmailPassword";

    EditText username,email,password;
    Button register,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        mAuth = FirebaseAuth.getInstance();
        if (mAuth.getCurrentUser() != null){
            startActivity(new Intent(RegistrationActivity.this,AttractionActivity.class));
            finish();
        }
        setContentView(R.layout.activity_registration);

        username = findViewById(R.id.reg_name);
        email = findViewById(R.id.reg_email);
        password = findViewById(R.id.reg_password);
        register = findViewById(R.id.reg_butt1);
        login = findViewById(R.id.reg_butt2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));
                finish();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });
    }
    private void signup(){
        Log.d(TAG, "signUp" + email);
        if(!validateForm()){
            return;
        }
        String name = username.getText().toString();
        String mail = email.getText().toString();
        String pass = password.getText().toString();

        mAuth.createUserWithEmailAndPassword(mail,pass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(RegistrationActivity.this,"Succesfully Registered",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RegistrationActivity.this,AttractionActivity.class));
                    finish();
                }
                else{
                    Log.w(TAG,"RegistrationWithEmail:Failed",task.getException());
                    Toast.makeText(RegistrationActivity.this,"Not Registered",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean validateForm() {
        boolean valid = true;

        String name = username.getText().toString();
        if (TextUtils.isEmpty(name)) {
            username.setError("It is required");
            valid = false;
        } else {
            username.setError(null);
        }

        String mail = email.getText().toString();
        if (TextUtils.isEmpty(mail)) {
            email.setError("It is required");
            valid = false;
        } else {
            email.setError(null);
        }

        String pass = password.getText().toString();
        if (TextUtils.isEmpty(pass)) {
            password.setError("It is required");
            valid = false;
        } else {
            password.setError(null);
        }
        return valid;
    }
}