package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    TextView headerText;

    int PLAYER_O=0;
    int PLAYER_X=1;

    int activePlayer=PLAYER_O;

    int[] filledPos={-1,-1,-1,-1,-1,-1,-1,-1,-1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headerText=findViewById(R.id.header_text);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);




    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onClick(View v) {
        Button clickedBtn=findViewById(v.getId());
        int clikedTag= Integer.parseInt(v.getTag().toString());

        if (filledPos[clikedTag]!=-1){
            return;
        }


        filledPos[clikedTag]=activePlayer;
        if (activePlayer==PLAYER_O){
            clickedBtn.setText("0");
            clickedBtn.setBackground(getDrawable(R.color.holo_orange_light));
            activePlayer=PLAYER_X;
            headerText.setText("X Turn");
        }else{
            clickedBtn.setText("X");
            clickedBtn.setBackground(getDrawable(R.color.holo_red_dark));
            activePlayer=PLAYER_O;
            headerText.setText("O Turn");
        }

    }
}