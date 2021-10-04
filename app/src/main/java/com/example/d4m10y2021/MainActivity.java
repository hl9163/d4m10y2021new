package com.example.d4m10y2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
    Button butt,butt2,enterResult;
    int bluePlayer, redPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butt = (Button) findViewById(R.id.button);
        butt2 = (Button) findViewById(R.id.button2);
        enterResult = (Button) findViewById(R.id.button3);

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bluePlayer++;
                System.out.println(bluePlayer);

            }
        });
        butt2.setOnLongClickListener(this);


    }

    @Override
    public boolean onLongClick(View v) {
        redPlayer +=2;
        System.out.println(redPlayer);

        return false;
    }

    public void move(View view) {
        Intent si = new Intent(this,ResultActivity.class);
        si.putExtra("player1", bluePlayer);
        si.putExtra("player2", redPlayer);
        if (redPlayer > bluePlayer){
            si.putExtra("winner",2);
        }
        else if (redPlayer < bluePlayer){
            si.putExtra("winner",1);

        }else{
            si.putExtra("winner",0);
        }

        bluePlayer =0;
        redPlayer =0;
        startActivity(si);
    }
}