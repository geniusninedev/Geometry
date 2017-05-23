package com.geniusnine.android.geometry.SurfaceArea;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.geniusnine.android.geometry.MainActivity;
import com.geniusnine.android.geometry.R;

import java.util.ArrayList;

public class BallSurfaceArea extends  android.support.v4.app.Fragment {

    EditText editTextRadius;
    Spinner spinnerBall;
    int valueOfFirst;
    TextView ballResult;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.activity_ball_surface_area, container, false);
        editTextRadius=(EditText)view.findViewById(R.id.editTextBallSurfaceRadius);
        spinnerBall=(Spinner)view.findViewById(R.id.spinnerBallSurfaceRadius);
        ballResult=(TextView) view.findViewById(R.id.textViewResultBallSurfaceArea);



        ArrayList area = new ArrayList();
        area.add("mile");
        area.add("yard");
        area.add("foot");
        area.add("inch");
        area.add("kilometer");
        area.add("meter");
        area.add("centimeter");
        area.add("milimeter");
        area.add("micrometer");
        area.add("nanometer");
        area.add("angstrom");


        Button calculate=(Button)view.findViewById(R.id.buttonCalculateBallSurfaceArea);
        Button clear=(Button)view.findViewById(R.id.buttonResetBallSurfaceArea);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, area);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerBall.setAdapter(dataAdapter);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BallSurface ballSurfaceArea=new BallSurface();

                hideKeyboard();

                if(editTextRadius.getText().toString().trim().equals("")){
                    editTextRadius.setError("Enter The Radius");
                }

                else{

                    if (spinnerBall.getSelectedItem().toString().trim().equals("mile")) {

                        valueOfFirst = Integer.parseInt(editTextRadius.getText().toString().trim());

                        ballResult.setVisibility(View.VISIBLE);

                        double result =  ballSurfaceArea.calculateSurfaceAreaOfBall(valueOfFirst);
                        ballResult.setText("Ball Surface Area : "+result+"  mile ^ 3");


                    }


                    if (spinnerBall.getSelectedItem().toString().trim().equals("yard")) {

                        valueOfFirst = Integer.parseInt(editTextRadius.getText().toString().trim());

                        ballResult.setVisibility(View.VISIBLE);

                        double result =  ballSurfaceArea.calculateSurfaceAreaOfBall(valueOfFirst);

                        ballResult.setText("Ball Surface Area :  "+result+"  yard ^ 3 ");



                    }
                    if (spinnerBall.getSelectedItem().toString().trim().equals("foot")) {

                        valueOfFirst = Integer.parseInt(editTextRadius.getText().toString().trim());

                        ballResult.setVisibility(View.VISIBLE);

                        double result =  ballSurfaceArea.calculateSurfaceAreaOfBall(valueOfFirst);
                        ballResult.setText("Ball Surface Area : "+result+"  foot ^ 3 ");


                    }
                    if (spinnerBall.getSelectedItem().toString().trim().equals("inch")) {


                        valueOfFirst = Integer.parseInt(editTextRadius.getText().toString().trim());
                        ballResult.setVisibility(View.VISIBLE);

                        double result =  ballSurfaceArea.calculateSurfaceAreaOfBall(valueOfFirst);
                        ballResult.setText("Ball Surface Area : "+result+"  inch ^ 3 ");
                    }

                    if (spinnerBall.getSelectedItem().toString().trim().equals("kilometer")) {


                        valueOfFirst = Integer.parseInt(editTextRadius.getText().toString().trim());

                        ballResult.setVisibility(View.VISIBLE);

                        double result =  ballSurfaceArea.calculateSurfaceAreaOfBall(valueOfFirst);
                        ballResult.setText("Ball Surface Area : "+result+"  kilometer ^ 3 ");



                    }
                    if (spinnerBall.getSelectedItem().toString().trim().equals("meter")) {

                        valueOfFirst = Integer.parseInt(editTextRadius.getText().toString().trim());
                        ballResult.setVisibility(View.VISIBLE);

                        double result =  ballSurfaceArea.calculateSurfaceAreaOfBall(valueOfFirst);
                        ballResult.setText("Ball Surface Area  : "+result+"  meter ^ 3 ");



                    }
                    if (spinnerBall.getSelectedItem().toString().trim().equals("centimeter")) {


                        valueOfFirst = Integer.parseInt(editTextRadius.getText().toString().trim());

                        ballResult.setVisibility(View.VISIBLE);

                        double result =  ballSurfaceArea.calculateSurfaceAreaOfBall(valueOfFirst);
                        ballResult.setText("Ball Surface Area  : "+result+ "  centimeter ^ 3 ");



                    }
                    if (spinnerBall.getSelectedItem().toString().trim().equals("milimeter")) {

                        valueOfFirst = Integer.parseInt(editTextRadius.getText().toString().trim());

                        ballResult.setVisibility(View.VISIBLE);

                        double result =  ballSurfaceArea.calculateSurfaceAreaOfBall(valueOfFirst);
                        ballResult.setText("Ball Surface Area  : "+result+ "  milimeter ^ 3 ");

                    }
                    if (spinnerBall.getSelectedItem().toString().trim().equals("micrometer")) {

                        valueOfFirst = Integer.parseInt(editTextRadius.getText().toString().trim());

                        ballResult.setVisibility(View.VISIBLE);

                        double result =  ballSurfaceArea.calculateSurfaceAreaOfBall(valueOfFirst);
                        ballResult.setText("Ball Surface Area  : "+result+ "  micrometer ^ 3 ");



                    }
                    if (spinnerBall.getSelectedItem().toString().trim().equals("nanometer")) {

                        valueOfFirst = Integer.parseInt(editTextRadius.getText().toString().trim());

                        ballResult.setVisibility(View.VISIBLE);

                        double result =  ballSurfaceArea.calculateSurfaceAreaOfBall(valueOfFirst);
                        ballResult.setText("Ball Surface Area  : "+result+ "  nanometer ^ 3 ");



                    }
                    if (spinnerBall.getSelectedItem().toString().trim().equals("angstrom")) {


                        valueOfFirst = Integer.parseInt(editTextRadius.getText().toString().trim());

                        ballResult.setVisibility(View.VISIBLE);

                        double result =  ballSurfaceArea.calculateSurfaceAreaOfBall(valueOfFirst);
                        ballResult.setText("Ball Surface Area : "+result+ "  angstrom ^ 3 ");



                    }

                }




            }



        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextRadius.setText("");
                ballResult.setVisibility(View.GONE);


            }
        });

        return view;
    }
    public void hideKeyboard() {
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity()
                .getSystemService(android.content.Context.INPUT_METHOD_SERVICE);

        inputMethodManager.hideSoftInputFromWindow(
                getActivity().getCurrentFocus()
                        .getWindowToken(), 0);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            Intent intent=new Intent(getActivity(),MainActivity.class);
            //finish();
            startActivity(intent);


        }


        return super.onOptionsItemSelected(item);
    }
}

