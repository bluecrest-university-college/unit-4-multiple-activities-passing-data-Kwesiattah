package com.example.assignment4app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView title, label;
    private EditText enterpassword;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView) findViewById(R.id.titleID);
        label = (TextView) findViewById(R.id.labelID);
        enterpassword = (EditText) findViewById(R.id.passID);
        login = (Button) findViewById(R.id.loginID);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String password = enterpassword.getText().toString();

                if (password.contains("@")){
                    label.setText("VALID");
                    label.setBackgroundColor(getResources().getColor(R.color.valid));
                } else if (password.isEmpty()){
                    enterpassword.setError("Field is required");
                }else {
                    label.setText("INVALID");
                    label.setBackgroundColor(getResources().getColor(R.color.invalid));
                }
            }
        });

    }
}
