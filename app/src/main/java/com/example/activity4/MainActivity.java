package com.example.activity4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;

    EditText edEmail, edPassword;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mnDaftar)
        {
            Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSignIn);

        edEmail=findViewById(R.id.edEmail);

        edPassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edEmail.getText().toString();

                password = edPassword.getText().toString();

                String email ="admin@mail.com";

                String pass ="123";

                if (nama.equals(email) && password.equals(pass)) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Sukses",
                            Toast.LENGTH_LONG);

                    t.show();

                    Bundle b = new Bundle();

                    b.putString("a", nama.trim());
                    b.putString("b", password.trim());

                    Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
                    i.putExtras(b);
                    startActivity(i);


                }







                if(edEmail.getText().toString().equals("admin@mail.com")&&edPassword.getText().toString().equals("123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "LOGIN SUKSES || email : " + nama + " password : " + password + "", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (!edEmail.getText().toString().equals("admin@mail.com")&&edPassword.getText().toString().equals("123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            " Email salah ", Toast.LENGTH_SHORT);
                    t.show();
                }
                else if (!edPassword.getText().toString().equals("123")&&edEmail.getText().toString().equals("admin@mail.com")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            " Password salah ", Toast.LENGTH_SHORT);
                    t.show();
                }
                else{
                    Toast.makeText((getApplicationContext()), "Username atau Password Anda salah",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}