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

public class ConeVolume  extends android.support.v4.app.Fragment {
    EditText editTextBaseRadius, editTextHeight;
    Spinner spinnerConRadius, spinnerConHeight;
    TextView textViewResultConVolume;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.activity_cone_volume, container, false);
        editTextBaseRadius = (EditText) view.findViewById(R.id.editTextConRadius);
        editTextHeight = (EditText) view.findViewById(R.id.editTextConHeight);

        textViewResultConVolume = (TextView) view.findViewById(R.id.textViewResultConVolume);

        spinnerConRadius = (Spinner) view.findViewById(R.id.spinnerConRadius);
        spinnerConHeight = (Spinner) view.findViewById(R.id.spinnerConHeight);


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

        spinnerConRadius.setAdapter(dataAdapter);


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

        spinnerConHeight.setAdapter(dataAdapter1);

        Button calculate = (Button) view.findViewById(R.id.buttonCalculateCon);
        Button clear = (Button) view.findViewById(R.id.buttonResetCon);

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
                    StringFrom = spinnerConRadius.getSelectedItem().toString().trim();
                    StringTo = spinnerConHeight.getSelectedItem().toString().trim();
                    radius = Double.parseDouble(editTextBaseRadius.getText().toString().trim());
                    height = Double.parseDouble(editTextHeight.getText().toString().trim());
                    textViewResultConVolume.setVisibility(View.VISIBLE);
                    switch (StringFrom) {
                        case "mile":
                            switch (StringTo) {
                                case "mile":



                                    resultOne=0.3333333*3.14159265358979323;
                                  result=resultOne*Math.pow(radius, 2)*height;
                                    textViewResultConVolume.setText("" + result + "  mile^3");
                                    break;
                                case "yard":
                                    convertheight = height * 0.000568182;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  mile^3");
                                    break;
                                case "foot":
                                    convertheight = height * 0.0001893939393939;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  mile^3");
                                    break;
                                case "inch":
                                    convertheight = height * 0.00001578282828283;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  mile^3");
                                    break;
                                case "kilometer":
                                    convertheight = height * 0.6213711922373;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  mile^3");
                                    break;
                                case "meter":
                                    convertheight = height * 0.0006213711922373;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + " mile^3");
                                    break;
                                case "centimeter":
                                    convertheight = height * 0.000006213711922373;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + " mile ^ 3");
                                    break;
                                case "milimeter":
                                    convertheight = height * 6.213711922373e-7;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + " mile ^ 3");
                                    break;
                                case "micrometer":
                                    convertheight = height * 6.213711922373e-10;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + " mile ^ 3");
                                    break;
                                case "nanometer":
                                    convertheight = height * 6.213711922373e-13;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + " mile ^ 3");
                                    break;
                                case "angstrom":
                                    convertheight = height * 6.213711922373e-14;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + " mile ^ 3");
                                    break;
                            }

                            break;

                        case "yard":
                            switch (StringTo) {
                                case "mile":
                                    convertheight = height * 1760;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  yard^3");
                                    break;
                                case "yard":

                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*height;
                                    textViewResultConVolume.setText("" + result + "   yard^3");
                                    break;
                                case "foot":
                                    convertheight = height * 0.3333333333333;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "   yard^3");
                                    break;
                                case "inch":
                                    convertheight = height * 0.02777777777778;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "   yard^3");
                                    break;
                                case "kilometer":
                                    convertheight = height * 1093.613298338;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  yard^3");
                                    break;
                                case "meter":
                                    convertheight = height * 1.093613298338;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "   yard^3");
                                    break;
                                case "centimeter":
                                    convertheight = height * 0.01093613298338;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  yard^3");
                                    break;
                                case "milimeter":
                                    convertheight = height * 0.001093613298338;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  yard^3");
                                    break;
                                case "micrometer":

                                    convertheight = height * 0.000001093613298338;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  yard^3");
                                    break;
                                case "nanometer":
                                    convertheight = height * 1.093613298338e-9;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "   yard^3");
                                    break;
                                case "angstrom":
                                    convertheight = height * 1.093613298338e-10;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  yard^3");
                                    break;
                            }
                            break;
                        case "foot":
                            switch (StringTo) {
                                case "mile":
                                    convertheight = height * 5280;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  foot^3");
                                    break;
                                case "yard":
                                    convertheight = height * 3;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  foot^3");
                                    break;
                                case "foot":

                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*height;
                                    textViewResultConVolume.setText("" + result + "  foot^3");
                                    break;
                                case "inch":
                                    convertheight = height * 0.08333333333333;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  foot^3");
                                    break;
                                case "kilometer":
                                    convertheight = height * 3280.839895013;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  foot^3");
                                    break;
                                case "meter":
                                    convertheight = height * 3.280839895013;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  foot^3");
                                    break;
                                case "centimeter":
                                    convertheight = height * 0.03280839895013;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  foot^3");
                                    break;
                                case "milimeter":
                                    convertheight = height * 0.003280839895013;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  foot^3");
                                    break;
                                case "micrometer":

                                    convertheight = height * 0.000003280839895013;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  foot^3");
                                    break;
                                case "nanometer":
                                    convertheight = height * 3.280839895013e-9;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  foot^3");
                                    break;
                                case "angstrom":
                                    convertheight = height * 3.280839895013e-10;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  foot^3");
                                    break;
                            }
                            break;
                        case "inch":
                            switch (StringTo) {
                                case "mile":
                                    convertheight = height * 63360;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + " inch^3");
                                    break;
                                case "yard":
                                    convertheight = height * 36;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + " inch^3");
                                    break;
                                case "foot":
                                    convertheight = height * 12;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  inch^3");
                                    break;
                                case "inch":

                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*height;
                                    textViewResultConVolume.setText("" + result + "  inch^3");
                                    break;
                                case "kilometer":
                                    convertheight = height * 39370.07874016;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  inch^3");
                                    break;
                                case "meter":
                                    convertheight = height * 39.37007874016;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  inch^3");
                                    break;
                                case "centimeter":
                                    convertheight = height * 0.3937007874016;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  inch^3");
                                    break;
                                case "milimeter":
                                    convertheight = height * 0.03937007874016;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  inch^3");
                                    break;
                                case "micrometer":

                                    convertheight = height * 0.00003937007874016;
                                    resultOne=0.33333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  inch^3");
                                    break;
                                case "nanometer":
                                    convertheight = height * 3.937007874016e-8;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  inch^3");
                                    break;
                                case "angstrom":
                                    convertheight = height * 3.937007874016e-9;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + " inch^3");
                                    break;
                            }
                            break;
                        case "kilometer":
                            switch (StringTo) {
                                case "mile":
                                    convertheight = height * 1.609344;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  kilometer^3");
                                    break;
                                case "yard":
                                    convertheight = height * 0.0009144;
                                    resultOne=0.33333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  kilometer^3");
                                    break;
                                case "foot":
                                    convertheight = height * 0.0003048;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  kilometer^3");
                                    break;
                                case "inch":
                                    convertheight = height * 0.0000254;
                                    resultOne=0.33333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  kilometer^3");
                                    break;
                                case "kilometer":

                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*height;
                                    textViewResultConVolume.setText("" + result + "  kilometer^3");
                                    break;
                                case "meter":
                                    convertheight = height * 0.001;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  kilometer^3");
                                    break;
                                case "centimeter":
                                    convertheight = height * 0.00001;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  kilometer^3");
                                    break;
                                case "milimeter":
                                    convertheight = height * 0.000001;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  kilometer^3");
                                    break;
                                case "micrometer":

                                    convertheight = height * 1e-9;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  kilometer^3");
                                    break;
                                case "nanometer":
                                    convertheight = height * 9.999999999999e-13;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  kilometer^3");
                                    break;
                                case "angstrom":
                                    convertheight = height * 1e-13;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  kilometer^3");
                                    break;
                            }
                            break;

                        case "meter":
                            switch (StringTo) {
                                case "mile":
                                    convertheight = height * 1609.344;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  meter^3");
                                    break;
                                case "yard":
                                    convertheight = height * 0.9144;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  meter^3");
                                    break;
                                case "foot":
                                    convertheight = height * 0.3048;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "   meter^3");
                                    break;
                                case "inch":
                                    convertheight = height * 0.0254;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  meter^3");
                                    break;
                                case "kilometer":
                                    convertheight = height * 1000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  meter^3");
                                    break;
                                case "meter":

                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*height;
                                    textViewResultConVolume.setText("" + result + "  meter^3");
                                    break;
                                case "centimeter":
                                    convertheight = height * 0.01;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  meter^3");
                                    break;
                                case "milimeter":
                                    convertheight = height * 0.001;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  meter^3");
                                    break;
                                case "micrometer":

                                    convertheight = height * 9.999999999999e-7;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "   meter^3");
                                    break;
                                case "nanometer":
                                    convertheight = height * 9.999999999999e-10;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "   meter^3");
                                    break;
                                case "angstrom":
                                    convertheight = height * 1e-10;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  meter^3");
                                    break;
                            }
                            break;
                        case "centimeter":
                            switch (StringTo) {
                                case "mile":
                                    convertheight = height * 160934.4;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  centimeter^3");
                                    break;
                                case "yard":
                                    convertheight = height * 91.44;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  centimeter^3");
                                    break;
                                case "foot":
                                    convertheight = height * 30.48;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  centimeter^3");
                                    break;
                                case "inch":
                                    convertheight = height * 2.54;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  centimeter^3");
                                    break;
                                case "kilometer":
                                    convertheight = height * 100000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  centimeter^3");
                                    break;
                                case "meter":
                                    convertheight = height * 100;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  centimeter^3");
                                    break;
                                case "centimeter":

                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*height;
                                    textViewResultConVolume.setText("" + result + "  centimeter^3");
                                    break;
                                case "milimeter":
                                    convertheight = height * 0.1;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + " centimeter^3");
                                    break;
                                case "micrometer":

                                    convertheight = height * 0.0001;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  centimeter^3");
                                    break;
                                case "nanometer":
                                    convertheight = height * 9.999999999999e-8;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  centimeter^3");
                                    break;
                                case "angstrom":
                                    convertheight = height * 1e-8;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  centimeter^3");
                                    break;
                            }
                            break;

                        case "milimeter":
                            switch (StringTo) {
                                case "mile":
                                    convertheight = height * 1609344;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  milimeter^3");
                                    break;
                                case "yard":
                                    convertheight = height * 914.4;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  milimeter^3");
                                    break;
                                case "foot":
                                    convertheight = height * 304.8;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  milimeter^3");
                                    break;
                                case "inch":
                                    convertheight = height * 25.4;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "   milimeter^3");
                                    break;
                                case "kilometer":
                                    convertheight = height * 1000000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  milimeter^3");
                                    break;
                                case "meter":
                                    convertheight = height * 1000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  milimeter^3");
                                    break;
                                case "centimeter":
                                    convertheight = height * 10;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  milimeter^3");
                                    break;
                                case "milimeter":

                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*height;
                                    textViewResultConVolume.setText("" + result + "  milimeter^3");
                                    break;
                                case "micrometer":

                                    convertheight = height * 0.001;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  milimeter^3");
                                    break;
                                case "nanometer":
                                    convertheight = height * 9.999999999999e-7;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "   milimeter^3");
                                    break;
                                case "angstrom":
                                    convertheight = height * 1e-7;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  milimeter^3");
                                    break;
                            }
                            break;

                        case "micrometer":
                            switch (StringTo) {
                                case "mile":
                                    convertheight = height * 1609344000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  micrometer^3");
                                    break;
                                case "yard":
                                    convertheight = height * 914400;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  micrometer^3");
                                    break;
                                case "foot":
                                    convertheight = height * 304800;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  micrometer^3");
                                    break;
                                case "inch":
                                    convertheight = height * 25400;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  micrometer^3");
                                    break;
                                case "kilometer":
                                    convertheight = height * 1000000000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  micrometer^3");
                                    break;
                                case "meter":
                                    convertheight = height * 1000000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  micrometer^3");
                                    break;
                                case "centimeter":
                                    convertheight = height * 10000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  micrometer^3");
                                    break;
                                case "milimeter":

                                    convertheight = height * 1000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  micrometer^3");
                                    break;
                                case "micrometer":

                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*height;
                                    textViewResultConVolume.setText("" + result + "  micrometer^3");
                                    break;
                                case "nanometer":
                                    convertheight = height * 0.0009999999999999;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  micrometer^3");
                                    break;
                                case "angstrom":
                                    convertheight = height * 0.0001;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  micrometer^3");
                                    break;
                            }
                            break;

                        case "nanometer":
                            switch (StringTo) {
                                case "mile":
                                    convertheight = height * 1.609344e+12;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  nanometer^3");
                                    break;
                                case "yard":
                                    convertheight = height * 914400000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  nanometer^3");
                                    break;
                                case "foot":
                                    convertheight = height * 304800000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  nanometer^3");
                                    break;
                                case "inch":
                                    convertheight = height * 25400000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  nanometer^3");
                                    break;
                                case "kilometer":
                                    convertheight = height * 1E12;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  nanometer^3");
                                    break;
                                case "meter":
                                    convertheight = height * 1000000000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + " nanometer^3");
                                    break;
                                case "centimeter":
                                    convertheight = height * 10000000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  nanometer^3");
                                    break;
                                case "milimeter":
                                    convertheight = height * 1000000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  nanometer^3");
                                    break;
                                case "micrometer":
                                    convertheight = height * 1000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  nanometer^3");
                                    break;
                                case "nanometer":

                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*height;
                                    textViewResultConVolume.setText("" + result + "  nanometer^3");
                                    break;
                                case "angstrom":
                                    convertheight = height * 0.1;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  nanometer^3");
                                    break;
                            }
                            break;
                        case "angstrom":
                            switch (StringTo) {
                                case "mile":
                                    convertheight = height * 1.609344e+13;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  angstrom^3");
                                    break;
                                case "yard":
                                    convertheight = height * 0.9144000000E-1;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  angstrom^3");
                                    break;
                                case "foot":
                                    convertheight = height * 0.3048000000e-1;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  angstrom^3");
                                    break;
                                case "inch":
                                    convertheight = height * 254000000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  angstrom^3");
                                    break;
                                case "kilometer":
                                    convertheight = height * 1e+13;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  angstrom^3");
                                    break;
                                case "meter":
                                    convertheight = height * 1E10;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "   angstrom^3");
                                    break;
                                case "centimeter":
                                    convertheight = height * 100000000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "   angstrom^3");
                                    break;
                                case "milimeter":
                                    convertheight = height * 10000000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "   angstrom^3");
                                    break;
                                case "micrometer":
                                    convertheight = height * 10000;
                                    resultOne=0.3333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  angstrom^3");
                                    break;
                                case "nanometer":
                                    convertheight = height * 10;
                                    resultOne=0.33333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*convertheight;
                                    textViewResultConVolume.setText("" + result + "  angstrom^3");
                                    break;
                                case "angstrom":

                                    resultOne=0.33333333*3.14159265358979323;
                                    result=resultOne*Math.pow(radius, 2)*height;
                                    textViewResultConVolume.setText("" + result + " angstrom^3");
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
                textViewResultConVolume.setVisibility(View.GONE);
                editTextBaseRadius.setText("");
                editTextHeight.setText("");
            }
        });
        return  view;
    }


    public void hideKeyboard() {
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity()
                .getSystemService(android.content.Context.INPUT_METHOD_SERVICE);

        inputMethodManager.hideSoftInputFromWindow(
                getActivity().getCurrentFocus()
                        .getWindowToken(), 0);
    }
    }

