package org.techtown.sampleorientation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int count;

    Button button;
    TextView textView_count;
    TextView textView_method;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView_count = findViewById(R.id.textView_count);
        textView_method = findViewById(R.id.textView_method);

        button.setOnClickListener(this);
        println("onCreate 호출됨");
    }

    @Override
    public void onClick(View view) {
        count++;
        textView_count.setText(String.valueOf(count));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        println("onRestart 호출됨");
    }

    @Override
    protected void onStart() {
        super.onStart();
        println("onStart");
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
        if(textView_method.getLineCount() > 30) {
            textView_method.setText(null);
        }

        long now  = System.currentTimeMillis();
        Date date = new Date(now);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String output = dateFormat.format(date);

        textView_method.append(data + " [" + output + "] \n");
    }
}