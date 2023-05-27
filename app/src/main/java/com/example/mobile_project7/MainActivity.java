package com.example.mobile_project7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnMap;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMap = (Button) findViewById(R.id.btnMap);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);

        String fullText = "모바일 프로그래밍 7조";
        SpannableString spannableString = new SpannableString(fullText);



        int startIndex = 8; // 시작 인덱스
        int endIndex = 10; // 끝 인덱스
        String colorHex = "#146C94"; // 변경할 색상을 16진수로 지정
        int color = Color.parseColor(colorHex); // 16진수 색상을 int로 변환
        spannableString.setSpan(new ForegroundColorSpan(color), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        tv1.setText(spannableString);

    }


}