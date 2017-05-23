package com.geniusnine.android.geometry.VolumeCalculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.geniusnine.android.geometry.R;

import java.util.ArrayList;

public class SquareVolume extends android.support.v4.app.Fragment {
        EditText editTextBaseRadius, editTextHeight;
        Spinner spinnersquareRadius, spinnersquareHeight;
        TextView textViewResultsquareVolume;

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.activity_square_volume, container, false);

        editTextBaseRadius = (EditText) view.findViewById(R.id.editTextSquareRadius);
        editTextHeight = (EditText) view.findViewById(R.id.editTextSquareHeight);

        textViewResultsquareVolume = (TextView) view.findViewById(R.id.textViewResultSquareVolume);

        spinnersquareRadius = (Spinner) view.findViewById(R.id.spinnerSquareRadius);
        spinnersquareHeight = (Spinner) view.findViewById(R.id.spinnerSquareHeight);


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

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, area);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        spinnersquareRadius.setAdapter(dataAdapter);


        ArrayList area1 = new ArrayList();
        area1.add("mile");
        area1.add("yard");
        area1.add("foot");
        area1.add("inch");
        area1.add("kilometer");
        area1.add("meter");
        area1.add("centimeter");
        area1.add("milimeter");
        area1.add("micrometer");
        area1.add("nanometer");
        area1.add("angstrom");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, area1);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        spinnersquareHeight.setAdapter(dataAdapter1);

        Button calculate = (Button) view.findViewById(R.id.buttonCalculateSquare);
        Button clear = (Button) view.findViewById(R.id.buttonResetSquare);

        calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
hideKeyboard();
                        if(editTextBaseRadius.getText().toString().trim().equals("")){
                                editTextBaseRadius.setError("Enter The Base Radius");
                        }
                        if(editTextHeight.getText().toString().trim().equals("")){
                                editTextHeight.setError("Enter The Height");
                        }
                        else {


                                String StringFrom, StringTo;

                                double resultOne = 0, radius = 0, height = 0, result = 0, convertheight;
                                StringFrom = spinnersquareRadius.getSelectedItem().toString().trim();
                                StringTo = spinnersquareHeight.getSelectedItem().toString().trim();
                                radius = Double.parseDouble(editTextBaseRadius.getText().toString().trim());
                                height = Double.parseDouble(editTextHeight.getText().toString().trim());
                                textViewResultsquareVolume.setVisibility(View.VISIBLE);
                                switch (StringFrom) {
                                        case "mile":
                                                switch (StringTo) {
                                                        case "mile":

                                                                result=0.3333333*Math.pow(radius, 2)*height;
                                                                textViewResultsquareVolume.setText("" + result + "  mile^3");
                                                                break;
                                                        case "yard":
                                                                convertheight = height * 0.000568182;

                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  mile^3");
                                                                break;
                                                        case "foot":
                                                                convertheight = height * 0.0001893939393939;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  mile^3");
                                                                break;
                                                        case "inch":
                                                                convertheight = height * 0.00001578282828283;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  mile^3");
                                                                break;
                                                        case "kilometer":
                                                                convertheight = height * 0.6213711922373;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  mile^3");
                                                                break;
                                                        case "meter":
                                                                convertheight = height * 0.0006213711922373;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + " mile^3");
                                                                break;
                                                        case "centimeter":
                                                                convertheight = height * 0.000006213711922373;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + " mile ^ 3");
                                                                break;
                                                        case "milimeter":
                                                                convertheight = height * 6.213711922373e-7;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + " mile ^ 3");
                                                                break;
                                                        case "micrometer":
                                                                convertheight = height * 6.213711922373e-10;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + " mile ^ 3");
                                                                break;
                                                        case "nanometer":
                                                                convertheight = height * 6.213711922373e-13;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + " mile ^ 3");
                                                                break;
                                                        case "angstrom":
                                                                convertheight = height * 6.213711922373e-14;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + " mile ^ 3");
                                                                break;
                                                }

                                                break;

                                        case "yard":
                                                switch (StringTo) {
                                                        case "mile":
                                                                convertheight = height * 1760;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  yard^3");
                                                                break;
                                                        case "yard":

                                                                result=0.3333333*Math.pow(radius, 2)*height;
                                                                textViewResultsquareVolume.setText("" + result + "   yard^3");
                                                                break;
                                                        case "foot":
                                                                convertheight = height * 0.3333333333333;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "   yard^3");
                                                                break;
                                                        case "inch":
                                                                convertheight = height * 0.02777777777778;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "   yard^3");
                                                                break;
                                                        case "kilometer":
                                                                convertheight = height * 1093.613298338;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  yard^3");
                                                                break;
                                                        case "meter":
                                                                convertheight = height * 1.093613298338;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "   yard^3");
                                                                break;
                                                        case "centimeter":
                                                                convertheight = height * 0.01093613298338;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  yard^3");
                                                                break;
                                                        case "milimeter":
                                                                convertheight = height * 0.001093613298338;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  yard^3");
                                                                break;
                                                        case "micrometer":

                                                                convertheight = height * 0.000001093613298338;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  yard^3");
                                                                break;
                                                        case "nanometer":
                                                                convertheight = height * 1.093613298338e-9;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "   yard^3");
                                                                break;
                                                        case "angstrom":
                                                                convertheight = height * 1.093613298338e-10;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  yard^3");
                                                                break;
                                                }
                                                break;
                                        case "foot":
                                                switch (StringTo) {
                                                        case "mile":
                                                                convertheight = height * 5280;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  foot^3");
                                                                break;
                                                        case "yard":
                                                                convertheight = height * 3;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  foot^3");
                                                                break;
                                                        case "foot":

                                                                result=0.3333333*Math.pow(radius, 2)*height;
                                                                textViewResultsquareVolume.setText("" + result + "  foot^3");
                                                                break;
                                                        case "inch":
                                                                convertheight = height * 0.08333333333333;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  foot^3");
                                                                break;
                                                        case "kilometer":
                                                                convertheight = height * 3280.839895013;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  foot^3");
                                                                break;
                                                        case "meter":
                                                                convertheight = height * 3.280839895013;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  foot^3");
                                                                break;
                                                        case "centimeter":
                                                                convertheight = height * 0.03280839895013;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  foot^3");
                                                                break;
                                                        case "milimeter":
                                                                convertheight = height * 0.003280839895013;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  foot^3");
                                                                break;
                                                        case "micrometer":

                                                                convertheight = height * 0.000003280839895013;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  foot^3");
                                                                break;
                                                        case "nanometer":
                                                                convertheight = height * 3.280839895013e-9;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  foot^3");
                                                                break;
                                                        case "angstrom":
                                                                convertheight = height * 3.280839895013e-10;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  foot^3");
                                                                break;
                                                }
                                                break;
                                        case "inch":
                                                switch (StringTo) {
                                                        case "mile":
                                                                convertheight = height * 63360;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + " inch^3");
                                                                break;
                                                        case "yard":
                                                                convertheight = height * 36;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + " inch^3");
                                                                break;
                                                        case "foot":
                                                                convertheight = height * 12;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  inch^3");
                                                                break;
                                                        case "inch":

                                                                result=0.3333333*Math.pow(radius, 2)*height;
                                                                textViewResultsquareVolume.setText("" + result + "  inch^3");
                                                                break;
                                                        case "kilometer":
                                                                convertheight = height * 39370.07874016;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  inch^3");
                                                                break;
                                                        case "meter":
                                                                convertheight = height * 39.37007874016;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  inch^3");
                                                                break;
                                                        case "centimeter":
                                                                convertheight = height * 0.3937007874016;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  inch^3");
                                                                break;
                                                        case "milimeter":
                                                                convertheight = height * 0.03937007874016;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  inch^3");
                                                                break;
                                                        case "micrometer":

                                                                convertheight = height * 0.00003937007874016;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  inch^3");
                                                                break;
                                                        case "nanometer":
                                                                convertheight = height * 3.937007874016e-8;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  inch^3");
                                                                break;
                                                        case "angstrom":
                                                                convertheight = height * 3.937007874016e-9;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + " inch^3");
                                                                break;
                                                }
                                                break;
                                        case "kilometer":
                                                switch (StringTo) {
                                                        case "mile":
                                                                convertheight = height * 1.609344;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  kilometer^3");
                                                                break;
                                                        case "yard":
                                                                convertheight = height * 0.0009144;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  kilometer^3");
                                                                break;
                                                        case "foot":
                                                                convertheight = height * 0.0003048;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  kilometer^3");
                                                                break;
                                                        case "inch":
                                                                convertheight = height * 0.0000254;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  kilometer^3");
                                                                break;
                                                        case "kilometer":
                                                                result=0.3333333*Math.pow(radius, 2)*height;
                                                                textViewResultsquareVolume.setText("" + result + "  kilometer^3");
                                                                break;
                                                        case "meter":
                                                                convertheight = height * 0.001;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  kilometer^3");
                                                                break;
                                                        case "centimeter":
                                                                convertheight = height * 0.00001;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  kilometer^3");
                                                                break;
                                                        case "milimeter":
                                                                convertheight = height * 0.000001;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  kilometer^3");
                                                                break;
                                                        case "micrometer":

                                                                convertheight = height * 1e-9;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  kilometer^3");
                                                                break;
                                                        case "nanometer":
                                                                convertheight = height * 9.999999999999e-13;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  kilometer^3");
                                                                break;
                                                        case "angstrom":
                                                                convertheight = height * 1e-13;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  kilometer^3");
                                                                break;
                                                }
                                                break;

                                        case "meter":
                                                switch (StringTo) {
                                                        case "mile":
                                                                convertheight = height * 1609.344;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  meter^3");
                                                                break;
                                                        case "yard":
                                                                convertheight = height * 0.9144;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  meter^3");
                                                                break;
                                                        case "foot":
                                                                convertheight = height * 0.3048;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "   meter^3");
                                                                break;
                                                        case "inch":
                                                                convertheight = height * 0.0254;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  meter^3");
                                                                break;
                                                        case "kilometer":
                                                                convertheight = height * 1000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  meter^3");
                                                                break;
                                                        case "meter":

                                                                result=0.3333333*Math.pow(radius, 2)*height;
                                                                textViewResultsquareVolume.setText("" + result + "  meter^3");
                                                                break;
                                                        case "centimeter":
                                                                convertheight = height * 0.01;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  meter^3");
                                                                break;
                                                        case "milimeter":
                                                                convertheight = height * 0.001;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  meter^3");
                                                                break;
                                                        case "micrometer":

                                                                convertheight = height * 9.999999999999e-7;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "   meter^3");
                                                                break;
                                                        case "nanometer":
                                                                convertheight = height * 9.999999999999e-10;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "   meter^3");
                                                                break;
                                                        case "angstrom":
                                                                convertheight = height * 1e-10;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  meter^3");
                                                                break;
                                                }
                                                break;
                                        case "centimeter":
                                                switch (StringTo) {
                                                        case "mile":
                                                                convertheight = height * 160934.4;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  centimeter^3");
                                                                break;
                                                        case "yard":
                                                                convertheight = height * 91.44;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  centimeter^3");
                                                                break;
                                                        case "foot":
                                                                convertheight = height * 30.48;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  centimeter^3");
                                                                break;
                                                        case "inch":
                                                                convertheight = height * 2.54;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  centimeter^3");
                                                                break;
                                                        case "kilometer":
                                                                convertheight = height * 100000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  centimeter^3");
                                                                break;
                                                        case "meter":
                                                                convertheight = height * 100;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  centimeter^3");
                                                                break;
                                                        case "centimeter":
                                                                result=0.3333333*Math.pow(radius, 2)*height;
                                                                textViewResultsquareVolume.setText("" + result + "  centimeter^3");
                                                                break;
                                                        case "milimeter":
                                                                convertheight = height * 0.1;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + " centimeter^3");
                                                                break;
                                                        case "micrometer":

                                                                convertheight = height * 0.0001;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  centimeter^3");
                                                                break;
                                                        case "nanometer":
                                                                convertheight = height * 9.999999999999e-8;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  centimeter^3");
                                                                break;
                                                        case "angstrom":
                                                                convertheight = height * 1e-8;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  centimeter^3");
                                                                break;
                                                }
                                                break;

                                        case "milimeter":
                                                switch (StringTo) {
                                                        case "mile":
                                                                convertheight = height * 1609344;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  milimeter^3");
                                                                break;
                                                        case "yard":
                                                                convertheight = height * 914.4;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  milimeter^3");
                                                                break;
                                                        case "foot":
                                                                convertheight = height * 304.8;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  milimeter^3");
                                                                break;
                                                        case "inch":
                                                                convertheight = height * 25.4;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "   milimeter^3");
                                                                break;
                                                        case "kilometer":
                                                                convertheight = height * 1000000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  milimeter^3");
                                                                break;
                                                        case "meter":
                                                                convertheight = height * 1000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  milimeter^3");
                                                                break;
                                                        case "centimeter":
                                                                convertheight = height * 10;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  milimeter^3");
                                                                break;
                                                        case "milimeter":


                                                                result=0.3333333*Math.pow(radius, 2)*height;
                                                                textViewResultsquareVolume.setText("" + result + "  milimeter^3");
                                                                break;
                                                        case "micrometer":

                                                                convertheight = height * 0.001;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  milimeter^3");
                                                                break;
                                                        case "nanometer":
                                                                convertheight = height * 9.999999999999e-7;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "   milimeter^3");
                                                                break;
                                                        case "angstrom":
                                                                convertheight = height * 1e-7;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  milimeter^3");
                                                                break;
                                                }
                                                break;

                                        case "micrometer":
                                                switch (StringTo) {
                                                        case "mile":
                                                                convertheight = height * 1609344000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  micrometer^3");
                                                                break;
                                                        case "yard":
                                                                convertheight = height * 914400;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  micrometer^3");
                                                                break;
                                                        case "foot":
                                                                convertheight = height * 304800;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  micrometer^3");
                                                                break;
                                                        case "inch":
                                                                convertheight = height * 25400;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  micrometer^3");
                                                                break;
                                                        case "kilometer":
                                                                convertheight = height * 1000000000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  micrometer^3");
                                                                break;
                                                        case "meter":
                                                                convertheight = height * 1000000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  micrometer^3");
                                                                break;
                                                        case "centimeter":
                                                                convertheight = height * 10000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  micrometer^3");
                                                                break;
                                                        case "milimeter":

                                                                convertheight = height * 1000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  micrometer^3");
                                                                break;
                                                        case "micrometer":


                                                                result=0.3333333*Math.pow(radius, 2)*height;
                                                                textViewResultsquareVolume.setText("" + result + "  micrometer^3");
                                                                break;
                                                        case "nanometer":
                                                                convertheight = height * 0.0009999999999999;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  micrometer^3");
                                                                break;
                                                        case "angstrom":
                                                                convertheight = height * 0.0001;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  micrometer^3");
                                                                break;
                                                }
                                                break;

                                        case "nanometer":
                                                switch (StringTo) {
                                                        case "mile":
                                                                convertheight = height * 1.609344e+12;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  nanometer^3");
                                                                break;
                                                        case "yard":
                                                                convertheight = height * 914400000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  nanometer^3");
                                                                break;
                                                        case "foot":
                                                                convertheight = height * 304800000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  nanometer^3");
                                                                break;
                                                        case "inch":
                                                                convertheight = height * 25400000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  nanometer^3");
                                                                break;
                                                        case "kilometer":
                                                                convertheight = height * 1E12;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  nanometer^3");
                                                                break;
                                                        case "meter":
                                                                convertheight = height * 1000000000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + " nanometer^3");
                                                                break;
                                                        case "centimeter":
                                                                convertheight = height * 10000000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  nanometer^3");
                                                                break;
                                                        case "milimeter":
                                                                convertheight = height * 1000000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  nanometer^3");
                                                                break;
                                                        case "micrometer":
                                                                convertheight = height * 1000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  nanometer^3");
                                                                break;
                                                        case "nanometer":
                                                                result=0.3333333*Math.pow(radius, 2)*height;
                                                                textViewResultsquareVolume.setText("" + result + "  nanometer^3");
                                                                break;
                                                        case "angstrom":
                                                                convertheight = height * 0.1;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  nanometer^3");
                                                                break;
                                                }
                                                break;
                                        case "angstrom":
                                                switch (StringTo) {
                                                        case "mile":
                                                                convertheight = height * 1.609344e+13;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  angstrom^3");
                                                                break;
                                                        case "yard":
                                                                convertheight = height * 0.9144000000E-1;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  angstrom^3");
                                                                break;
                                                        case "foot":
                                                                convertheight = height * 0.3048000000e-1;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  angstrom^3");
                                                                break;
                                                        case "inch":
                                                                convertheight = height * 254000000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  angstrom^3");
                                                                break;
                                                        case "kilometer":
                                                                convertheight = height * 1e+13;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  angstrom^3");
                                                                break;
                                                        case "meter":
                                                                convertheight = height * 1E10;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "   angstrom^3");
                                                                break;
                                                        case "centimeter":
                                                                convertheight = height * 100000000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "   angstrom^3");
                                                                break;
                                                        case "milimeter":
                                                                convertheight = height * 10000000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "   angstrom^3");
                                                                break;
                                                        case "micrometer":
                                                                convertheight = height * 10000;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  angstrom^3");
                                                                break;
                                                        case "nanometer":
                                                                convertheight = height * 10;
                                                                result=0.3333333*Math.pow(radius, 2)*convertheight;
                                                                textViewResultsquareVolume.setText("" + result + "  angstrom^3");
                                                                break;
                                                        case "angstrom":
                                                                result=0.3333333*Math.pow(radius, 2)*height;
                                                                textViewResultsquareVolume.setText("" + result + " angstrom^3");
                                                                break;
                                                }
                                                break;
                                }
                        }

                        // textViewResultConeVolume.setText(formatter.format(result));
                }

        });
        clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        textViewResultsquareVolume.setVisibility(View.GONE);
                        editTextBaseRadius.setText("");
                        editTextHeight.setText("");
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
        }