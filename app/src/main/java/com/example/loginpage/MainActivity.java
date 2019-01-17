package com.example.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unm=((EditText)findViewById(R.id.editText2)).getText().toString();
                String pwd=((EditText)findViewById(R.id.editText3)).getText().toString();
                if(unm.equalsIgnoreCase("kishansinghverma@gmail.com"))
                {
                    if(pwd.equals("145789632"))
                        Toast.makeText(MainActivity.this, "Login Successfull!!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this, "Login Failed!\nWrong Password!!", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Login Failed!\nWrong User Name!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
