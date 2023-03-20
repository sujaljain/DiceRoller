package com.example.diceroller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonRollDice;
    TextView textViewDiceResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRollDice = (Button) findViewById(R.id.button_roll_dice);
        textViewDiceResult = (TextView) findViewById(R.id.textView_dice_result);

        buttonRollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int diceResult = rand.nextInt(6) + 1;
                textViewDiceResult.setText(String.valueOf(diceResult));
            }
        });
    }
}
