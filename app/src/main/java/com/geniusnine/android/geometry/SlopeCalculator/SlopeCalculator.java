package com.geniusnine.android.geometry.SlopeCalculator;

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

public class SlopeCalculator extends AppCompatActivity {
    EditText editTextX1, editTextX2, editTextY1, editTextY2;

    TextView textViewResultSlope;
    int valueOfFirst,valueOfSecond,valueOfThird,valueOfFourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slope_calculator);

        editTextX1 = (EditText) findViewById(R.id.editTextSlope1);
        editTextX2 = (EditText) findViewById(R.id.editTextSlope2);
        editTextY1 = (EditText) findViewById(R.id.editTextSlope3);
        editTextY2 = (EditText) findViewById(R.id.editTextSlope4);

        textViewResultSlope = (TextView) findViewById(R.id.textViewResultSlope);

        Button calculate = (Button) findViewById(R.id.buttonCalculateSlope);
        Button clear = (Button) findViewById(R.id.buttonResetSlope);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SlopeCalci slopeCalci = new SlopeCalci();

                InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

                if (editTextX1.getText().toString().trim().equals("")) {
                    editTextX1.setError("Enter The X1 Axis");
                }
                if (editTextX2.getText().toString().trim().equals("")) {
                    editTextX2.setError("Enter The X2 Axis");
                }
                if (editTextY1.getText().toString().trim().equals("")) {
                    editTextY1.setError("Enter The Y1 Axis");
                }
                if (editTextY2.getText().toString().trim().equals("")) {
                    editTextY2.setError("Enter The Y2 Axis");
                }
                else {

                    valueOfFirst = Integer.parseInt(editTextX1.getText().toString().trim());
                    valueOfSecond = Integer.parseInt(editTextX2.getText().toString().trim());
                    valueOfThird = Integer.parseInt(editTextY1.getText().toString().trim());
                    valueOfFourth = Integer.parseInt(editTextY2.getText().toString().trim());

                    textViewResultSlope.setVisibility(View.VISIBLE);


                    double result =  slopeCalci.SlopeCalciCalci(valueOfFirst,valueOfSecond,valueOfThird,valueOfFourth);
                    textViewResultSlope.setText("Slope : "+result);
                }
            }


        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextX1.setText("");
                editTextX2.setText("");
                editTextY1.setText("");
                editTextY2.setText("");

                textViewResultSlope.setVisibility(View.GONE);


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
            Intent intent=new Intent(SlopeCalculator.this,MainActivity.class);
            //    finish();
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:

                Intent intent=new Intent(SlopeCalculator.this,MainActivity.class);
                finish();
                startActivity(intent);

                return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}

