package kr.ac.kbu.temperatureconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reoport2.R;

public class MainActivity extends AppCompatActivity {

    EditText etCelsius, etFahrenheit;
    Button btnToFahrenheit, btnToCelsius;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCelsius = findViewById(R.id.etCelsius);
        etFahrenheit = findViewById(R.id.etFahrenheit);
        btnToFahrenheit = findViewById(R.id.btnToFahrenheit);
        btnToCelsius = findViewById(R.id.btnToCelsius);
        tvResult = findViewById(R.id.tvResult);

        // 섭씨 -> 화씨 계산
        btnToFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = etCelsius.getText().toString();

                if (input.length() == 0) {
                    Toast.makeText(MainActivity.this, "섭씨 온도를 입력하세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                double celsius = Double.parseDouble(input);
                double fahrenheit = (9.0 / 5.0 * celsius) + 32;

                String result = String.format("섭씨 온도 %.2f도는\n화씨 온도로 %.2f도 입니다.", celsius, fahrenheit);
                tvResult.setText(result);
            }
        });

        // 화씨 -> 섭씨 계산
        btnToCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = etFahrenheit.getText().toString();

                if (input.length() == 0) {
                    Toast.makeText(MainActivity.this, "화씨 온도를 입력하세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                double fahrenheit = Double.parseDouble(input);
                double celsius = 5.0 / 9.0 * (fahrenheit - 32);

                String result = String.format("화씨 온도 %.2f도는\n섭씨 온도로 %.2f도 입니다.", fahrenheit, celsius);
                tvResult.setText(result);
            }
        });
    }
}