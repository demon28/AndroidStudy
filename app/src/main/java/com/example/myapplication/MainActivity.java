package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String username;
    String userpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edit_name=findViewById(R.id.username);
        EditText edit_pwd=findViewById(R.id.userpwd);
        username=edit_name.getText().toString();
        userpwd=edit_pwd.getText().toString();

        Button btn=findViewById(R.id.btn_login);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"登录成功！"+username,Toast.LENGTH_LONG).show();

                Intent intent =new Intent(MainActivity.this,ConentActivity.class);

                startActivity(intent);


            }
        });


    }
}
