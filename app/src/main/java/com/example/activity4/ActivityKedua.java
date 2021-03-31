package com.example.activity4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {
    TextView txEmail, txPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txEmail = findViewById(R.id.textView2);

        txPassword = findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        txEmail.setText(email);

        txPassword.setText(pass);
    }
}