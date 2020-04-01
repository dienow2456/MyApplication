package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     TextView view_number;
     TextView tvResult;
     int intthamso1, intthamso2;
     String xuatmanhinh;
     String toantu ;
    Button btn_number0;
    Button btn_number1;
    Button btn_number2;
    Button btn_number3;
    Button btn_number4;
    Button btn_number5;
    Button btn_number6;
    Button btn_number7;
    Button btn_number8;
    Button btn_number9;

    Button btn_add;
    Button btn_multi;
    Button btn_div;
    Button btn_sub;
    Button btn_addorsub;

    Button btn_result;
    Button btn_clearall;
    Button btn_clear;
    Button btn_point;
    Button btn_delete;



    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickView();
    }
        public  void initWidget(){

        view_number=  findViewById(R.id.view_number);
        tvResult= findViewById(R.id.tvResult);

        btn_number0= findViewById(R.id.btn_number0);
        btn_number1= findViewById(R.id.btn_number1);
        btn_number2= findViewById(R.id.btn_number2);
        btn_number3= findViewById(R.id.btn_number3);
        btn_number4= findViewById(R.id.btn_number4);
        btn_number5= findViewById(R.id.btn_number5);
        btn_number6= findViewById(R.id.btn_number6);
        btn_number7= findViewById(R.id.btn_number7);
        btn_number8= findViewById(R.id.btn_number8);
        btn_number9= findViewById(R.id.btn_number9);

        btn_add= findViewById(R.id.btn_add);
        btn_addorsub= findViewById(R.id.btn_addorsub);
        btn_multi= findViewById(R.id.btn_multi);
        btn_div= findViewById(R.id.btn_div);
        btn_sub= findViewById(R.id.btn_sub);

        btn_clear= findViewById(R.id.btn_clear);
        btn_clearall= findViewById(R.id.btn_clearall);
        btn_result= findViewById(R.id.btn_result);
        btn_delete= findViewById(R.id.btn_delete);
        btn_point= findViewById(R.id.btn_point);

    }

    public void setEventClickView(){
        btn_number0.setOnClickListener(this);
        btn_number1.setOnClickListener(this);
        btn_number2.setOnClickListener(this);
        btn_number3.setOnClickListener(this);
        btn_number4.setOnClickListener(this);
        btn_number5.setOnClickListener(this);
        btn_number6.setOnClickListener(this);
        btn_number7.setOnClickListener(this);
        btn_number8.setOnClickListener(this);
        btn_number9.setOnClickListener(this);

        btn_add.setOnClickListener(this);
        btn_addorsub.setOnClickListener(this);
        btn_multi.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_sub.setOnClickListener(this);

        btn_clear.setOnClickListener(this);
        btn_clearall.setOnClickListener(this);
        btn_result.setOnClickListener(this);
        btn_delete.setOnClickListener(this);
        btn_point.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                if(xuatmanhinh=="0")
                        xuatmanhinh="";
                xuatmanhinh+=((Button)v).getText().toString();
                tvResult.setText(xuatmanhinh);
            case R.id.btn_sub:
                toantu = "-";
                intthamso1=Integer.parseInt(tvResult.getText().toString());
                if(view_number.getText()== " " )
            {
                view_number.setText(tvResult.getText()+" -");
                xuatmanhinh="0";
            }
                break;
            case R.id.btn_add:
                toantu = "+";
                intthamso1=Integer.parseInt(tvResult.getText().toString());
                if(view_number.getText()== " " )
                {
                view_number.setText(tvResult.getText()+" +");
                    xuatmanhinh="0";
                }
                break;
            case R.id.btn_addorsub:
                break;
            case R.id.btn_multi:
                toantu = "*";
                intthamso1=Integer.parseInt(tvResult.getText().toString());
                if(view_number.getText()== " " )
            {
                view_number.setText(tvResult.getText()+" *");
                xuatmanhinh="0";
            }
                break;
            case R.id.btn_div:
                toantu = "/";
                intthamso1=Integer.parseInt(tvResult.getText().toString());
                if(view_number.getText()== " " )
            {
                view_number.setText(tvResult.getText()+" /");
                xuatmanhinh="0";
            }
                break;
            case R.id.btn_clear:
                tvResult.setText("0");
                xuatmanhinh="0";
                break;
            case R.id.btn_clearall:
                tvResult.setText("0");
                view_number.setText("");
                xuatmanhinh="0";
                break;
            case R.id.btn_delete:
                if(tvResult.getText()=="") {
                    tvResult.setText("0");
                    xuatmanhinh="0";
                }else {
                    BaseInputConnection textFBaseInputConnection = new BaseInputConnection(tvResult, true);
                    textFBaseInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
                }
                break;
            case R.id.btn_result:
               intthamso2=Integer.parseInt(tvResult.getText().toString());
               float ketqua=0.0f;
               if(toantu=="+")
                   ketqua=intthamso1+intthamso2;
                else if(toantu=="-")
                    ketqua=intthamso1-intthamso2;
                else if(toantu=="*")
                    ketqua=intthamso1*intthamso2;
                else if(toantu=="/")
                    ketqua=intthamso1/intthamso2;
               tvResult.setText(String.valueOf(ketqua));
               view_number.setText("");
                xuatmanhinh="0";
                break;
            case R.id.btn_point:
                break;



        }
    }

}
