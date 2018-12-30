package com.pipel.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.et)
    EditText et;
    @BindView(R.id.one)
    ImageButton one;
    @BindView(R.id.two)
    ImageButton two;
    @BindView(R.id.three)
    ImageButton three;
    @BindView(R.id.four)
    ImageButton four;
    @BindView(R.id.five)
    ImageButton five;
    @BindView(R.id.six)
    ImageButton six;
    @BindView(R.id.seven)
    ImageButton seven;
    @BindView(R.id.eight)
    ImageButton eight;
    @BindView(R.id.nine)
    ImageButton nine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        et.setInputType(InputType.TYPE_NULL);
    }


    @OnClick(R.id.backspace)
    public void onBackSpaceClicked() {
        et.setText("");
    }


    @OnClick({R.id.one, R.id.two, R.id.three, R.id.four, R.id.five, R.id.six, R.id.seven, R.id.eight, R.id.nine})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.one:
                et.append("1");
                break;
            case R.id.two:
                et.append("2");
                break;
            case R.id.three:
                et.append("3");
                break;
            case R.id.four:
                et.append("4");
                break;
            case R.id.five:
                et.append("5");
                break;
            case R.id.six:
                et.append("6");
                break;
            case R.id.seven:
                et.append("7");
                break;
            case R.id.eight:
                et.append("8");
                break;
            case R.id.nine:
                et.append("9");
                break;
        }
    }
}
