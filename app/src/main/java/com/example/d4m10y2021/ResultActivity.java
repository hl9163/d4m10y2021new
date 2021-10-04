package com.example.d4m10y2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView tv,tv2;
    String massage;
    String winnerName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv = (TextView) findViewById(R.id.textView);
        tv2= (TextView) findViewById(R.id.textView2);


        Intent gi = getIntent();
        int player1 = gi.getIntExtra("player1",0);
        int player2 = gi.getIntExtra("player2",0);
        int winner = gi.getIntExtra("winner",0);

        if(winner == 0){
            winnerName = "same score";
        }else if (winner == 1){
            winnerName = "blue";
        }
        else{
            winnerName="red";
        }

        tv.setText("winner is player number:"+winnerName);



        massage = "blue player got:"+player1+" red player got"+player2;
        tv2.setText(massage);




    }

    public void return1(View view) {
        finish();
    }
}