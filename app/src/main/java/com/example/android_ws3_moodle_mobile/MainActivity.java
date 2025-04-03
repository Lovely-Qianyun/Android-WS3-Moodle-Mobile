package com.example.android_ws3_moodle_mobile;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity implements View.OnClickListener{

    EditText txt_UserName, txt_UserPW;
    Button btn_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Login = (Button)findViewById(R.id.btn_Login);
        txt_UserName = (EditText)findViewById(R.id.txt_UserName);
        txt_UserPW = (EditText)findViewById(R.id.txt_UserPW);

        // Register the Login button to click listener
        // Whenever the button is clicked, onClick is called
        btn_Login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if (v.getId() == R.id.btn_Login) {
            String uname = txt_UserName.getText().toString();
            String upassword = txt_UserPW.getText().toString();

            System.out.println( "@@@@@@@@@@@@@@@\n" +
                    "The Portal ID is: " + uname + "\n" +
                    "The Password is: " + upassword + "\n" +
                    "@@@@@@@@@@@@@@@" );
        }
    }
}