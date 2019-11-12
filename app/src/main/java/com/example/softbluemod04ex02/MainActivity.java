package com.example.softbluemod04ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn_iniciar);
        textView = findViewById(R.id.txt_contador);

    }

    public void iniciarContador(View view) {
        CounterTask task = new CounterTask(button, textView);
        task.execute(0);
    }
}
