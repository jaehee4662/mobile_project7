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

        String fullText1 = "모바일 프로그래밍 7조";
        SpannableString spannableString1 = new SpannableString(fullText1);
        String fullText2 = "부산광역시 버스 정보 앱";
        SpannableString spannableString2 = new SpannableString(fullText2);

        int startIndex1 = 4; // 시작 인덱스
        int endIndex1 = 9; // 끝 인덱스
        String colorHex1 = "#146C94"; // 변경할 색상을 16진수로 지정
        int color1 = Color.parseColor(colorHex1); // 16진수 색상을 int로 변환
        spannableString1.setSpan(new ForegroundColorSpan(color1), startIndex1, endIndex1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        int startIndex2 = 0; // 시작 인덱스
        int endIndex2 = 5; // 끝 인덱스
        String colorHex2 = "#146C94"; // 변경할 색상을 16진수로 지정
        int color2 = Color.parseColor(colorHex2); // 16진수 색상을 int로 변환
        spannableString2.setSpan(new ForegroundColorSpan(color2), startIndex2, endIndex2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        tv1.setText(spannableString1);
        tv2.setText(spannableString2);

    }


}