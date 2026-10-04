package kr.ac.kbu.logintest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.report1.R;

public class LoginActivity extends AppCompatActivity {

    EditText etId, etPw;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etId = findViewById(R.id.etId);
        etPw = findViewById(R.id.etPw);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = etId.getText().toString();
                String pw = etPw.getText().toString();

                if (id.length() == 0 || pw.length() == 0) {
                    Toast.makeText(LoginActivity.this, "데이터 입력 해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                String result = "아이디 : " + id + "  비밀번호 : " + pw;
                Toast.makeText(LoginActivity.this, result, Toast.LENGTH_LONG).show();
            }
        });
    }
}