package com.geniusnine.android.geometry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class CircleAreaCal extends AppCompatActivity {

    EditText editTextCircleRadius;
    Spinner spinnerCircleAreaRadius,spinnerCircleAreaDiameter,spinnerCircleAreaCircumfernce,spinnerCircleArea;
    int valueOfFirst;
    EditText editTextRadius,editTextDiameter,editTextCircumference,editTextArea;
    TextView circleAreaResult;

    double RadiusValue,DiametrValue,CircumferenceValue,AreaValue;

    DecimalFormat formatter=new DecimalFormat("##.#####");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_area);

        editTextRadius=(EditText) findViewById(R.id.editTextRadius);
        editTextDiameter=(EditText) findViewById(R.id.editTextDiameter);
        editTextCircumference=(EditText) findViewById(R.id.editTextCircumference);
        editTextArea=(EditText) findViewById(R.id.editTextArea);






        Button calculate=(Button)findViewById(R.id.buttonCalculateCircle);
        Button clear=(Button)findViewById(R.id.buttonClearCircle);
       calculate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               CircleCalculator circleCalculator=new CircleCalculator();


               if (TextUtils.isEmpty(editTextRadius.getText().toString().trim())&&TextUtils.isEmpty(editTextDiameter.getText().toString().trim())
                       &&TextUtils.isEmpty(editTextCircumference.getText().toString().trim())  &&TextUtils.isEmpty(editTextArea.getText().toString().trim())) {

                   Toast.makeText(getApplicationContext(),"Please provide any One value",Toast.LENGTH_SHORT).show();

                   return;
               }

               if (TextUtils.isEmpty(editTextRadius.getText().toString().trim())&&TextUtils.isEmpty(editTextDiameter.getText().toString().trim())
                       &&TextUtils.isEmpty(editTextCircumference.getText().toString().trim()) ){

                   Toast.makeText(getApplicationContext(),"Please provide any One value",Toast.LENGTH_SHORT).show();
                   AreaValue = Double.parseDouble(editTextArea.getText().toString().trim());


                   double resultDecay = circleCalculator.calculateRadiusFromArea(AreaValue);
                   double resultDecayConstant = circleCalculator.calculateDiameterFromArea(AreaValue);
                   double resultDecayConstant1 = circleCalculator.calculateCircumferenceFromArea(AreaValue);

                   editTextRadius.setText(String.valueOf(resultDecay));
                   editTextDiameter.setText(String.valueOf(resultDecayConstant));
                   editTextCircumference.setText(String.valueOf(resultDecayConstant1));
                   return;
               }
               if (TextUtils.isEmpty(editTextDiameter.getText().toString().trim())&&TextUtils.isEmpty(editTextCircumference.getText().toString().trim())
                       &&TextUtils.isEmpty(editTextArea.getText().toString().trim())){

                   Toast.makeText(getApplicationContext(),"Please provide any One value",Toast.LENGTH_SHORT).show();
                   RadiusValue = Double.parseDouble(editTextRadius.getText().toString().trim());


                   double resultDecay = circleCalculator.calculateDiameterFromRadius(RadiusValue);
                   double resultDecayConstant = circleCalculator.calculateCircumferenceFromRadius(RadiusValue);
                   double resultDecayConstant1 = circleCalculator.calculateAreaFromRadius(RadiusValue);

                   editTextDiameter.setText(String.valueOf(resultDecay));
                   editTextCircumference.setText(String.valueOf(resultDecayConstant));
                   editTextArea.setText(String.valueOf(resultDecayConstant1));
                   return;
               }
               if (TextUtils.isEmpty(editTextRadius.getText().toString().trim())&&TextUtils.isEmpty(editTextCircumference.getText().toString().trim())
                       &&TextUtils.isEmpty(editTextArea.getText().toString().trim())){
                   Toast.makeText(getApplicationContext(),"Please provide any One value",Toast.LENGTH_SHORT).show();
                   DiametrValue = Double.parseDouble(editTextDiameter.getText().toString().trim());


                   double resultDecay = circleCalculator.calculateRadiusFromDiamter(DiametrValue);
                   double resultDecayConstant = circleCalculator.calculateCircumferenceFromDiameter(DiametrValue);
                   double resultDecayConstant1 = circleCalculator.calculateAreaFromDiameter(DiametrValue);

                   editTextRadius.setText(String.valueOf(resultDecay));
                   editTextCircumference.setText(String.valueOf(resultDecayConstant));
                   editTextArea.setText(String.valueOf(resultDecayConstant1));
                   return;
               }


               if (TextUtils.isEmpty(editTextRadius.getText().toString().trim())&&TextUtils.isEmpty(editTextDiameter.getText().toString().trim())
                       &&TextUtils.isEmpty(editTextArea.getText().toString().trim())){
                   Toast.makeText(getApplicationContext(),"Please provide any One value",Toast.LENGTH_SHORT).show();
                   CircumferenceValue = Double.parseDouble(editTextCircumference.getText().toString().trim());


                   double resultDecay = circleCalculator.calculateRadiusFromCircumference(CircumferenceValue);
                   double resultDecayConstant = circleCalculator.calculateDiameterFromcircumference(CircumferenceValue);
                   double resultDecayConstant1 = circleCalculator.calculateAreaFromCircumference(CircumferenceValue);

                   editTextRadius.setText(String.valueOf(resultDecay));
                   editTextDiameter.setText(String.valueOf(resultDecayConstant));
                   editTextArea.setText(String.valueOf(resultDecayConstant1));
                   return;
               }

               if(!editTextRadius.getText().toString().trim().equals("") && !editTextCircumference.getText().toString().trim().equals("") &&
                       !editTextDiameter.getText().toString().trim().equals("")&&  !editTextArea.getText().toString().trim().equals("")){
                   Toast.makeText(getApplicationContext(),"Please provide any One values",Toast.LENGTH_SHORT).show();
                   return;
               }

               if(!editTextRadius.getText().toString().trim().equals("") && !editTextCircumference.getText().toString().trim().equals("") &&
                       !editTextDiameter.getText().toString().trim().equals("")&&  editTextArea.getText().toString().trim().equals("") ){
                   Toast.makeText(getApplicationContext(),"Please provide any One values",Toast.LENGTH_SHORT).show();
                   return;
               }

               if(editTextRadius.getText().toString().trim().equals("") && !editTextCircumference.getText().toString().trim().equals("") &&
                       !editTextDiameter.getText().toString().trim().equals("") && !editTextArea.getText().toString().trim().equals("")){
                   Toast.makeText(getApplicationContext(),"Please provide any One values",Toast.LENGTH_SHORT).show();
                   return;

               }
               if(!editTextRadius.getText().toString().trim().equals("") && editTextCircumference.getText().toString().trim().equals("") &&
                       !editTextDiameter.getText().toString().trim().equals("")  && !editTextArea.getText().toString().trim().equals("")){
                   Toast.makeText(getApplicationContext(),"Please provide any One values",Toast.LENGTH_SHORT).show();
                   return;
               }

               if(!editTextRadius.getText().toString().trim().equals("") && !editTextCircumference.getText().toString().trim().equals("") &&
                       editTextDiameter.getText().toString().trim().equals("")&&  editTextArea.getText().toString().trim().equals("")){
                   Toast.makeText(getApplicationContext(),"Please provide any One values",Toast.LENGTH_SHORT).show();
                   return;
               }
               if(!editTextRadius.getText().toString().trim().equals("") && editTextCircumference.getText().toString().trim().equals("") &&
                       !editTextDiameter.getText().toString().trim().equals("")&&  editTextArea.getText().toString().trim().equals("")){
                   Toast.makeText(getApplicationContext(),"Please provide any One values",Toast.LENGTH_SHORT).show();
                   return;
               }
               if(!editTextDiameter.getText().toString().trim().equals("") && !editTextCircumference.getText().toString().trim().equals("") &&
                       editTextRadius.getText().toString().trim().equals("")&&  editTextArea.getText().toString().trim().equals("")){
                   Toast.makeText(getApplicationContext(),"Please provide any One values",Toast.LENGTH_SHORT).show();
                   return;
               }
               if(!editTextDiameter.getText().toString().trim().equals("") && editTextCircumference.getText().toString().trim().equals("") &&
                       editTextRadius.getText().toString().trim().equals("")&&  !editTextArea.getText().toString().trim().equals("")){
                   Toast.makeText(getApplicationContext(),"Please provide any One values",Toast.LENGTH_SHORT).show();
                   return;
               }

               if(!editTextDiameter.getText().toString().trim().equals("") && editTextCircumference.getText().toString().trim().equals("") &&
                       editTextRadius.getText().toString().trim().equals("")&&  !editTextArea.getText().toString().trim().equals("")){
                   Toast.makeText(getApplicationContext(),"Please provide any One values",Toast.LENGTH_SHORT).show();
                   return;
               }

               if(!editTextDiameter.getText().toString().trim().equals("") && !editTextCircumference.getText().toString().trim().equals("") &&
                       editTextRadius.getText().toString().trim().equals("")&&  !editTextArea.getText().toString().trim().equals("")){
                   Toast.makeText(getApplicationContext(),"Please provide any One values",Toast.LENGTH_SHORT).show();
                   return;
               }

               if(!editTextDiameter.getText().toString().trim().equals("") && editTextCircumference.getText().toString().trim().equals("") &&
                       !editTextRadius.getText().toString().trim().equals("")&&  !editTextArea.getText().toString().trim().equals("")){
                   Toast.makeText(getApplicationContext(),"Please provide any One values",Toast.LENGTH_SHORT).show();
                   return;
               }

               if(editTextDiameter.getText().toString().trim().equals("") && !editTextCircumference.getText().toString().trim().equals("") &&
                       !editTextRadius.getText().toString().trim().equals("")&&  !editTextArea.getText().toString().trim().equals("")){
                   Toast.makeText(getApplicationContext(),"Please provide any One values",Toast.LENGTH_SHORT).show();
                   return;
               }

           }
       });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextRadius.setText("");
                editTextDiameter.setText("");
                editTextCircumference.setText("");
                editTextArea.setText("");
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
            Intent intent=new Intent(CircleAreaCal.this,MainActivity.class);
            //    finish();
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:

                Intent intent=new Intent(CircleAreaCal.this,MainActivity.class);
                finish();
                startActivity(intent);

                return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}


