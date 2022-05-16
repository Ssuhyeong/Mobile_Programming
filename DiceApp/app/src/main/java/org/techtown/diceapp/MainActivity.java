package org.techtown.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Random;



public class MainActivity extends AppCompatActivity {

    private RadioGroup choiceDice;
    RadioButton dice_one;

    Button throwDice;
    int whichRadioButton = 6;

    ImageView diceimage1;
    ImageView diceimage2;
    ImageView diceimage3;
    ImageView diceimage4;
    ImageView diceimage5;
    ImageView diceimage6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        choiceDice = findViewById(R.id.choicedice);
        dice_one = findViewById(R.id.dice_one);
        throwDice = findViewById(R.id.throwdice);
        diceimage1 = findViewById(R.id.diceimage1);
        diceimage2 = findViewById(R.id.diceimage2);
        diceimage3 = findViewById(R.id.diceimage3);
        diceimage4 = findViewById(R.id.diceimage4);
        diceimage5 = findViewById(R.id.diceimage5);
        diceimage6 = findViewById(R.id.diceimage6);


        choiceDice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.dice_one){
                    whichRadioButton = 1;
                    diceimage1.setVisibility(View.VISIBLE);
                    diceimage2.setVisibility(View.INVISIBLE);
                    diceimage3.setVisibility(View.INVISIBLE);
                    diceimage4.setVisibility(View.INVISIBLE);
                    diceimage5.setVisibility(View.INVISIBLE);
                    diceimage6.setVisibility(View.INVISIBLE);
                }
                else if (checkedId == R.id.dice_two) {
                    whichRadioButton = 2;
                    diceimage1.setVisibility(View.VISIBLE);
                    diceimage2.setVisibility(View.VISIBLE);
                    diceimage3.setVisibility(View.INVISIBLE);
                    diceimage4.setVisibility(View.INVISIBLE);
                    diceimage5.setVisibility(View.INVISIBLE);
                    diceimage6.setVisibility(View.INVISIBLE);
                }
                else if (checkedId == R.id.dice_three) {
                    whichRadioButton = 3;
                    diceimage1.setVisibility(View.VISIBLE);
                    diceimage2.setVisibility(View.VISIBLE);
                    diceimage3.setVisibility(View.VISIBLE);
                    diceimage4.setVisibility(View.INVISIBLE);
                    diceimage5.setVisibility(View.INVISIBLE);
                    diceimage6.setVisibility(View.INVISIBLE);
                }
                else if (checkedId == R.id.dice_four) {
                    whichRadioButton = 4;
                    diceimage1.setVisibility(View.VISIBLE);
                    diceimage2.setVisibility(View.VISIBLE);
                    diceimage3.setVisibility(View.VISIBLE);
                    diceimage4.setVisibility(View.VISIBLE);
                    diceimage5.setVisibility(View.INVISIBLE);
                    diceimage6.setVisibility(View.INVISIBLE);
                }
                else if (checkedId == R.id.dice_five) {
                    whichRadioButton = 5;
                    diceimage1.setVisibility(View.VISIBLE);
                    diceimage2.setVisibility(View.VISIBLE);
                    diceimage3.setVisibility(View.VISIBLE);
                    diceimage4.setVisibility(View.VISIBLE);
                    diceimage5.setVisibility(View.VISIBLE);
                    diceimage6.setVisibility(View.INVISIBLE);
                }
                else if (checkedId == R.id.dice_six) {
                    whichRadioButton = 6;
                    diceimage1.setVisibility(View.VISIBLE);
                    diceimage2.setVisibility(View.VISIBLE);
                    diceimage3.setVisibility(View.VISIBLE);
                    diceimage4.setVisibility(View.VISIBLE);
                    diceimage5.setVisibility(View.VISIBLE);
                    diceimage6.setVisibility(View.VISIBLE);
                }
            }
        });

        throwDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();

                int numberOfDice = 1;
                int numberOfDice2 = 1;
                int numberOfDice3 = 1;
                int numberOfDice4 = 1;
                int numberOfDice5 = 1;
                int numberOfDice6 = 1;

                if (whichRadioButton == 1)
                    numberOfDice = random.nextInt(6) + 1;
                else if (whichRadioButton == 2) {
                    numberOfDice = random.nextInt(6) + 1;
                    numberOfDice2 = random.nextInt(6) + 1;
                }
                else if (whichRadioButton == 3) {
                    numberOfDice = random.nextInt(6) + 1;
                    numberOfDice2 = random.nextInt(6) + 1;
                    numberOfDice3 = random.nextInt(6) + 1;
                }
                else if (whichRadioButton == 4) {
                    numberOfDice = random.nextInt(6) + 1;
                    numberOfDice2 = random.nextInt(6) + 1;
                    numberOfDice3 = random.nextInt(6) + 1;
                    numberOfDice4 = random.nextInt(6) + 1;
                }
                else if (whichRadioButton == 5) {
                    numberOfDice = random.nextInt(6) + 1;
                    numberOfDice2 = random.nextInt(6) + 1;
                    numberOfDice3 = random.nextInt(6) + 1;
                    numberOfDice4 = random.nextInt(6) + 1;
                    numberOfDice5 = random.nextInt(6)  +1;
                }
                else {
                    numberOfDice = random.nextInt(6) + 1;
                    numberOfDice2 = random.nextInt(6) + 1;
                    numberOfDice3 = random.nextInt(6) + 1;
                    numberOfDice4 = random.nextInt(6) + 1;
                    numberOfDice5 = random.nextInt(6) + 1;
                    numberOfDice6 = random.nextInt(6) + 1;
                }

                if (whichRadioButton == 1){
                    switch (numberOfDice){
                        case 1:
                            diceimage1.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage1.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage1.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage1.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage1.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage1.setImageResource(R.drawable.diceimage_six);
                            break;
                    }
                }

                if(whichRadioButton == 2){
                    switch (numberOfDice) {
                        case 1:
                            diceimage1.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage1.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage1.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage1.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage1.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage1.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice2) {
                        case 1:
                            diceimage2.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage2.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage2.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage2.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage2.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage2.setImageResource(R.drawable.diceimage_six);
                            break;
                    }
                }

                if(whichRadioButton == 3){
                    switch (numberOfDice) {
                        case 1:
                            diceimage1.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage1.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage1.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage1.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage1.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage1.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice2) {
                        case 1:
                            diceimage2.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage2.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage2.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage2.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage2.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage2.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice3) {
                        case 1:
                            diceimage3.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage3.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage3.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage3.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage3.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage3.setImageResource(R.drawable.diceimage_six);
                            break;
                    }
                }

                if(whichRadioButton == 4){
                    switch (numberOfDice) {
                        case 1:
                            diceimage1.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage1.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage1.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage1.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage1.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage1.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice2) {
                        case 1:
                            diceimage2.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage2.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage2.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage2.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage2.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage2.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice3) {
                        case 1:
                            diceimage3.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage3.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage3.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage3.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage3.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage3.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice4) {
                        case 1:
                            diceimage4.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage4.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage4.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage4.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage4.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage4.setImageResource(R.drawable.diceimage_six);
                            break;
                    }
                }

                if(whichRadioButton == 5){
                    switch (numberOfDice) {
                        case 1:
                            diceimage1.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage1.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage1.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage1.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage1.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage1.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice2) {
                        case 1:
                            diceimage2.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage2.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage2.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage2.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage2.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage2.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice3) {
                        case 1:
                            diceimage3.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage3.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage3.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage3.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage3.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage3.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice4) {
                        case 1:
                            diceimage4.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage4.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage4.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage4.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage4.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage4.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice5) {
                        case 1:
                            diceimage5.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage5.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage5.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage5.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage5.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage5.setImageResource(R.drawable.diceimage_six);
                            break;
                    }
                }

                if(whichRadioButton == 6){
                    switch (numberOfDice) {
                        case 1:
                            diceimage1.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage1.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage1.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage1.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage1.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage1.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice2) {
                        case 1:
                            diceimage2.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage2.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage2.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage2.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage2.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage2.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice3) {
                        case 1:
                            diceimage3.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage3.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage3.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage3.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage3.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage3.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice4) {
                        case 1:
                            diceimage4.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage4.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage4.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage4.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage4.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage4.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice5) {
                        case 1:
                            diceimage5.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage5.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage5.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage5.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage5.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage5.setImageResource(R.drawable.diceimage_six);
                            break;
                    }

                    switch (numberOfDice6) {
                        case 1:
                            diceimage6.setImageResource(R.drawable.diceimage_one);
                            break;
                        case 2:
                            diceimage6.setImageResource(R.drawable.diceimage_two);
                            break;
                        case 3:
                            diceimage6.setImageResource(R.drawable.diceimage_three);
                            break;
                        case 4:
                            diceimage6.setImageResource(R.drawable.diceimage_four);
                            break;
                        case 5:
                            diceimage6.setImageResource(R.drawable.diceimage_five);
                            break;
                        case 6:
                            diceimage6.setImageResource(R.drawable.diceimage_six);
                            break;
                    }
                }
            }
        });
    }
}