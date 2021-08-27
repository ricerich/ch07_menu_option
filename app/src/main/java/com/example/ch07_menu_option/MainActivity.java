package com.example.ch07_menu_option;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
{
//    LinearLayout baseLayout;
//    Button button1;

    EditText edtAngle;
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.ex1_relative);

//        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
//        button1 = (Button) findViewById(R.id.button1);
        edtAngle = (EditText) findViewById(R.id.edtAngle);
        iv1 = (ImageView) findViewById(R.id.imageView1);
    }

    //1.메뉴생성 함수 오버라이딩(부모 메소드를 재정의)
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //코딩~! 메뉴생성 코드

        //메뉴를 생성하는 방법 2가지
        //1.xml을 inflater를 사용해서 끼우는방법(강추)
        //2.only java 코드로만 만든 방법(비추)

        //1.xml을 inflater를 사용해서 끼우는방법(강추)
//        MenuInflater mInflater = getMenuInflater();
//        mInflater.inflate(R.menu.menu1, menu);

        //2.only java 코드로만 만든 방법(비추) - menu1.xml이 필요없다~!!
//        menu.add(0,1,0,"빨강");
//        menu.add(0,2,0,"초록");
//        menu.add(0,3,0,"파랑");
//
//        SubMenu subMenu = menu.addSubMenu("버튼변경>>");
//        subMenu.add(0,4,0,"버튼 45도 회전");
//        subMenu.add(0,5,0,"버튼 2배 확대");

        //제주도
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu_jeju, menu);

        return true;
    }

    float fAngle = 0.0f;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.itemRotate:

                String str = edtAngle.getText().toString();
                fAngle = fAngle + Float.parseFloat(str);
                iv1.setRotation(fAngle);
                return true;
            case R.id.item1:
                item.setChecked(true);
                iv1.setImageResource(R.drawable.jeju1);
                return true;
            case R.id.item2:
                item.setChecked(true);
                iv1.setImageResource(R.drawable.jeju2);
                return true;
            case R.id.item3:
                item.setChecked(true);
                iv1.setImageResource(R.drawable.jeju4);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //    //2.생성된 메뉴의 각 아이템에 이벤트 처리
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//
//        switch (item.getItemId()) {
////            case R.id.itemRed:
//            case 1:
//                baseLayout.setBackgroundColor(Color.RED);
//                return true;
////            case R.id.itemGreen:
//            case 2:
//                baseLayout.setBackgroundColor(Color.GREEN);
//                return true;
////            case R.id.itemBlue:
//            case 3:
//                baseLayout.setBackgroundColor(Color.BLUE);
//                return true;
////            case R.id.subRotate:
//            case 4:
//                button1.setRotation(45);
//                return true;
////            case R.id.subSize:
//            case 5:
//                button1.setScaleX(2);
//                return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}