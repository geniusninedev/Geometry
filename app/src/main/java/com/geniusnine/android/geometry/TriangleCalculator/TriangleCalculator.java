package com.geniusnine.android.geometry.TriangleCalculator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.geniusnine.android.geometry.MainActivity;
import com.geniusnine.android.geometry.R;

public class TriangleCalculator extends AppCompatActivity {
    EditText firstSide,secondSide,thirdSide;
    int valueOfFirst,valueOfSecond,valueOfThird;
    TextView resultOne,resultTriangle;
    int side1s; int side2s; int side3s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle_calculator);

        firstSide=(EditText)findViewById(R.id.editTextFirstSide);
        secondSide=(EditText)findViewById(R.id.editTextSecondSide);
        thirdSide=(EditText)findViewById(R.id.editTextThirdSide);

        resultOne=(TextView)findViewById(R.id.textViewResult);
        resultTriangle=(TextView)findViewById(R.id.textViewResultTriangle);

        Button calculate=(Button)findViewById(R.id.buttonCalculate);
        Button clear=(Button)findViewById(R.id.buttonReset);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TriangleCalci triangleCalci=new TriangleCalci();

                InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

                if(firstSide.getText().toString().trim().equals("")){
                    firstSide.setError("Enter The First side");
                }
                if(secondSide.getText().toString().trim().equals("")){
                    secondSide.setError("Enter The Second Side");
                }
                if(thirdSide.getText().toString().trim().equals("")){
                    thirdSide.setError("Enter The Third Side");
                }
                else{

                    valueOfFirst = Integer.parseInt(firstSide.getText().toString().trim());
                    valueOfSecond = Integer.parseInt(secondSide.getText().toString().trim());
                    valueOfThird = Integer.parseInt(thirdSide.getText().toString().trim());


                    resultOne.setVisibility(View.VISIBLE);
                    resultTriangle.setVisibility(View.VISIBLE);

                    if(valueOfFirst+valueOfSecond>valueOfThird){
                        resultOne.setText("The triangle is true!");

                    }
                    else {
                        resultOne.setText("The triangle is False!");
                    }

                    side1s = valueOfFirst * valueOfFirst;
                    side2s = valueOfSecond * valueOfSecond;
                    side3s = valueOfThird * valueOfThird;
                    resultTriangle.setVisibility(View.VISIBLE);

                    if(side1s + side2s == side3s) {
                        resultTriangle.setText("The Triangle is...Right");
                    }
                    else if (side1s + side2s > side3s) {


                        resultTriangle.setText("The Triangle is...Acute" );

                    } else if(side1s + side2s < side3s) {


                        resultTriangle.setText("The Triangle is...Obtuse" );

                    } else {


                        resultTriangle.setText("The Triangle is...null" );


                    }






                }
            }


        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstSide.setText("");
                secondSide.setText("");
                thirdSide.setText("");

                resultOne.setVisibility(View.GONE);
                resultTriangle.setVisibility(View.GONE);

            }
        });



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            Intent intent=new Intent(TriangleCalculator.this,MainActivity.class);
            //    finish();
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:

                Intent intent=new Intent(TriangleCalculator.this,MainActivity.class);
                finish();
                startActivity(intent);

                return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
