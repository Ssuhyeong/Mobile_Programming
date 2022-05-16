package org.techtown.samplelifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById (R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(this);
        println("onCreate 호출됨");
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

    protected void onRestart() {
        super.onRestart();
        println("onRestart 호출됨");
    }

    protected void onStart() {
        super.onStart();
        println("onStart 호출됨");
    }

    @Override
    protected void onResume() {
        super.onResume();
        println("onResume 호출됨");
    }

    @Override
    protected void onPause() {
        super.onPause();
        println("onPause 호출됨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        println("onStop 호출됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        println("onDestroy 호출됨");
    }

    public void println(String data) {
        if(textView.getLineCount() > 30) {
            textView.setText(null);
        }
        textView.append(data + "\n");
    }
}