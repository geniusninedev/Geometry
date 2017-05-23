package com.geniusnine.android.geometry.AreaCalculator;

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

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CircleArea extends android.support.v4.app.Fragment {

        EditText editTextCircleRadius;
        Spinner spinnerCircleAreaRadius;
        int valueOfFirst;
        TextView circleAreaResult;
        DecimalFormat formatter=new DecimalFormat("##.#####");
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.activity_circle_area_cal, container, false);

        editTextCircleRadius=(EditText)view.findViewById(R.id.editTextCircleAreaRadius);
        spinnerCircleAreaRadius=(Spinner)view.findViewById(R.id.spinnerCircleAreaRadius);
        circleAreaResult=(TextView) view.findViewById(R.id.textViewResultCircleArea);

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


        Button calculate=(Button)view.findViewById(R.id.buttonCalculateCircleArea);
        Button clear=(Button)view.findViewById(R.id.buttonResetCircleArea);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, area);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerCircleAreaRadius.setAdapter(dataAdapter);
        calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                        CircleAreaCalci ballvolumeCalculator=new CircleAreaCalci();

                        hideKeyboard();

                        if(editTextCircleRadius.getText().toString().trim().equals("")){
                                editTextCircleRadius.setError("Enter The Radius");
                        }

                        else{

                                if (spinnerCircleAreaRadius.getSelectedItem().toString().trim().equals("mile")) {

                                        valueOfFirst = Integer.parseInt(editTextCircleRadius.getText().toString().trim());

                                        circleAreaResult.setVisibility(View.VISIBLE);

                                        double result =  ballvolumeCalculator.CircleAreaCalci(valueOfFirst);
                                        circleAreaResult.setText("Circle Area: "+formatter.format(result)+"  mile ^ 3");


                                }


                                if (spinnerCircleAreaRadius.getSelectedItem().toString().trim().equals("yard")) {

                                        valueOfFirst = Integer.parseInt(editTextCircleRadius.getText().toString().trim());

                                        circleAreaResult.setVisibility(View.VISIBLE);

                                        double result =  ballvolumeCalculator.CircleAreaCalci(valueOfFirst);
                                        circleAreaResult.setText("Circle Area: "+formatter.format(result)+"  yard ^ 3 ");



                                }
                                if (spinnerCircleAreaRadius.getSelectedItem().toString().trim().equals("foot")) {

                                        valueOfFirst = Integer.parseInt(editTextCircleRadius.getText().toString().trim());

                                        circleAreaResult.setVisibility(View.VISIBLE);

                                        double result =  ballvolumeCalculator.CircleAreaCalci(valueOfFirst);
                                        circleAreaResult.setText("Circle Area: "+formatter.format(result)+"  foot ^ 3 ");


                                }
                                if (spinnerCircleAreaRadius.getSelectedItem().toString().trim().equals("inch")) {


                                        valueOfFirst = Integer.parseInt(editTextCircleRadius.getText().toString().trim());
                                        circleAreaResult.setVisibility(View.VISIBLE);

                                        double result =  ballvolumeCalculator.CircleAreaCalci(valueOfFirst);
                                        circleAreaResult.setText("Circle Area: "+formatter.format(result)+"   inch ^ 3 ");
                                }

                                if (spinnerCircleAreaRadius.getSelectedItem().toString().trim().equals("kilometer")) {


                                        valueOfFirst = Integer.parseInt(editTextCircleRadius.getText().toString().trim());

                                        circleAreaResult.setVisibility(View.VISIBLE);

                                        double result =  ballvolumeCalculator.CircleAreaCalci(valueOfFirst);
                                        circleAreaResult.setText("Circle Area: "+formatter.format(result)+"   kilometer ^ 3 ");



                                }
                                if (spinnerCircleAreaRadius.getSelectedItem().toString().trim().equals("meter")) {

                                        valueOfFirst = Integer.parseInt(editTextCircleRadius.getText().toString().trim());
                                        circleAreaResult.setVisibility(View.VISIBLE);

                                        double result =  ballvolumeCalculator.CircleAreaCalci(valueOfFirst);
                                        circleAreaResult.setText("Circle Area: "+formatter.format(result)+ "   meter ^ 3 ");



                                }
                                if (spinnerCircleAreaRadius.getSelectedItem().toString().trim().equals("centimeter")) {


                                        valueOfFirst = Integer.parseInt(editTextCircleRadius.getText().toString().trim());

                                        circleAreaResult.setVisibility(View.VISIBLE);

                                        double result =  ballvolumeCalculator.CircleAreaCalci(valueOfFirst);
                                        circleAreaResult.setText("Circle Area: "+formatter.format(result)+ "  centimeter ^ 3 ");



                                }
                                if (spinnerCircleAreaRadius.getSelectedItem().toString().trim().equals("milimeter")) {

                                        valueOfFirst = Integer.parseInt(editTextCircleRadius.getText().toString().trim());

                                        circleAreaResult.setVisibility(View.VISIBLE);

                                        double result =  ballvolumeCalculator.CircleAreaCalci(valueOfFirst);
                                        circleAreaResult.setText("Circle Area: "+formatter.format(result)+ "  milimeter ^ 3 ");

                                }
                                if (spinnerCircleAreaRadius.getSelectedItem().toString().trim().equals("micrometer")) {

                                        valueOfFirst = Integer.parseInt(editTextCircleRadius.getText().toString().trim());

                                        circleAreaResult.setVisibility(View.VISIBLE);

                                        double result =  ballvolumeCalculator.CircleAreaCalci(valueOfFirst);
                                        circleAreaResult.setText("Circle Area: "+formatter.format(result)+ "   micrometer ^ 3 ");



                                }
                                if (spinnerCircleAreaRadius.getSelectedItem().toString().trim().equals("nanometer")) {

                                        valueOfFirst = Integer.parseInt(editTextCircleRadius.getText().toString().trim());

                                        circleAreaResult.setVisibility(View.VISIBLE);

                                        double result =  ballvolumeCalculator.CircleAreaCalci(valueOfFirst);
                                        circleAreaResult.setText("Circle Area: "+formatter.format(result)+ "   nanometer ^ 3 ");



                                }
                                if (spinnerCircleAreaRadius.getSelectedItem().toString().trim().equals("angstrom")) {


                                        valueOfFirst = Integer.parseInt(editTextCircleRadius.getText().toString().trim());

                                        circleAreaResult.setVisibility(View.VISIBLE);

                                        double result =  ballvolumeCalculator.CircleAreaCalci(valueOfFirst);
                                        circleAreaResult.setText("Circle Area: "+formatter.format(result)+ "  angstrom ^ 3 ");



                                }

                        }




                }



        });
        clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        editTextCircleRadius.setText("");
                        circleAreaResult.setVisibility(View.GONE);


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


