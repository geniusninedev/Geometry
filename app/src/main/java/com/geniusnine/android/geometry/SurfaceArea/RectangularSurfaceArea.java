package com.geniusnine.android.geometry.SurfaceArea;

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

public class RectangularSurfaceArea  extends android.support.v4.app.Fragment {

        EditText editTextLength,editTextWidth, editTextHeight;
        Spinner spinnerrectLength, spinnerrectWidth,spinnerrectHeight;
        TextView textViewResultrectVolume;

        String StringFrom, StringTo,StringToTo;

        double resultOne = 0, radius = 0, height = 0,width=0, result = 0, convertheight,convertwidth;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


            View view = inflater.inflate(R.layout.activity_rectangular_surface_area, container, false);

            editTextLength = (EditText) view.findViewById(R.id.editTextRectSurfaceAreaLength);
            editTextWidth = (EditText) view.findViewById(R.id.editTextRectSurfaceAreaWidth);
            editTextHeight = (EditText) view.findViewById(R.id.editTextRectSurfaceAreaRectangleHeight);

            textViewResultrectVolume = (TextView) view.findViewById(R.id.textViewResultRectSurfaceArea);

            spinnerrectLength = (Spinner) view.findViewById(R.id.spinnerRectSurfaceAreaLength);
            spinnerrectWidth = (Spinner) view.findViewById(R.id.spinnerRectSurfaceAreaWidth);
            spinnerrectHeight = (Spinner) view.findViewById(R.id.spinnerRectSurfaceAreaRectangleHeight);

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

            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, area);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinnerrectLength.setAdapter(dataAdapter);


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

            ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, area1);
            dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinnerrectWidth.setAdapter(dataAdapter1);


            ArrayList area2 = new ArrayList();
            area2.add("mile");
            area2.add("yard");
            area2.add("foot");
            area2.add("inch");
            area2.add("kilometer");
            area2.add("meter");
            area2.add("centimeter");
            area2.add("milimeter");
            area2.add("micrometer");
            area2.add("nanometer");
            area2.add("angstrom");

            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, area2);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinnerrectHeight.setAdapter(dataAdapter2);

            Button calculate = (Button) view.findViewById(R.id.buttonCalculateRectSurfaceArea);
            Button clear = (Button) view.findViewById(R.id.buttonResetRectSurfaceArea);

            calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
hideKeyboard();
                    if (editTextLength.getText().toString().trim().equals("")) {
                        editTextLength.setError("Enter The Length");
                    }
                    if (editTextWidth.getText().toString().trim().equals("")) {
                        editTextWidth.setError("Enter The Width");
                    }
                    if (editTextHeight.getText().toString().trim().equals("")) {
                        editTextHeight.setError("Enter The Height");
                    }
                    else {

                        StringFrom = spinnerrectLength.getSelectedItem().toString().trim();
                        StringTo = spinnerrectWidth.getSelectedItem().toString().trim();
                        StringToTo = spinnerrectHeight.getSelectedItem().toString().trim();
                        radius = Double.parseDouble(editTextLength.getText().toString().trim());
                        width = Double.parseDouble(editTextWidth.getText().toString().trim());
                        height = Double.parseDouble(editTextHeight.getText().toString().trim());
                        textViewResultrectVolume.setVisibility(View.VISIBLE);
                        switch (StringFrom) {
                            case "mile":
                                switch (StringTo) {
                                    case "mile":
                                        mile();

                                        break;

                                    case "yard":
                                        milemileyard();
                                        break;


                                    case "foot":
                                        milefoot();

                                        break;
                                    case "inch":
                                        mileinch();

                                        break;

                                    case "kilometer":
                                        milekilometer();

                                        break;
                                    case "meter":
                                        milemeter();

                                        break;
                                    case "centimeter":
                                        milecentimeter();

                                        break;

                                    case "milimeter":
                                        milemilimeter();

                                        break;
                                    case "micrometer":
                                        milemicrometer();


                                        break;
                                    case "nanometer":
                                        milenanometer();

                                        break;
                                    case "angstrom":
                                        mileangstrom();


                                        break;
                                }
                                break;


                            case "yard":
                                switch (StringTo) {
                                    case "mile":
                                        mileyardmile();

                                        break;

                                    case "yard":
                                        mileyardyard();


                                        break;
                                    case "foot":
                                        mileyardfoot();


                                        break;
                                    case "inch":
                                        mileyardinch();


                                        break;
                                    case "kilometer":
                                        mileyardkilometer();

                                        break;
                                    case "meter":
                                        mileyardmeter();

                                        break;
                                    case "centimeter":
                                        mileyardcentimeter();

                                        break;

                                    case "milimeter":
                                        mileyardmilimeter();

                                        break;
                                    case "micrometer":
                                        mileyardmicrometer();


                                        break;
                                    case "nanometer":
                                        mileyardnanometer();

                                        break;
                                    case "angstrom":
                                        mileyardangstrom();

                                        break;
                                }

                                break;

                            case "foot":

                                switch (StringTo) {
                                    case "mile":
                                        milefootmile();

                                        break;

                                    case "yard":
                                        milefootyard();

                                        break;
                                    case "foot":
                                        milefootfoot();


                                        break;
                                    case "inch":
                                        milefootinch();


                                        break;
                                    case "kilometer":
                                        milefootkilometer();


                                        break;
                                    case "meter":
                                        milefootmeter();

                                        break;
                                    case "centimeter":
                                        milefootcentimeter();


                                        break;

                                    case "milimeter":
                                        milefootmilimeter();


                                        break;
                                    case "micrometer":
                                        milefootmicrometer();

                                        break;
                                    case "nanometer":
                                        milefootnanometer();
                                        break;
                                    case "angstrom":
                                        milefootangstrom();
                                        break;
                                }
                                break;

                            case "inch":
                                switch (StringTo) {
                                    case "mile":
                                        mileinchmile();
                                        break;

                                    case "yard":
                                        mileinchyard();

                                        break;
                                    case "foot":
                                        mileinchfoot();
                                        break;
                                    case "inch":
                                        mileinchinch();


                                        break;
                                    case "kilometer":
                                        mileinchkilometer();

                                        break;
                                    case "meter":
                                        mileinchmeter();

                                        break;
                                    case "centimeter":
                                        mileinchcentimeter();

                                        break;

                                    case "milimeter":
                                        mileinchmilimeter();

                                        break;
                                    case "micrometer":
                                        mileinchmicrometer();

                                        break;
                                    case "nanometer":
                                        mileinchnanometer();

                                        break;
                                    case "angstrom":
                                        mileinchangstrom();


                                        break;
                                }
                                break;

                            case "kilometer":
                                switch (StringTo) {
                                    case "mile":
                                        milekilometermile();

                                        break;

                                    case "yard":
                                        milekilometeryard();

                                        break;
                                    case "foot":
                                        milekilometerfoot();

                                        break;
                                    case "inch":
                                        milekilometerinch();

                                        break;
                                    case "kilometer":
                                        milekilometerkilometer();

                                        break;
                                    case "meter":
                                        milekilometermeter();

                                        break;
                                    case "centimeter":
                                        milekilometercentimeter();

                                        break;

                                    case "milimeter":
                                        milekilometermilimeter();

                                        break;
                                    case "micrometer":
                                        milekilometermicrometer();

                                        break;
                                    case "nanometer":
                                        milekilometernanometer();

                                        break;
                                    case "angstrom":
                                        milekilometerangstrom();

                                        break;
                                }
                                break;
                            case "meter":
                                switch (StringTo) {
                                    case "mile":
                                        milemetermile();

                                        break;

                                    case "yard":
                                        milemeteryard();

                                        break;
                                    case "foot":
                                        milemeterfoot();

                                        break;
                                    case "inch":
                                        milemeterinch();

                                        break;
                                    case "kilometer":
                                        milemeterkilometer();

                                        break;
                                    case "meter":
                                        milemetermeter();

                                        break;
                                    case "centimeter":
                                        milemetercentimeter();

                                        break;

                                    case "milimeter":
                                        milemetermilimeter();

                                        break;
                                    case "micrometer":
                                        milemetermicrometer();

                                        break;
                                    case "nanometer":
                                        milemeternanometer();

                                        break;
                                    case "angstrom":
                                        milemeterangstrom();


                                        break;
                                }

                                break;
                            case "centimeter":
                                switch (StringTo) {
                                    case "mile":
                                        milecentimetermile();


                                        break;

                                    case "yard":
                                        milecentimeteryard();

                                        break;
                                    case "foot":
                                        milecentimeterfoot();

                                        break;
                                    case "inch":
                                        milecentimeterinch();

                                        break;
                                    case "kilometer":
                                        milecentimeterkilometer();

                                        break;
                                    case "meter":
                                        milecentimetermeter();

                                        break;
                                    case "centimeter":
                                        milecentimetercentimeter();

                                        break;

                                    case "milimeter":
                                        milecentimetermilimeter();

                                        break;
                                    case "micrometer":
                                        milecentimetermicrometer();

                                        break;
                                    case "nanometer":
                                        milecentimeternanometer();

                                        break;
                                    case "angstrom":
                                        milecentimeterangstrom();


                                        break;
                                }

                                break;
                            case "milimeter":
                                switch (StringTo) {
                                    case "mile":
                                        milemilimetermile();

                                        break;

                                    case "yard":
                                        milemilimeteryard();

                                        break;
                                    case "foot":
                                        milemilimeterfoot();

                                        break;
                                    case "inch":
                                        milemilimeterinch();

                                        break;
                                    case "kilometer":
                                        milemilimeterkilometer();

                                        break;
                                    case "meter":
                                        milemilimetermeter();

                                        break;
                                    case "centimeter":
                                        milemilimetercentimeter();

                                        break;

                                    case "milimeter":
                                        milemilimetermilimeter();

                                        break;
                                    case "micrometer":
                                        milemilimetermicrometer();

                                        break;
                                    case "nanometer":
                                        milemilimeternanometer();

                                        break;
                                    case "angstrom":
                                        milemilimeterangstrom();


                                        break;
                                }
                                break;
                            case "micrometer":
                                switch (StringTo) {
                                    case "mile":
                                        milemicrometermile();

                                        break;

                                    case "yard":
                                        milemicrometeryard();

                                        break;
                                    case "foot":
                                        milemicrometerfoot();

                                        break;
                                    case "inch":
                                        milemicrometerinch();

                                        break;
                                    case "kilometer":
                                        milemicrometerkilometer();

                                        break;
                                    case "meter":
                                        milemicrometermeter();

                                        break;
                                    case "centimeter":
                                        milemicrometercentimeter();

                                        break;

                                    case "milimeter":
                                        milemicrometermilimeter();

                                        break;
                                    case "micrometer":
                                        milemicrometermilimicrometer();

                                        break;
                                    case "nanometer":
                                        milemicrometermilinanometer();

                                        break;
                                    case "angstrom":
                                        milemicrometermiliangstrom();

                                        break;
                                }
                                break;

                            case "nanometer":
                                switch (StringTo) {
                                    case "mile":
                                        nanometermilemile();

                                        break;

                                    case "yard":
                                        nanometermileyard();

                                        break;
                                    case "foot":
                                        nanometermilefoot();

                                        break;
                                    case "inch":
                                        nanometermileinch();

                                        break;
                                    case "kilometer":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 1E12;
                                                convertheight = height * 1.609344e+12;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 1E12;
                                                convertheight = height * 914400000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 1E12;
                                                convertheight = height * 304800000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 1E12;
                                                convertheight = height * 25400000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 1E12;
                                                convertheight = height * 1E12;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 1E12;
                                                convertheight = height * 1000000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 1E12;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 1E12;
                                                convertheight = height * 1000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 1E12;
                                                convertheight = height * 1000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 1E12;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 1E12;
                                                convertheight = height * 0.1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                        }
                                        break;
                                    case "meter":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 1000000000;
                                                convertheight = height * 1.609344e+12;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 1000000000;
                                                convertheight = height * 914400000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 1000000000;
                                                convertheight = height * 304800000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 1000000000;
                                                convertheight = height * 25400000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 1000000000;
                                                convertheight = height * 1E12;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 1000000000;
                                                convertheight = height * 1000000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 1000000000;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 1000000000;
                                                convertheight = height * 1000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 1000000000;
                                                convertheight = height * 1000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 1000000000;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 1000000000;
                                                convertheight = height * 0.1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                        }
                                        break;
                                    case "centimeter":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 1.609344e+12;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 914400000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 304800000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 25400000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 1E12;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 1000000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 1000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 1000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 10000000;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 0.1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                        }
                                        break;

                                    case "milimeter":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 1000000;
                                                convertheight = height * 1.609344e+12;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 1000000;
                                                convertheight = height * 914400000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 1000000;
                                                convertheight = height * 304800000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 1000000;
                                                convertheight = height * 25400000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 1000000;
                                                convertheight = height * 1E12;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 1000000;
                                                convertheight = height * 1000000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 1000000;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 1000000;
                                                convertheight = height * 1000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 1000000;
                                                convertheight = height * 1000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 1000000;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 1000000;
                                                convertheight = height * 0.1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                        }
                                        break;
                                    case "micrometer":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 1000;
                                                convertheight = height * 1.609344e+12;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 1000;
                                                convertheight = height * 914400000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 1000;
                                                convertheight = height * 304800000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 1000;
                                                convertheight = height * 25400000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 1000;
                                                convertheight = height * 1E12;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 1000;
                                                convertheight = height * 1000000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 1000;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 1000;
                                                convertheight = height * 1000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 1000;
                                                convertheight = height * 1000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 1000;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 1000;
                                                convertheight = height * 0.1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                        }
                                        break;
                                    case "nanometer":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width;
                                                convertheight = height * 1.609344e+12;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^3");
                                                break;
                                            case "yard":
                                                convertwidth = width;
                                                convertheight = height * 914400000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "foot":
                                                convertwidth = width;
                                                convertheight = height * 304800000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "inch":
                                                convertwidth = width;
                                                convertheight = height * 25400000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width;
                                                convertheight = height * 1E12;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "meter":
                                                convertwidth = width;
                                                convertheight = height * 1000000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width;
                                                convertheight = height * 1000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width;
                                                convertheight = height * 1000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width;
                                                convertheight = height * 0.1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                        }
                                        break;
                                    case "angstrom":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 0.1;
                                                convertheight = height * 1.609344e+12;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 0.1;
                                                convertheight = height * 914400000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 0.1;
                                                convertheight = height * 304800000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 0.1;
                                                convertheight = height * 25400000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 0.1;
                                                convertheight = height * 1E12;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  nanometer^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 0.1;
                                                convertheight = height * 1000000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 0.1;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 0.1;
                                                convertheight = height * 1000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 0.1;
                                                convertheight = height * 1000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 0.1;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 0.1;
                                                convertheight = height * 0.1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                                                break;
                                        }

                                        break;
                                }


                            case "angstrom":
                                switch (StringTo) {
                                    case "mile":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 1.609344e+13;
                                                convertheight = height * 1.609344e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 1.609344e+13;
                                                convertheight = height * 0.9144000000E-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 1.609344e+13;
                                                convertheight = height * 0.3048000000e-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 1.609344e+13;
                                                convertheight = height * 254000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 1.609344e+13;
                                                convertheight = height * 1e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 1.609344e+13;
                                                convertheight = height * 1E10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 1.609344e+13;
                                                convertheight = height * 100000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 1.609344e+13;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 1.609344e+13;
                                                convertheight = height * 10000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 1.609344e+13;
                                                convertheight = height * 10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 1.609344e+13;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                        }
                                        break;

                                    case "yard":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 0.9144000000E-1;
                                                convertheight = height * 1.609344e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 0.9144000000E-1;
                                                convertheight = height * 0.9144000000E-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 0.9144000000E-1;
                                                convertheight = height * 0.3048000000e-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 0.9144000000E-1;
                                                convertheight = height * 254000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 0.9144000000E-1;
                                                convertheight = height * 1e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 0.9144000000E-1;
                                                convertheight = height * 1E10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 0.9144000000E-1;
                                                convertheight = height * 100000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 0.9144000000E-1;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 0.9144000000E-1;
                                                convertheight = height * 10000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 0.9144000000E-1;
                                                convertheight = height * 10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 0.9144000000E-1;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                        }
                                        break;
                                    case "foot":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 0.3048000000e-1;
                                                convertheight = height * 1.609344e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 0.3048000000e-1;
                                                convertheight = height * 0.9144000000E-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 0.3048000000e-1;
                                                convertheight = height * 0.3048000000e-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 0.3048000000e-1;
                                                convertheight = height * 254000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 0.3048000000e-1;
                                                convertheight = height * 1e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 0.3048000000e-1;
                                                convertheight = height * 1E10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 0.3048000000e-1;
                                                convertheight = height * 100000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 0.3048000000e-1;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 0.3048000000e-1;
                                                convertheight = height * 10000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 0.3048000000e-1;
                                                convertheight = height * 10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 0.3048000000e-1;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;

                                        }
                                        break;
                                    case "inch":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 254000000;
                                                convertheight = height * 1.609344e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 254000000;
                                                convertheight = height * 0.9144000000E-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 254000000;
                                                convertheight = height * 0.3048000000e-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 254000000;
                                                convertheight = height * 254000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 254000000;
                                                convertheight = height * 1e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 254000000;
                                                convertheight = height * 1E10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 254000000;
                                                convertheight = height * 100000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 254000000;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 254000000;
                                                convertheight = height * 10000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 254000000;
                                                convertheight = height * 10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 254000000;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                        }
                                        break;
                                    case "kilometer":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 1e+13;
                                                convertheight = height * 1.609344e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 1e+13;
                                                convertheight = height * 0.9144000000E-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 1e+13;
                                                convertheight = height * 0.3048000000e-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 1e+13;
                                                convertheight = height * 254000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 1e+13;
                                                convertheight = height * 1e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 1e+13;
                                                convertheight = height * 1E10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 1e+13;
                                                convertheight = height * 100000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 1e+13;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 1e+13;
                                                convertheight = height * 10000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 1e+13;
                                                convertheight = height * 10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 1e+13;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                        }
                                        break;
                                    case "meter":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 1E10;
                                                convertheight = height * 1.609344e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 1E10;
                                                convertheight = height * 0.9144000000E-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 1E10;
                                                convertheight = height * 0.3048000000e-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 1E10;
                                                convertheight = height * 254000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 1E10;
                                                convertheight = height * 1e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 1E10;
                                                convertheight = height * 1E10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 1E10;
                                                convertheight = height * 100000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 1E10;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 1E10;
                                                convertheight = height * 10000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 1E10;
                                                convertheight = height * 10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 1E10;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                        }
                                        break;
                                    case "centimeter":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 100000000;
                                                convertheight = height * 1.609344e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 100000000;
                                                convertheight = height * 0.9144000000E-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 100000000;
                                                convertheight = height * 0.3048000000e-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 100000000;
                                                convertheight = height * 254000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 100000000;
                                                convertheight = height * 1e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 100000000;
                                                convertheight = height * 1E10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 100000000;
                                                convertheight = height * 100000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 100000000;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 100000000;
                                                convertheight = height * 10000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 100000000;
                                                convertheight = height * 10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 100000000;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;

                                        }
                                        break;

                                    case "milimeter":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 1.609344e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 0.9144000000E-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 0.3048000000e-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 254000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 1e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 1E10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 100000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 10000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 10000000;
                                                convertheight = height * 10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 10000000;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                        }
                                        break;
                                    case "micrometer":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 10000;
                                                convertheight = height * 1.609344e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 10000;
                                                convertheight = height * 0.9144000000E-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 10000;
                                                convertheight = height * 0.3048000000e-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 10000;
                                                convertheight = height * 254000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 10000;
                                                convertheight = height * 1e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 10000;
                                                convertheight = height * 1E10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 10000;
                                                convertheight = height * 100000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 10000;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 10000;
                                                convertheight = height * 10000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 10000;
                                                convertheight = height * 10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 10000;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                        }
                                        break;
                                    case "nanometer":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width * 10;
                                                convertheight = height * 1.609344e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "yard":
                                                convertwidth = width * 10;
                                                convertheight = height * 0.9144000000E-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "foot":
                                                convertwidth = width * 10;
                                                convertheight = height * 0.3048000000e-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "inch":
                                                convertwidth = width * 10;
                                                convertheight = height * 254000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width * 10;
                                                convertheight = height * 1e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "meter":
                                                convertwidth = width * 10;
                                                convertheight = height * 1E10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width * 10;
                                                convertheight = height * 100000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width * 10;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width * 10;
                                                convertheight = height * 10000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width * 10;
                                                convertheight = height * 10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 10;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                        }
                                        break;
                                    case "angstrom":
                                        switch (StringToTo) {
                                            case "mile":
                                                convertwidth = width;
                                                convertheight = height * 1.609344e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "yard":
                                                convertwidth = width;
                                                convertheight = height * 0.9144000000E-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "foot":
                                                convertwidth = width;
                                                convertheight = height * 0.3048000000e-1;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "inch":
                                                convertwidth = width;
                                                convertheight = height * 254000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "kilometer":
                                                convertwidth = width;
                                                convertheight = height * 1e+13;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + "  angstrom^3");
                                                break;
                                            case "meter":
                                                convertwidth = width;
                                                convertheight = height * 1E10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^3");
                                                break;
                                            case "centimeter":
                                                convertwidth = width;
                                                convertheight = height * 100000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "milimeter":
                                                convertwidth = width;
                                                convertheight = height * 10000000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "micrometer":
                                                convertwidth = width;
                                                convertheight = height * 10000;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "nanometer":
                                                convertwidth = width;
                                                convertheight = height * 10;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                            case "angstrom":
                                                convertwidth = width * 10;
                                                convertheight = height;
                                                result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                                                textViewResultrectVolume.setText("" + result + " angstrom^ 3");
                                                break;
                                        }

                                        break;
                                }


                        }
                    }


                    // textViewResultConeVolume.setText(formatter.format(result));
                }



            });
            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textViewResultrectVolume.setVisibility(View.GONE);
                    editTextLength.setText("");
                    editTextHeight.setText("");
                    editTextWidth.setText("");
                }
            });

            return view;
        }

        private void nanometermileinch() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 25400000;
                    convertheight = height * 1.609344e+12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^3");
                    break;
                case "yard":
                    convertwidth = width * 25400000;
                    convertheight = height * 914400000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "foot":
                    convertwidth = width * 25400000;
                    convertheight = height * 304800000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "inch":
                    convertwidth = width * 25400000;
                    convertheight = height * 25400000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 25400000;
                    convertheight = height * 1E12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "meter":
                    convertwidth = width * 25400000;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 25400000;
                    convertheight = height * 10000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 25400000;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 25400000;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 25400000;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 25400000;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
            }
        }

        private void nanometermilefoot() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 304800000;
                    convertheight = height * 1.609344e+12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^3");
                    break;
                case "yard":
                    convertwidth = width * 304800000;
                    convertheight = height * 914400000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "foot":
                    convertwidth = width * 304800000;
                    convertheight = height * 304800000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "inch":
                    convertwidth = width * 304800000;
                    convertheight = height * 25400000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 304800000;
                    convertheight = height * 1E12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "meter":
                    convertwidth = width * 304800000;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 304800000;
                    convertheight = height * 10000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 304800000;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 304800000;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 304800000;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 304800000;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;

            }
        }

        private void nanometermileyard() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 914400000;
                    convertheight = height * 1.609344e+12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^3");
                    break;
                case "yard":
                    convertwidth = width * 914400000;
                    convertheight = height * 914400000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "foot":
                    convertwidth = width * 914400000;
                    convertheight = height * 304800000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "inch":
                    convertwidth = width * 914400000;
                    convertheight = height * 25400000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 914400000;
                    convertheight = height * 1E12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "meter":
                    convertwidth = width * 914400000;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 914400000;
                    convertheight = height * 10000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 914400000;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 914400000;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 914400000;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 914400000;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
            }
        }

        private void nanometermilemile() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1.609344e+12;
                    convertheight = height * 1.609344e+12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " nanometer^3");
                    break;
                case "yard":
                    convertwidth = width * 1.609344e+12;
                    convertheight = height * 914400000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "foot":
                    convertwidth = width * 1.609344e+12;
                    convertheight = height * 304800000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "inch":
                    convertwidth = width * 1.609344e+12;
                    convertheight = height * 25400000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1.609344e+12;
                    convertheight = height * 1E12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  nanometer^3");
                    break;
                case "meter":
                    convertwidth = width * 1.609344e+12;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " nanometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1.609344e+12;
                    convertheight = height * 10000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1.609344e+12;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1.609344e+12;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1.609344e+12;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1.609344e+12;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " nanometer^ 3");
                    break;
            }
        }

        private void milemicrometermiliangstrom() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.0001;
                    convertheight = height * 1609344000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "yard":
                    convertwidth = width * 0.0001;
                    convertheight = height * 914400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "foot":
                    convertwidth = width * 0.0001;
                    convertheight = height * 304800;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "inch":
                    convertwidth = width * 0.0001;
                    convertheight = height * 25400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.0001;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 0.0001;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.0001;
                    convertheight = height * 10000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.0001;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.0001;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.0001;
                    convertheight = height * 0.0009999999999999;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.0001;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
            }

        }

        private void milemicrometermilinanometer() {

            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.0009999999999999;
                    convertheight = height * 1609344000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "yard":
                    convertwidth = width * 0.0009999999999999;
                    convertheight = height * 914400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "foot":
                    convertwidth = width * 0.0009999999999999;
                    convertheight = height * 304800;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "inch":
                    convertwidth = width * 0.0009999999999999;
                    convertheight = height * 25400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.0009999999999999;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 0.0009999999999999;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.0009999999999999;
                    convertheight = height * 10000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.0009999999999999;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.0009999999999999;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.0009999999999999;
                    convertheight = height * 0.0009999999999999;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.0009999999999999;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
            }
        }

        private void milemicrometermilimicrometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width;
                    convertheight = height * 1609344000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "yard":
                    convertwidth = width;
                    convertheight = height * 914400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "foot":
                    convertwidth = width;
                    convertheight = height * 304800;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "inch":
                    convertwidth = width;
                    convertheight = height * 25400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "kilometer":
                    convertwidth = width;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "centimeter":
                    convertwidth = width;
                    convertheight = height * 10000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width;
                    convertheight = height * 0.0009999999999999;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
            }
        }

        private void milemicrometermilimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1000;
                    convertheight = height * 1609344000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "yard":
                    convertwidth = width * 1000;
                    convertheight = height * 914400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "foot":
                    convertwidth = width * 1000;
                    convertheight = height * 304800;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "inch":
                    convertwidth = width * 1000;
                    convertheight = height * 25400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1000;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 1000;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1000;
                    convertheight = height * 10000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1000;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1000;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1000;
                    convertheight = height * 0.0009999999999999;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1000;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
            }
        }

        private void milemicrometercentimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 10000;
                    convertheight = height * 1609344000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "yard":
                    convertwidth = width * 10000;
                    convertheight = height * 914400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "foot":
                    convertwidth = width * 10000;
                    convertheight = height * 304800;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "inch":
                    convertwidth = width * 10000;
                    convertheight = height * 25400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 10000;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 10000;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 10000;
                    convertheight = height * 10000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 10000;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 10000;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 10000;
                    convertheight = height * 0.0009999999999999;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 10000;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
            }
        }

        private void milemicrometermeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1000000;
                    convertheight = height * 1609344000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "yard":
                    convertwidth = width * 1000000;
                    convertheight = height * 914400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "foot":
                    convertwidth = width * 1000000;
                    convertheight = height * 304800;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "inch":
                    convertwidth = width * 1000000;
                    convertheight = height * 25400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1000000;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "meter":
                    convertwidth = width * 1000000;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1000000;
                    convertheight = height * 10000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1000000;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1000000;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1000000;
                    convertheight = height * 0.0009999999999999;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1000000;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
            }
        }

        private void milemicrometerkilometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1000000000;
                    convertheight = height * 1609344000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "yard":
                    convertwidth = width * 1000000000;
                    convertheight = height * 914400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "foot":
                    convertwidth = width * 1000000000;
                    convertheight = height * 304800;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "inch":
                    convertwidth = width * 1000000000;
                    convertheight = height * 25400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1000000000;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "meter":
                    convertwidth = width * 1000000000;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1000000000;
                    convertheight = height * 10000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1000000000;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1000000000;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1000000000;
                    convertheight = height * 0.0009999999999999;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1000000000;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
            }
        }

        private void milemicrometerinch() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 25400;
                    convertheight = height * 1609344000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "yard":
                    convertwidth = width * 25400;
                    convertheight = height * 914400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "foot":
                    convertwidth = width * 25400;
                    convertheight = height * 304800;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "inch":
                    convertwidth = width * 25400;
                    convertheight = height * 25400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 25400;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "meter":
                    convertwidth = width * 25400;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 25400;
                    convertheight = height * 10000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 25400;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 25400;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 25400;
                    convertheight = height * 0.0009999999999999;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 25400;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");

            }
        }

        private void milemicrometerfoot() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 304800;
                    convertheight = height * 1609344000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "yard":
                    convertwidth = width * 304800;
                    convertheight = height * 914400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "foot":
                    convertwidth = width * 304800;
                    convertheight = height * 304800;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "inch":
                    convertwidth = width * 304800;
                    convertheight = height * 25400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 304800;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "meter":
                    convertwidth = width * 304800;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 304800;
                    convertheight = height * 10000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 304800;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 304800;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 304800;
                    convertheight = height * 0.0009999999999999;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 304800;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
            }
        }

        private void milemicrometeryard() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 914400;
                    convertheight = height * 1609344000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "yard":
                    convertwidth = width * 914400;
                    convertheight = height * 914400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "foot":
                    convertwidth = width * 914400;
                    convertheight = height * 304800;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "inch":
                    convertwidth = width * 914400;
                    convertheight = height * 25400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 914400;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "meter":
                    convertwidth = width * 914400;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 914400;
                    convertheight = height * 10000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 914400;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 914400;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 914400;
                    convertheight = height * 0.0009999999999999;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 914400;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
            }
        }

        private void milemicrometermile() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1609344000;
                    convertheight = height * 1609344000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "yard":
                    convertwidth = width * 1609344000;
                    convertheight = height * 914400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "foot":
                    convertwidth = width * 1609344000;
                    convertheight = height * 304800;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "inch":
                    convertwidth = width * 1609344000;
                    convertheight = height * 25400;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  micrometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1609344000;
                    convertheight = height * 1000000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 1609344000;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1609344000;
                    convertheight = height * 10000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1609344000;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1609344000;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1609344000;
                    convertheight = height * 0.0009999999999999;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1609344000;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " micrometer^ 3");
                    break;
            }
        }

        private void milemilimeterangstrom() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1e-7;
                    convertheight = height * 1609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 1e-7;
                    convertheight = height * 914.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 1e-7;
                    convertheight = height * 304.8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 1e-7;
                    convertheight = height * 25.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1e-7;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 1e-7;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1e-7;
                    convertheight = height * 10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1e-7;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1e-7;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1e-7;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1e-7;
                    convertheight = height * 1e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
            }
        }

        private void milemilimeternanometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 1609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 914.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 304.8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 25.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 1e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
            }
        }

        private void milemilimetermicrometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.001;
                    convertheight = height * 1609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 0.001;
                    convertheight = height * 914.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 0.001;
                    convertheight = height * 304.8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 0.001;
                    convertheight = height * 25.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.001;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 0.001;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.001;
                    convertheight = height * 10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.001;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.001;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.001;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.001;
                    convertheight = height * 1e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
            }
        }

        private void milemilimetermilimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width;
                    convertheight = height * 1609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "yard":
                    convertwidth = width;
                    convertheight = height * 914.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "foot":
                    convertwidth = width;
                    convertheight = height * 304.8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "inch":
                    convertwidth = width;
                    convertheight = height * 25.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width;
                    convertheight = height * 10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width;
                    convertheight = height * 1e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
            }
        }

        private void milemilimetercentimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 10;
                    convertheight = height * 1609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 10;
                    convertheight = height * 914.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 10;
                    convertheight = height * 304.8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 10;
                    convertheight = height * 25.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 10;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 10;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 10;
                    convertheight = height * 10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 10;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 10;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 10;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 10;
                    convertheight = height * 1e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
            }
        }

        private void milemilimetermeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1000;
                    convertheight = height * 1609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 1000;
                    convertheight = height * 914.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 1000;
                    convertheight = height * 304.8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 1000;
                    convertheight = height * 25.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1000;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 1000;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1000;
                    convertheight = height * 10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1000;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1000;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1000;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1000;
                    convertheight = height * 1e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
            }
        }

        private void milemilimeterkilometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1000000;
                    convertheight = height * 1609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 1000000;
                    convertheight = height * 914.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 1000000;
                    convertheight = height * 304.8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 1000000;
                    convertheight = height * 25.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1000000;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 1000000;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1000000;
                    convertheight = height * 10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1000000;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1000000;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1000000;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1000000;
                    convertheight = height * 1e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
            }
        }

        private void milemilimeterinch() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 25.4;
                    convertheight = height * 1609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 25.4;
                    convertheight = height * 914.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 25.4;
                    convertheight = height * 304.8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 25.4;
                    convertheight = height * 25.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 25.4;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 25.4;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 25.4;
                    convertheight = height * 10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 25.4;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 25.4;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 25.4;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 25.4;
                    convertheight = height * 1e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
            }
        }

        private void milemilimeterfoot() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 304.8;
                    convertheight = height * 1609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 304.8;
                    convertheight = height * 914.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 304.8;
                    convertheight = height * 304.8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 304.8;
                    convertheight = height * 25.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 304.8;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 304.8;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 304.8;
                    convertheight = height * 10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 304.8;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 304.8;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 304.8;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 304.8;
                    convertheight = height * 1e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
            }
        }

        private void milemilimeteryard() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 914.4;
                    convertheight = height * 1609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 914.4;
                    convertheight = height * 914.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 914.4;
                    convertheight = height * 304.8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 914.4;
                    convertheight = height * 25.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 914.4;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 914.4;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 914.4;
                    convertheight = height * 10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 914.4;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 914.4;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 914.4;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 914.4;
                    convertheight = height * 1e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
            }
        }

        private void milemilimetermile() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1609344;
                    convertheight = height * 1609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 1609344;
                    convertheight = height * 914.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 1609344;
                    convertheight = height * 304.8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 1609344;
                    convertheight = height * 25.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1609344;
                    convertheight = height * 1000000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  milimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 1609344;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1609344;
                    convertheight = height * 10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1609344;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1609344;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1609344;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1609344;
                    convertheight = height * 1e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " milimeter^ 3");
                    break;
            }
        }

        private void milecentimeterangstrom() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1e-8;
                    convertheight = height * 160934.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 1e-8;
                    convertheight = height * 91.44;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 1e-8;
                    convertheight = height * 30.48;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 1e-8;
                    convertheight = height * 2.54;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1e-8;
                    convertheight = height * 100000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 1e-8;
                    convertheight = height * 100;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1e-8;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1e-8;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1e-8;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1e-8;
                    convertheight = height * 9.999999999999e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1e-8;
                    convertheight = height * 1e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
            }
        }

        private void milecentimeternanometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 9.999999999999e-8;
                    convertheight = height * 160934.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 9.999999999999e-8;
                    convertheight = height * 91.44;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 9.999999999999e-8;
                    convertheight = height * 30.48;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 9.999999999999e-8;
                    convertheight = height * 2.54;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 9.999999999999e-8;
                    convertheight = height * 100000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 9.999999999999e-8;
                    convertheight = height * 100;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 9.999999999999e-8;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 9.999999999999e-8;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 9.999999999999e-8;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 9.999999999999e-8;
                    convertheight = height * 9.999999999999e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 9.999999999999e-8;
                    convertheight = height * 1e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
            }
        }

        private void milecentimetermicrometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.0001;
                    convertheight = height * 160934.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 0.0001;
                    convertheight = height * 91.44;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 0.0001;
                    convertheight = height * 30.48;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 0.0001;
                    convertheight = height * 2.54;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.0001;
                    convertheight = height * 100000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 0.0001;
                    convertheight = height * 100;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.0001;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.0001;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.0001;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.0001;
                    convertheight = height * 9.999999999999e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.0001;
                    convertheight = height * 1e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
            }
        }

        private void milecentimetermilimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.1;
                    convertheight = height * 160934.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 0.1;
                    convertheight = height * 91.44;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 0.1;
                    convertheight = height * 30.48;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 0.1;
                    convertheight = height * 2.54;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.1;
                    convertheight = height * 100000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 0.1;
                    convertheight = height * 100;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.1;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.1;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.1;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.1;
                    convertheight = height * 9.999999999999e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.1;
                    convertheight = height * 1e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
            }
        }

        private void milecentimetercentimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width;
                    convertheight = height * 160934.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "yard":
                    convertwidth = width;
                    convertheight = height * 91.44;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "foot":
                    convertwidth = width;
                    convertheight = height * 30.48;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "inch":
                    convertwidth = width;
                    convertheight = height * 2.54;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width;
                    convertheight = height * 100000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "meter":
                    convertwidth = width;
                    convertheight = height * 100;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width;
                    convertheight = height * 9.999999999999e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width;
                    convertheight = height * 1e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
            }
        }

        private void milecentimetermeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 100;
                    convertheight = height * 160934.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 100;
                    convertheight = height * 91.44;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 100;
                    convertheight = height * 30.48;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 100;
                    convertheight = height * 2.54;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 100;
                    convertheight = height * 100000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 100;
                    convertheight = height * 100;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 100;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 100;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 100;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 100;
                    convertheight = height * 9.999999999999e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 100;
                    convertheight = height * 1e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
            }
        }

        private void milecentimeterkilometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 100000;
                    convertheight = height * 160934.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 100000;
                    convertheight = height * 91.44;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 100000;
                    convertheight = height * 30.48;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 100000;
                    convertheight = height * 2.54;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 100000;
                    convertheight = height * 100000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 100000;
                    convertheight = height * 100;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 100000;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 100000;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 100000;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 100000;
                    convertheight = height * 9.999999999999e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 100000;
                    convertheight = height * 1e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
            }
        }

        private void milecentimeterinch() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 2.54;
                    convertheight = height * 160934.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 2.54;
                    convertheight = height * 91.44;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 2.54;
                    convertheight = height * 30.48;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 2.54;
                    convertheight = height * 2.54;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 2.54;
                    convertheight = height * 100000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 2.54;
                    convertheight = height * 100;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 2.54;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 2.54;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 2.54;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 2.54;
                    convertheight = height * 9.999999999999e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 2.54;
                    convertheight = height * 1e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
            }
        }

        private void milecentimeterfoot() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 30.48;
                    convertheight = height * 160934.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 30.48;
                    convertheight = height * 91.44;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 30.48;
                    convertheight = height * 30.48;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 30.48;
                    convertheight = height * 2.54;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 30.48;
                    convertheight = height * 100000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 30.48;
                    convertheight = height * 100;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 30.48;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 30.48;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 30.48;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 30.48;
                    convertheight = height * 9.999999999999e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 30.48;
                    convertheight = height * 1e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
            }
        }

        private void milecentimeteryard() {
            switch (StringToTo) {

                case "mile":
                    convertwidth = width * 91.44;
                    convertheight = height * 160934.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 91.44;
                    convertheight = height * 91.44;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 91.44;
                    convertheight = height * 30.48;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 91.44;
                    convertheight = height * 2.54;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 91.44;
                    convertheight = height * 100000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 91.44;
                    convertheight = height * 100;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 91.44;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 91.44;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 91.44;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 91.44;
                    convertheight = height * 9.999999999999e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 91.44;
                    convertheight = height * 1e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
            }
        }

        private void milecentimetermile() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 160934.4;
                    convertheight = height * 160934.4;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "yard":
                    convertwidth = width * 160934.4;
                    convertheight = height * 91.44;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "foot":
                    convertwidth = width * 160934.4;
                    convertheight = height * 30.48;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "inch":
                    convertwidth = width * 160934.4;
                    convertheight = height * 2.54;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "kilometer":
                    convertwidth = width * 160934.4;
                    convertheight = height * 100000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  centimeter^3");
                    break;
                case "meter":
                    convertwidth = width * 160934.4;
                    convertheight = height * 100;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^3");
                    break;
                case "centimeter":
                    convertwidth = width * 160934.4;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 160934.4;
                    convertheight = height * 0.1;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 160934.4;
                    convertheight = height * 0.0001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 160934.4;
                    convertheight = height * 9.999999999999e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 160934.4;
                    convertheight = height * 1e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " centimeter^ 3");
                    break;
            }
        }

        private void milemeterangstrom() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1e-10;
                    convertheight = height * 1609.344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 1e-10;
                    convertheight = height * 0.9144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 1e-10;
                    convertheight = height * 0.3048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 1e-10;
                    convertheight = height * 0.0254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1e-10;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 1e-10;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1e-10;
                    convertheight = height * 0.01;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1e-10;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1e-10;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1e-10;
                    convertheight = height * 9.999999999999e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1e-10;
                    convertheight = height * 1e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milemeternanometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 9.999999999999e-10;
                    convertheight = height * 1609.344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 9.999999999999e-10;
                    convertheight = height * 0.9144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 9.999999999999e-10;
                    convertheight = height * 0.3048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 9.999999999999e-10;
                    convertheight = height * 0.0254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 9.999999999999e-10;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 9.999999999999e-10;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 9.999999999999e-10;
                    convertheight = height * 0.01;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 9.999999999999e-10;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 9.999999999999e-10;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 9.999999999999e-10;
                    convertheight = height * 9.999999999999e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 9.999999999999e-10;
                    convertheight = height * 1e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milemetermicrometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 1609.344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 0.9144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 0.3048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 0.0254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 0.01;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 9.999999999999e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 9.999999999999e-7;
                    convertheight = height * 1e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milemetermilimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.001;
                    convertheight = height * 1609.344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 0.001;
                    convertheight = height * 0.9144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 0.001;
                    convertheight = height * 0.3048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 0.001;
                    convertheight = height * 0.0254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.001;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 0.001;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.001;
                    convertheight = height * 0.01;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.001;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.001;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.001;
                    convertheight = height * 9.999999999999e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.001;
                    convertheight = height * 1e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milemetercentimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.01;
                    convertheight = height * 1609.344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 0.01;
                    convertheight = height * 0.9144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 0.01;
                    convertheight = height * 0.3048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 0.01;
                    convertheight = height * 0.0254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.01;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 0.01;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.01;
                    convertheight = height * 0.01;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.01;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.01;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.01;
                    convertheight = height * 9.999999999999e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.01;
                    convertheight = height * 1e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milemetermeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width;
                    convertheight = height * 1609.344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width;
                    convertheight = height * 0.9144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width;
                    convertheight = height * 0.3048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width;
                    convertheight = height * 0.0254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width;
                    convertheight = height * 0.01;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width;
                    convertheight = height * 9.999999999999e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width;
                    convertheight = height * 1e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milemeterkilometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1000;
                    convertheight = height * 1609.344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 1000;
                    convertheight = height * 0.9144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 1000;
                    convertheight = height * 0.3048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 1000;
                    convertheight = height * 0.0254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1000;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 1000;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1000;
                    convertheight = height * 0.01;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1000;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1000;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1000;
                    convertheight = height * 9.999999999999e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1000;
                    convertheight = height * 1e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milemeterinch() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.0254;
                    convertheight = height * 1609.344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 0.0254;
                    convertheight = height * 0.9144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 0.0254;
                    convertheight = height * 0.3048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 0.0254;
                    convertheight = height * 0.0254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.0254;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 0.0254;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.0254;
                    convertheight = height * 0.01;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.0254;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.0254;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.0254;
                    convertheight = height * 9.999999999999e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.0254;
                    convertheight = height * 1e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milemeterfoot() {
            switch (StringToTo) {

                case "mile":
                    convertwidth = width * 0.3048;
                    convertheight = height * 1609.344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 0.3048;
                    convertheight = height * 0.9144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 0.3048;
                    convertheight = height * 0.3048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 0.3048;
                    convertheight = height * 0.0254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.3048;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 0.3048;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.3048;
                    convertheight = height * 0.01;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.3048;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.3048;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.3048;
                    convertheight = height * 9.999999999999e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.3048;
                    convertheight = height * 1e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milemeteryard() {
            switch (StringToTo) {

                case "mile":
                    convertwidth = width * 0.9144;
                    convertheight = height * 1609.344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 0.9144;
                    convertheight = height * 0.9144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 0.9144;
                    convertheight = height * 0.3048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 0.9144;
                    convertheight = height * 0.0254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.9144;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 0.9144;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.9144;
                    convertheight = height * 0.01;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.9144;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.9144;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.9144;
                    convertheight = height * 9.999999999999e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.9144;
                    convertheight = height * 1e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milemetermile() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1609.344;
                    convertheight = height * 1609.344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 1609.344;
                    convertheight = height * 0.9144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 1609.344;
                    convertheight = height * 0.3048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 1609.344;
                    convertheight = height * 0.0254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1609.344;
                    convertheight = height * 1000;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 1609.344;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1609.344;
                    convertheight = height * 0.01;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1609.344;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1609.344;
                    convertheight = height * 9.999999999999e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1609.344;
                    convertheight = height * 9.999999999999e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1609.344;
                    convertheight = height * 1e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milekilometerangstrom() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1e-13;
                    convertheight = height * 1.609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 1e-13;
                    convertheight = height * 0.0009144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 1e-13;
                    convertheight = height * 0.0003048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 1e-13;
                    convertheight = height * 0.0000254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1e-13;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 1e-13;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1e-13;
                    convertheight = height * 0.00001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1e-13;
                    convertheight = height * 0.000001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1e-13;
                    convertheight = height * 1e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1e-13;
                    convertheight = height * 9.999999999999e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1e-13;
                    convertheight = height * 1e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }

        }

        private void milekilometernanometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 9.999999999999e-13;
                    convertheight = height * 1.609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 9.999999999999e-13;
                    convertheight = height * 0.0009144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 9.999999999999e-13;
                    convertheight = height * 0.0003048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 9.999999999999e-13;
                    convertheight = height * 0.0000254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 9.999999999999e-13;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 9.999999999999e-13;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 9.999999999999e-13;
                    convertheight = height * 0.00001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 9.999999999999e-13;
                    convertheight = height * 0.000001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 9.999999999999e-13;
                    convertheight = height * 1e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 9.999999999999e-13;
                    convertheight = height * 9.999999999999e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 9.999999999999e-13;
                    convertheight = height * 1e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milekilometermicrometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1e-9;
                    convertheight = height * 1.609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 1e-9;
                    convertheight = height * 0.0009144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 1e-9;
                    convertheight = height * 0.0003048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 1e-9;
                    convertheight = height * 0.0000254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1e-9;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 1e-9;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1e-9;
                    convertheight = height * 0.00001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1e-9;
                    convertheight = height * 0.000001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1e-9;
                    convertheight = height * 1e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1e-9;
                    convertheight = height * 9.999999999999e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1e-9;
                    convertheight = height * 1e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milekilometermilimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.000001;
                    convertheight = height * 1.609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 0.000001;
                    convertheight = height * 0.0009144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 0.000001;
                    convertheight = height * 0.0003048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 0.000001;
                    convertheight = height * 0.0000254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.000001;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 0.000001;
                    convertheight = height * 0.001;
                    result = radius * convertwidth * convertheight;
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.000001;
                    convertheight = height * 0.00001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.000001;
                    convertheight = height * 0.000001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.000001;
                    convertheight = height * 1e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.000001;
                    convertheight = height * 9.999999999999e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.000001;
                    convertheight = height * 1e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milekilometercentimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.00001;
                    convertheight = height * 1.609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 0.00001;
                    convertheight = height * 0.0009144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 0.00001;
                    convertheight = height * 0.0003048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 0.00001;
                    convertheight = height * 0.0000254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.00001;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 0.00001;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.00001;
                    convertheight = height * 0.00001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.00001;
                    convertheight = height * 0.000001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.00001;
                    convertheight = height * 1e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.00001;
                    convertheight = height * 9.999999999999e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.00001;
                    convertheight = height * 1e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milekilometermeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.001;
                    convertheight = height * 1.609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 0.001;
                    convertheight = height * 0.0009144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 0.001;
                    convertheight = height * 0.0003048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 0.001;
                    convertheight = height * 0.0000254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.001;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 0.001;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.001;
                    convertheight = height * 0.00001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.001;
                    convertheight = height * 0.000001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.001;
                    convertheight = height * 1e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.001;
                    convertheight = height * 9.999999999999e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.001;
                    convertheight = height * 1e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milekilometerkilometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width;
                    convertheight = height * 1.609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width;
                    convertheight = height * 0.0009144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width;
                    convertheight = height * 0.0003048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width;
                    convertheight = height * 0.0000254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width;
                    convertheight = height * 0.00001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width;
                    convertheight = height * 0.000001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width;
                    convertheight = height * 1e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width;
                    convertheight = height * 9.999999999999e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width;
                    convertheight = height * 1e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milekilometerinch() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.0000254;
                    convertheight = height * 1.609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 0.0000254;
                    convertheight = height * 0.0009144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 0.0000254;
                    convertheight = height * 0.0003048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 0.0000254;
                    convertheight = height * 0.0000254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.0000254;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 0.0000254;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.0000254;
                    convertheight = height * 0.00001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.0000254;
                    convertheight = height * 0.000001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.0000254;
                    convertheight = height * 1e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.0000254;
                    convertheight = height * 9.999999999999e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.0000254;
                    convertheight = height * 1e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milekilometerfoot() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.0003048;
                    convertheight = height * 1.609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 0.0003048;
                    convertheight = height * 0.0009144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 0.0003048;
                    convertheight = height * 0.0003048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 0.0003048;
                    convertheight = height * 0.0000254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.0003048;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 0.0003048;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.0003048;
                    convertheight = height * 0.00001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.0003048;
                    convertheight = height * 0.000001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.0003048;
                    convertheight = height * 1e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.0003048;
                    convertheight = height * 9.999999999999e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.0003048;
                    convertheight = height * 1e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milekilometeryard() {
            switch (StringToTo) {

                case "mile":
                    convertwidth = width * 0.0009144;
                    convertheight = height * 1.609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 0.0009144;
                    convertheight = height * 0.0009144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 0.0009144;
                    convertheight = height * 0.0003048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 0.0009144;
                    convertheight = height * 0.0000254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.0009144;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 0.0009144;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.0009144;
                    convertheight = height * 0.00001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.0009144;
                    convertheight = height * 0.000001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.0009144;
                    convertheight = height * 1e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.0009144;
                    convertheight = height * 9.999999999999e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.0009144;
                    convertheight = height * 1e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void milekilometermile() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1.609344;
                    convertheight = height * 1.609344;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "yard":
                    convertwidth = width * 1.609344;
                    convertheight = height * 0.0009144;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "foot":
                    convertwidth = width * 1.609344;
                    convertheight = height * 0.0003048;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "inch":
                    convertwidth = width * 1.609344;
                    convertheight = height * 0.0000254;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1.609344;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  kilometer^3");
                    break;
                case "meter":
                    convertwidth = width * 1.609344;
                    convertheight = height * 0.001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1.609344;
                    convertheight = height * 0.00001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1.609344;
                    convertheight = height * 0.000001;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1.609344;
                    convertheight = height * 1e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1.609344;
                    convertheight = height * 9.999999999999e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1.609344;
                    convertheight = height * 1e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " kilometer^ 3");
                    break;
            }
        }

        private void mileinchangstrom() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 3.937007874016e-9;
                    convertheight = height * 63360;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "yard":
                    convertwidth = width * 3.937007874016e-9;
                    convertheight = height * 36;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "foot":
                    convertwidth = width * 3.937007874016e-9;
                    convertheight = height * 12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "inch":
                    convertwidth = width * 3.937007874016e-9;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "kilometer":
                    convertwidth = width * 3.937007874016e-9;
                    convertheight = height * 39370.07874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "meter":
                    convertwidth = width * 3.937007874016e-9;
                    convertheight = height * 39.37007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "centimeter":
                    convertwidth = width * 3.937007874016e-9;
                    convertheight = height * 0.3937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 3.937007874016e-9;
                    convertheight = height * 0.03937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 3.937007874016e-9;
                    convertheight = height * 0.00003937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 3.937007874016e-9;
                    convertheight = height * 3.937007874016e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 3.937007874016e-9;
                    convertheight = height * 3.937007874016e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
            }
        }

        private void mileinchnanometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 3.937007874016e-8;
                    convertheight = height * 63360;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "yard":
                    convertwidth = width * 3.937007874016e-8;
                    convertheight = height * 36;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "foot":
                    convertwidth = width * 3.937007874016e-8;
                    convertheight = height * 12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "inch":
                    convertwidth = width * 3.937007874016e-8;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "kilometer":
                    convertwidth = width * 3.937007874016e-8;
                    convertheight = height * 39370.07874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "meter":
                    convertwidth = width * 3.937007874016e-8;
                    convertheight = height * 39.37007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "centimeter":
                    convertwidth = width * 3.937007874016e-8;
                    convertheight = height * 0.3937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 3.937007874016e-8;
                    convertheight = height * 0.03937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 3.937007874016e-8;
                    convertheight = height * 0.00003937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 3.937007874016e-8;
                    convertheight = height * 3.937007874016e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 3.937007874016e-8;
                    convertheight = height * 3.937007874016e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
            }
        }

        private void mileinchmicrometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.00003937007874016;
                    convertheight = height * 63360;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "yard":
                    convertwidth = width * 0.00003937007874016;
                    convertheight = height * 36;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "foot":
                    convertwidth = width * 0.00003937007874016;
                    convertheight = height * 12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "inch":
                    convertwidth = width * 0.00003937007874016;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.00003937007874016;
                    convertheight = height * 39370.07874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "meter":
                    convertwidth = width * 0.00003937007874016;
                    convertheight = height * 39.37007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.00003937007874016;
                    convertheight = height * 0.3937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.00003937007874016;
                    convertheight = height * 0.03937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.00003937007874016;
                    convertheight = height * 0.00003937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.00003937007874016;
                    convertheight = height * 3.937007874016e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.00003937007874016;
                    convertheight = height * 3.937007874016e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
            }
        }

        private void mileinchmilimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.03937007874016;
                    convertheight = height * 63360;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "yard":
                    convertwidth = width * 0.03937007874016;
                    convertheight = height * 36;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "foot":
                    convertwidth = width * 0.03937007874016;
                    convertheight = height * 12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "inch":
                    convertwidth = width * 0.03937007874016;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.03937007874016;
                    convertheight = height * 39370.07874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "meter":
                    convertwidth = width * 0.03937007874016;
                    convertheight = height * 39.37007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.03937007874016;
                    convertheight = height * 0.3937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.03937007874016;
                    convertheight = height * 0.03937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.03937007874016;
                    convertheight = height * 0.00003937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.03937007874016;
                    convertheight = height * 3.937007874016e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.03937007874016;
                    convertheight = height * 3.937007874016e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
            }
        }

        private void mileinchcentimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.3937007874016;
                    convertheight = height * 63360;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "yard":
                    convertwidth = width * 0.3937007874016;
                    convertheight = height * 36;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "foot":
                    convertwidth = width * 0.3937007874016;
                    convertheight = height * 12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "inch":
                    convertwidth = width * 0.3937007874016;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.3937007874016;
                    convertheight = height * 39370.07874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "meter":
                    convertwidth = width * 0.3937007874016;
                    convertheight = height * 39.37007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.3937007874016;
                    convertheight = height * 0.3937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.3937007874016;
                    convertheight = height * 0.03937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.3937007874016;
                    convertheight = height * 0.00003937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.3937007874016;
                    convertheight = height * 3.937007874016e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.3937007874016;
                    convertheight = height * 3.937007874016e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
            }
        }

        private void mileinchmeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 39.37007874016;
                    convertheight = height * 63360;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "yard":
                    convertwidth = width * 39.37007874016;
                    convertheight = height * 36;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "foot":
                    convertwidth = width * 39.37007874016;
                    convertheight = height * 12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "inch":
                    convertwidth = width * 39.37007874016;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "kilometer":
                    convertwidth = width * 39.37007874016;
                    convertheight = height * 39370.07874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "meter":
                    convertwidth = width * 39.37007874016;
                    convertheight = height * 39.37007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot^3");
                    break;
                case "centimeter":
                    convertwidth = width * 39.37007874016;
                    convertheight = height * 0.3937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 39.37007874016;
                    convertheight = height * 0.03937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 39.37007874016;
                    convertheight = height * 0.00003937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 39.37007874016;
                    convertheight = height * 3.937007874016e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 39.37007874016;
                    convertheight = height * 3.937007874016e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
            }
        }

        private void mileinchkilometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 39370.07874016;
                    convertheight = height * 63360;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "yard":
                    convertwidth = width * 39370.07874016;
                    convertheight = height * 36;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "foot":
                    convertwidth = width * 39370.07874016;
                    convertheight = height * 12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "inch":
                    convertwidth = width * 39370.07874016;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "kilometer":
                    convertwidth = width * 39370.07874016;
                    convertheight = height * 39370.07874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "meter":
                    convertwidth = width * 39370.07874016;
                    convertheight = height * 39.37007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot^3");
                    break;
                case "centimeter":
                    convertwidth = width * 39370.07874016;
                    convertheight = height * 0.3937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 39370.07874016;
                    convertheight = height * 0.03937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 39370.07874016;
                    convertheight = height * 0.00003937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 39370.07874016;
                    convertheight = height * 3.937007874016e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 39370.07874016;
                    convertheight = height * 3.937007874016e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
            }
        }

        private void mileinchinch() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width;
                    convertheight = height * 63360;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "yard":
                    convertwidth = width;
                    convertheight = height * 36;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "foot":
                    convertwidth = width;
                    convertheight = height * 12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "inch":
                    convertwidth = width;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "kilometer":
                    convertwidth = width;
                    convertheight = height * 39370.07874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "meter":
                    convertwidth = width;
                    convertheight = height * 39.37007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot^3");
                    break;
                case "centimeter":
                    convertwidth = width;
                    convertheight = height * 0.3937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "milimeter":
                    convertwidth = width;
                    convertheight = height * 0.03937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "micrometer":
                    convertwidth = width;
                    convertheight = height * 0.00003937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "nanometer":
                    convertwidth = width;
                    convertheight = height * 3.937007874016e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "angstrom":
                    convertwidth = width;
                    convertheight = height * 3.937007874016e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
            }
        }

        private void mileinchfoot() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 12;
                    convertheight = height * 63360;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "yard":
                    convertwidth = width * 12;
                    convertheight = height * 36;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "foot":
                    convertwidth = width * 12;
                    convertheight = height * 12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "inch":
                    convertwidth = width * 12;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "kilometer":
                    convertwidth = width * 12;
                    convertheight = height * 39370.07874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "meter":
                    convertwidth = width * 12;
                    convertheight = height * 39.37007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "centimeter":
                    convertwidth = width * 12;
                    convertheight = height * 0.3937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 12;
                    convertheight = height * 0.03937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 12;
                    convertheight = height * 0.00003937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 12;
                    convertheight = height * 3.937007874016e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 12;
                    convertheight = height * 3.937007874016e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
            }
        }

        private void mileinchyard() {
            switch (StringToTo) {

                case "mile":
                    convertwidth = width * 36;
                    convertheight = height * 63360;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "yard":
                    convertwidth = width * 36;
                    convertheight = height * 36;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "foot":
                    convertwidth = width * 36;
                    convertheight = height * 12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "inch":
                    convertwidth = width * 36;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "kilometer":
                    convertwidth = width * 36;
                    convertheight = height * 39370.07874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "meter":
                    convertwidth = width * 36;
                    convertheight = height * 39.37007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "centimeter":
                    convertwidth = width * 36;
                    convertheight = height * 0.3937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 36;
                    convertheight = height * 0.03937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 36;
                    convertheight = height * 0.00003937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 36;
                    convertheight = height * 3.937007874016e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 36;
                    convertheight = height * 3.937007874016e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^ 3");
                    break;
            }
        }

        private void mileinchmile() {

            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 63360;
                    convertheight = height * 63360;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "yard":
                    convertwidth = width * 63360;
                    convertheight = height * 36;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "foot":
                    convertwidth = width * 63360;
                    convertheight = height * 12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "inch":
                    convertwidth = width * 63360;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "kilometer":
                    convertwidth = width * 63360;
                    convertheight = height * 39370.07874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  inch^3");
                    break;
                case "meter":
                    convertwidth = width * 63360;
                    convertheight = height * 39.37007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch^3");
                    break;
                case "centimeter":
                    convertwidth = width * 63360;
                    convertheight = height * 0.3937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 63360;
                    convertheight = height * 0.03937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 63360;
                    convertheight = height * 0.00003937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 63360;
                    convertheight = height * 3.937007874016e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 63360;
                    convertheight = height * 3.937007874016e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " inch ^ 3");
                    break;
            }
        }

        private void milefootangstrom() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 3.280839895013e-10;
                    convertheight = height * 5280;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "yard":
                    convertwidth = width * 3.280839895013e-10;
                    convertheight = height * 3;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "foot":
                    convertwidth = width * 3.280839895013e-10;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "inch":
                    convertwidth = width * 3.280839895013e-10;
                    convertheight = height * 0.08333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "kilometer":
                    convertwidth = width * 3.280839895013e-10;
                    convertheight = height * 3280.839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "meter":
                    convertwidth = width * 3.280839895013e-10;
                    convertheight = height * 3.280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "centimeter":
                    convertwidth = width * 3.280839895013e-10;
                    convertheight = height * 0.03280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "milimeter":
                    convertwidth = width * 3.280839895013e-10;
                    convertheight = height * 0.003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "micrometer":
                    convertwidth = width * 3.280839895013e-10;
                    convertheight = height * 0.000003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "nanometer":
                    convertwidth = width * 3.280839895013e-10;
                    convertheight = height * 3.280839895013e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "angstrom":
                    convertwidth = width * 3.280839895013e-10;
                    convertheight = height * 3.280839895013e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
            }
        }

        private void milefootnanometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 3.280839895013e-9;
                    convertheight = height * 5280;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "yard":
                    convertwidth = width * 3.280839895013e-9;
                    convertheight = height * 3;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "foot":
                    convertwidth = width * 3.280839895013e-9;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "inch":
                    convertwidth = width * 3.280839895013e-9;
                    convertheight = height * 0.08333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "kilometer":
                    convertwidth = width * 3.280839895013e-9;
                    convertheight = height * 3280.839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "meter":
                    convertwidth = width * 3.280839895013e-9;
                    convertheight = height * 3.280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "centimeter":
                    convertwidth = width * 3.280839895013e-9;
                    convertheight = height * 0.03280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "milimeter":
                    convertwidth = width * 3.280839895013e-9;
                    convertheight = height * 0.003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "micrometer":
                    convertwidth = width * 3.280839895013e-9;
                    convertheight = height * 0.000003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "nanometer":
                    convertwidth = width * 3.280839895013e-9;
                    convertheight = height * 3.280839895013e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "angstrom":
                    convertwidth = width * 3.280839895013e-9;
                    convertheight = height * 3.280839895013e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
            }
        }

        private void milefootmicrometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.000003280839895013;
                    convertheight = height * 5280;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "yard":
                    convertwidth = width * 0.000003280839895013;
                    convertheight = height * 3;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "foot":
                    convertwidth = width * 0.000003280839895013;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "inch":
                    convertwidth = width * 0.000003280839895013;
                    convertheight = height * 0.08333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.000003280839895013;
                    convertheight = height * 3280.839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "meter":
                    convertwidth = width * 0.000003280839895013;
                    convertheight = height * 3.280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.000003280839895013;
                    convertheight = height * 0.03280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.000003280839895013;
                    convertheight = height * 0.003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.000003280839895013;
                    convertheight = height * 0.000003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.000003280839895013;
                    convertheight = height * 3.280839895013e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.000003280839895013;
                    convertheight = height * 3.280839895013e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
            }
        }

        private void milefootmilimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.003280839895013;
                    convertheight = height * 5280;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "yard":
                    convertwidth = width * 0.003280839895013;
                    convertheight = height * 3;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "foot":
                    convertwidth = width * 0.003280839895013;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "inch":
                    convertwidth = width * 0.003280839895013;
                    convertheight = height * 0.08333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.003280839895013;
                    convertheight = height * 3280.839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "meter":
                    convertwidth = width * 0.003280839895013;
                    convertheight = height * 3.280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.003280839895013;
                    convertheight = height * 0.03280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.003280839895013;
                    convertheight = height * 0.003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.003280839895013;
                    convertheight = height * 0.000003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.003280839895013;
                    convertheight = height * 3.280839895013e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.003280839895013;
                    convertheight = height * 3.280839895013e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
            }
        }

        private void milefootcentimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.03280839895013;
                    convertheight = height * 5280;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "yard":
                    convertwidth = width * 0.03280839895013;
                    convertheight = height * 3;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "foot":
                    convertwidth = width * 0.03280839895013;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "inch":
                    convertwidth = width * 0.03280839895013;
                    convertheight = height * 0.08333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.03280839895013;
                    convertheight = height * 3280.839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "meter":
                    convertwidth = width * 0.03280839895013;
                    convertheight = height * 3.280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.03280839895013;
                    convertheight = height * 0.03280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.03280839895013;
                    convertheight = height * 0.003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.03280839895013;
                    convertheight = height * 0.000003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.03280839895013;
                    convertheight = height * 3.280839895013e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.03280839895013;
                    convertheight = height * 3.280839895013e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
            }
        }

        private void milefootmeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 3.280839895013;
                    convertheight = height * 5280;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "yard":
                    convertwidth = width * 3.280839895013;
                    convertheight = height * 3;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "foot":
                    convertwidth = width * 3.280839895013;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "inch":
                    convertwidth = width * 3.280839895013;
                    convertheight = height * 0.08333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "kilometer":
                    convertwidth = width * 3.280839895013;
                    convertheight = height * 3280.839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "meter":
                    convertwidth = width * 3.280839895013;
                    convertheight = height * 3.280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "centimeter":
                    convertwidth = width * 3.280839895013;
                    convertheight = height * 0.03280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "milimeter":
                    convertwidth = width * 3.280839895013;
                    convertheight = height * 0.003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "micrometer":
                    convertwidth = width * 3.280839895013;
                    convertheight = height * 0.000003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "nanometer":
                    convertwidth = width * 3.280839895013;
                    convertheight = height * 3.280839895013e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "angstrom":
                    convertwidth = width * 3.280839895013;
                    convertheight = height * 3.280839895013e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
            }
        }

        private void milefootkilometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 3280.839895013;
                    convertheight = height * 5280;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "yard":
                    convertwidth = width * 3280.839895013;
                    convertheight = height * 3;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "foot":
                    convertwidth = width * 3280.839895013;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "inch":
                    convertwidth = width * 3280.839895013;
                    convertheight = height * 0.08333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "kilometer":
                    convertwidth = width * 3280.839895013;
                    convertheight = height * 3280.839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "meter":
                    convertwidth = width * 3280.839895013;
                    convertheight = height * 3.280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "centimeter":
                    convertwidth = width * 3280.839895013;
                    convertheight = height * 0.03280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "milimeter":
                    convertwidth = width * 3280.839895013;
                    convertheight = height * 0.003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "micrometer":
                    convertwidth = width * 3280.839895013;
                    convertheight = height * 0.000003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "nanometer":
                    convertwidth = width * 3280.839895013;
                    convertheight = height * 3.280839895013e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "angstrom":
                    convertwidth = width * 3280.839895013;
                    convertheight = height * 3.280839895013e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
            }
        }

        private void milefootinch() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.08333333333333;
                    convertheight = height * 5280;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot^3");
                    break;
                case "yard":
                    convertwidth = width * 0.08333333333333;
                    convertheight = height * 3;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot^3");
                    break;
                case "foot":
                    convertwidth = width * 0.08333333333333;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "inch":
                    convertwidth = width * 0.08333333333333;
                    convertheight = height * 0.08333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.08333333333333;
                    convertheight = height * 3280.839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "meter":
                    convertwidth = width * 0.08333333333333;
                    convertheight = height * 3.280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.08333333333333;
                    convertheight = height * 0.03280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.08333333333333;
                    convertheight = height * 0.003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.08333333333333;
                    convertheight = height * 0.000003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.08333333333333;
                    convertheight = height * 3.280839895013e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.08333333333333;
                    convertheight = height * 3.280839895013e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot^3");
                    break;
            }
        }

        private void milefootfoot() {
            switch (StringToTo) {
                case "mile":

                    convertwidth = width;
                    convertheight = height * 5280;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "yard":
                    convertwidth = width;
                    convertheight = height * 3;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "foot":
                    convertwidth = width;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "inch":
                    convertwidth = width;
                    convertheight = height * 0.08333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "kilometer":
                    convertwidth = width;
                    convertheight = height * 3280.839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "meter":
                    convertwidth = width;
                    convertheight = height * 3.280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "centimeter":
                    convertwidth = width;
                    convertheight = height * 0.03280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "milimeter":
                    convertwidth = width;
                    convertheight = height * 0.003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "micrometer":
                    convertwidth = width;
                    convertheight = height * 0.000003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "nanometer":
                    convertwidth = width;
                    convertheight = height * 3.280839895013e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "angstrom":
                    convertwidth = width;
                    convertheight = height * 3.280839895013e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
            }
        }

        private void milefootyard() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 3;
                    convertheight = height * 5280;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "yard":
                    convertwidth = width * 3;
                    convertheight = height * 3;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "foot":
                    convertwidth = width * 3;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "inch":
                    convertwidth = width * 3;
                    convertheight = height * 0.08333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "kilometer":
                    convertwidth = width * 3;
                    convertheight = height * 3280.839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "meter":
                    convertwidth = width * 3;
                    convertheight = height * 3.280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "centimeter":
                    convertwidth = width * 3;
                    convertheight = height * 0.03280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "milimeter":
                    convertwidth = width * 3;
                    convertheight = height * 0.003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "micrometer":
                    convertwidth = width * 3;
                    convertheight = height * 0.000003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "nanometer":
                    convertwidth = width * 3;
                    convertheight = height * 3.280839895013e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   foot^3");
                    break;
                case "angstrom":
                    convertwidth = width * 3;
                    convertheight = height * 3.280839895013e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
            }
        }

        private void milefootmile() {

            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 5280;
                    convertheight = height * 5280;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot^3");
                    break;
                case "yard":
                    convertwidth = width * 5280;
                    convertheight = height * 3;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "foot":
                    convertwidth = width * 5280;
                    convertheight = height;

                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "inch":
                    convertwidth = width * 5280;
                    convertheight = height * 0.08333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "kilometer":
                    convertwidth = width * 5280;
                    convertheight = height * 3280.839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  foot^3");
                    break;
                case "meter":
                    convertwidth = width * 5280;
                    convertheight = height * 3.280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot^3");
                    break;
                case "centimeter":
                    convertwidth = width * 5280;
                    convertheight = height * 0.01093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 5280;
                    convertheight = height * 0.003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 5280;
                    convertheight = height * 0.000003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 5280;
                    convertheight = height * 3.280839895013e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 5280;
                    convertheight = height * 3.280839895013e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " foot ^ 3");
                    break;
            }
        }

        private void mileyardangstrom() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1.093613298338e-10;
                    convertheight = height * 1760;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "yard":
                    convertwidth = width * 1.093613298338e-10;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "foot":
                    convertwidth = width * 1.093613298338e-10;

                    convertheight = height * 0.333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "inch":
                    convertwidth = width * 1.093613298338e-10;
                    convertheight = height * 0.02777777777778;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1.093613298338e-10;
                    convertheight = height * 1093.613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "meter":
                    convertwidth = width * 1.093613298338e-10;

                    convertheight = height * 1.093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   yard^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1.093613298338e-10;
                    convertheight = height * 0.01093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   yard^3");
                    break;
                case "milimeter":
                    convertwidth = width * 1.093613298338e-10;
                    convertheight = height * 0.001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   yard^3");
                    break;
                case "micrometer":
                    convertwidth = width * 1.093613298338e-10;
                    convertheight = height * 0.000001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "nanometer":
                    convertwidth = width * 1.093613298338e-10;
                    convertheight = height * 1.093613298338e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "angstrom":

                    convertwidth = width * 1.093613298338e-10;
                    convertheight = height * 1.093613298338e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
            }
        }

        private void mileyardnanometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1.093613298338e-9;
                    convertheight = height * 1760;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "yard":
                    convertwidth = width * 1.093613298338e-9;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "foot":
                    convertwidth = width * 1.093613298338e-9;
                    convertheight = height * 0.3333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "inch":
                    convertwidth = width * 1.093613298338e-9;
                    convertheight = height * 0.02777777777778;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1.093613298338e-9;
                    convertheight = height * 1093.613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "meter":
                    convertwidth = width * 1.093613298338e-9;
                    convertheight = height * 1.093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " yard^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1.093613298338e-9;
                    convertheight = height * 0.01093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "milimeter":
                    convertwidth = width * 1.093613298338e-9;
                    convertheight = height * 0.001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "micrometer":
                    convertwidth = width * 1.093613298338e-9;
                    convertheight = height * 0.000001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "nanometer":
                    convertwidth = width * 1.093613298338e-9;
                    convertheight = height * 1.093613298338e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "angstrom":
                    convertheight = height * 1.093613298338e-10;
                    convertwidth = width * 1.093613298338e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
            }
        }

        private void mileyardmicrometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.000001093613298338;
                    convertheight = height * 1760;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "yard":
                    convertwidth = width * 0.000001093613298338;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "foot":
                    convertwidth = width * 0.000001093613298338;
                    convertheight = height * 0.3333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "inch":
                    convertwidth = width * 0.000001093613298338;
                    convertheight = height * 0.02777777777778;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.000001093613298338;
                    convertheight = height * 1093.613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "meter":
                    convertwidth = width * 0.000001093613298338;
                    convertheight = height * 1.093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.000001093613298338;
                    convertheight = height * 0.01093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.000001093613298338;
                    convertheight = height * 0.001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "micrometer":

                    convertwidth = width * 0.000001093613298338;
                    convertheight = height * 0.000001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.000001093613298338;
                    convertheight = height * 1.093613298338e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.000001093613298338;
                    convertheight = height * 1.093613298338e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
            }
        }

        private void mileyardmilimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.001093613298338;
                    convertheight = height * 1760;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "yard":
                    convertwidth = width * 0.001093613298338;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "foot":
                    convertwidth = width * 0.001093613298338;
                    convertheight = height * 0.3333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "inch":
                    convertwidth = width * 0.001093613298338;
                    convertheight = height * 0.02777777777778;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   yard^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.001093613298338;
                    convertheight = height * 1093.613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "meter":
                    convertwidth = width * 0.001093613298338;
                    convertheight = height * 1.093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.001093613298338;
                    convertheight = height * 0.01093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "milimeter":
                    convertheight = height * 0.001093613298338;
                    convertwidth = width * 0.001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.001093613298338;
                    convertheight = height * 0.000001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.001093613298338;
                    convertheight = height * 1.093613298338e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   yard^3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.001093613298338;
                    convertheight = height * 1.093613298338e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
            }
        }

        private void mileyardcentimeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.01093613298338;
                    convertheight = height * 1760;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "yard":
                    convertwidth = width * 0.01093613298338;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "foot":
                    convertwidth = width * 0.01093613298338;
                    convertheight = height * 0.3333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "inch":
                    convertwidth = width * 0.01093613298338;
                    convertheight = height * 0.02777777777778;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.01093613298338;
                    convertheight = height * 1093.613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "meter":
                    convertwidth = width * 0.01093613298338;
                    convertheight = height * 1.093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.01093613298338;
                    convertheight = height * 0.01093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.01093613298338;
                    convertheight = height * 0.001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " yard^3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.01093613298338;
                    convertheight = height * 0.000001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.01093613298338;
                    convertheight = height * 1.093613298338e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.01093613298338;
                    convertheight = height * 1.093613298338e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
            }
        }

        private void mileyardmeter() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1.093613298338;
                    convertheight = height * 1760;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "yard":
                    convertwidth = width * 1.093613298338;
                    convertheight = height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "foot":
                    convertwidth = width * 1.093613298338;
                    convertheight = height * 0.3333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   yard^3");
                    break;
                case "inch":
                    convertwidth = width * 1.093613298338;
                    convertheight = height * 0.02777777777778;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1.093613298338;
                    convertheight = height * 1093.613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "meter":
                    convertwidth = width * 1.093613298338;
                    convertheight = height * 1.093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1.093613298338;
                    convertheight = height * 0.01093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "milimeter":
                    convertwidth = width * 1.093613298338;
                    convertheight = height * 0.001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "micrometer":
                    convertwidth = width * 1.093613298338;
                    convertheight = height * 0.000001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   yard^3");
                    break;
                case "nanometer":
                    convertwidth = width * 1.093613298338;
                    convertheight = height * 1.093613298338e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   yard^3");
                    break;
                case "angstrom":
                    convertwidth = width * 1.093613298338;
                    convertheight = height * 1.093613298338e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
            }
        }

        private void mileyardkilometer() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1093.613298338;
                    convertheight = height * 1760;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "yard":
                    convertwidth = width * 1093.613298338;
                    convertheight=height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "foot":
                    convertwidth = width * 1093.613298338;
                    convertheight = height * 0.3333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "inch":
                    convertwidth = width * 1093.613298338;
                    convertheight = height * 0.02777777777778;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1093.613298338;
                    convertheight = height * 1093.613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "meter":
                    convertwidth = width * 1093.613298338;
                    convertheight = height * 1.093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1093.613298338;
                    convertheight = height * 0.01093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "milimeter":
                    convertwidth = width * 1093.613298338;
                    convertheight = height * 0.001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "micrometer":
                    convertwidth = width * 1093.613298338;
                    convertheight = height * 0.000001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "nanometer":
                    convertwidth = width * 1093.613298338;
                    convertheight = height * 1.093613298338e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "angstrom":
                    convertwidth = width * 1093.613298338;
                    convertheight = height * 1.093613298338e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
            }
        }

        private void mileyardinch() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.02777777777778;
                    convertheight = height * 1760;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " yard^3");
                    break;
                case "yard":
                    convertwidth = width * 0.02777777777778;
                    convertheight=height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " yard^3");
                    break;
                case "foot":
                    convertwidth = width * 0.02777777777778;
                    convertheight = height * 0.3333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "inch":
                    convertwidth = width * 0.02777777777778;
                    convertheight = height * 0.02777777777778;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.02777777777778;
                    convertheight = height * 1093.613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "meter":
                    convertwidth = width * 0.02777777777778;
                    convertheight = height * 1.093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.02777777777778;
                    convertheight = height * 0.01093613298338;
                    result = radius * convertwidth * convertheight;
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.02777777777778;
                    convertheight = height * 0.001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.02777777777778;
                    convertheight = height * 0.000001093613298338;
                    result = radius * convertwidth * convertheight;
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.02777777777778;
                    convertheight = height * 1.093613298338e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.02777777777778;
                    convertheight = height * 1.093613298338e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " yard^3");
                    break;
            }
        }

    /**/

        private void mileyardfoot() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 0.3333333333333;
                    convertheight = height * 1760;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "yard":
                    convertwidth = width * 0.3333333333333;
                    convertheight=height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "foot":
                    convertwidth = width * 0.3333333333333;
                    convertheight = height * 0.3333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "inch":
                    convertwidth = width * 0.3333333333333;
                    convertheight = height * 0.02777777777778;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "kilometer":
                    convertwidth = width * 0.3333333333333;
                    convertheight = height * 1093.613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "meter":
                    convertwidth = width * 0.3333333333333;
                    convertheight = height * 1.093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "centimeter":
                    convertwidth = width * 0.3333333333333;
                    convertheight = height * 0.01093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "milimeter":
                    convertwidth = width * 0.3333333333333;
                    convertheight = height * 0.001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "micrometer":
                    convertwidth = width * 0.3333333333333;
                    convertheight = height * 0.000001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "nanometer":
                    convertwidth = width * 0.3333333333333;
                    convertheight = height * 1.093613298338e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "angstrom":
                    convertwidth = width * 0.3333333333333;
                    convertheight = height * 1.093613298338e-10;

                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
            }
        }

        private void mileyardyard() {
            switch (StringToTo) {
                case "mile":
                    convertheight = height * 1760;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "yard":
                    convertheight=height;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   yard^3");
                    break;
                case "foot":
                    convertheight = height * 0.3333333333333;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   yard^3");
                    break;
                case "inch":
                    convertheight = height * 0.02777777777778;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   yard^3");
                    break;
                case "kilometer":
                    convertheight = height * 1093.613298338;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "meter":
                    convertheight = height * 1.093613298338;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   yard^3");
                    break;
                case "centimeter":
                    convertheight = height * 0.01093613298338;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "milimeter":
                    convertheight = height * 0.001093613298338;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "micrometer":

                    convertheight = height * 0.000001093613298338;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "nanometer":
                    convertheight = height * 1.093613298338e-9;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   yard^3");
                    break;
                case "angstrom":
                    convertheight = height * 1.093613298338e-10;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
            }
        }

        private void mileyardmile() {
            switch (StringToTo) {
                case "mile":
                    convertwidth = width * 1760;
                    convertheight = height * 1760;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " yard^3");
                    break;
                case "yard":
                    convertwidth = width * 1760;


                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "foot":
                    convertwidth = width * 1760;
                    convertheight = height * 0.3333333333333;

                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "inch":
                    convertwidth = width * 1760;
                    convertheight = height * 0.02777777777778;

                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "kilometer":
                    convertwidth = width * 1760;
                    convertheight = height * 1093.613298338;

                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  yard^3");
                    break;
                case "meter":
                    convertwidth = width * 1760;
                    convertheight = height * 1.093613298338;

                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " yard^3");
                    break;
                case "centimeter":
                    convertwidth = width * 1760;
                    convertheight = height * 0.01093613298338;

                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " yard ^ 3");
                    break;
                case "milimeter":
                    convertwidth = width * 1760;
                    convertheight = height * 0.001093613298338;

                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " yard ^ 3");
                    break;
                case "micrometer":
                    convertwidth = width * 1760;
                    convertheight = height * 0.000001093613298338;

                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " yard ^ 3");
                    break;
                case "nanometer":
                    convertwidth = width * 1760;
                    convertheight = height * 1.093613298338e-9;

                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " yard ^ 3");
                    break;
                case "angstrom":
                    convertwidth = width * 1760;
                    convertheight = height * 1.093613298338e-10;

                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " yard ^ 3");
                    break;
            }
        }

        private void mileangstrom() {
            switch (StringToTo) {
                case "mile":
                    convertheight = height * 1.609344e+13;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "yard":
                    convertheight = height * 0.9144000000E-1;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "foot":
                    convertheight = height * 0.3048000000e-1;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "inch":
                    convertheight = height * 254000000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "kilometer":
                    convertheight = height * 1e+13;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "meter":
                    convertheight = height * 1E10;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   mile^3");
                    break;
                case "centimeter":
                    convertheight = height * 100000000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   mile^3");
                    break;
                case "milimeter":
                    convertheight = height * 10000000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   mile^3");
                    break;
                case "micrometer":
                    convertheight = height * 10000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "nanometer":
                    convertheight = height * 10;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "angstrom":
                    convertheight=height;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " mile^3");
                    break;
            }
        }

        private void milenanometer() {
            switch (StringToTo) {
                case "mile":
                    convertheight = height * 1.609344e+12;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "yard":
                    convertheight = height * 914400000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "foot":
                    convertheight = height * 304800000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "inch":
                    convertheight = height * 25400000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "kilometer":
                    convertheight = height * 1E12;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "meter":
                    convertheight = height * 1000000000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " mile^3");
                    break;
                case "centimeter":
                    convertheight = height * 10000000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "milimeter":
                    convertheight = height * 1000000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "micrometer":
                    convertheight = height * 1000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "nanometer":
                    convertheight=height;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "angstrom":
                    convertheight = height * 0.1;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
            }
        }

        private void milemicrometer() {

            switch (StringToTo) {
                case "mile":
                    convertheight = height * 1609344000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "yard":
                    convertheight = height * 914400;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "foot":
                    convertheight = height * 304800;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "inch":
                    convertheight = height * 25400;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "kilometer":
                    convertheight = height * 1000000000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "meter":
                    convertheight = height * 1000000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "centimeter":
                    convertheight = height * 10000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "milimeter":

                    convertheight = height * 1000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "micrometer":

convertheight=height;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "nanometer":
                    convertheight = height * 0.0009999999999999;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "angstrom":
                    convertheight = height * 0.0001;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
            }
        }

        private void milemilimeter() {
            switch (StringToTo) {
                case "mile":
                    convertheight = height * 1609344;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "yard":
                    convertheight = height * 914.4;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "foot":
                    convertheight = height * 304.8;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "inch":
                    convertheight = height * 25.4;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   mile^3");
                    break;
                case "kilometer":
                    convertheight = height * 1000000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "meter":
                    convertheight = height * 1000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "centimeter":
                    convertheight = height * 10;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "milimeter":

convertheight=height;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "micrometer":

                    convertheight = height * 0.001;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "nanometer":
                    convertheight = height * 9.999999999999e-7;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   mile^3");
                    break;
                case "angstrom":
                    convertheight = height * 1e-7;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
            }
        }

        private void milecentimeter() {
            switch (StringToTo) {
                case "mile":
                    convertheight = height * 160934.4;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "yard":
                    convertheight = height * 91.44;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "foot":
                    convertheight = height * 30.48;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "inch":
                    convertheight = height * 2.54;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "kilometer":
                    convertheight = height * 100000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "meter":
                    convertheight = height * 100;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "centimeter":
                    convertheight=height;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "milimeter":
                    convertheight = height * 0.1;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " mile^3");
                    break;
                case "micrometer":

                    convertheight = height * 0.0001;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "nanometer":
                    convertheight = height * 9.999999999999e-8;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "angstrom":
                    convertheight = height * 1e-8;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
            }
        }

        private void milemeter() {

            switch (StringToTo) {
                case "mile":
                    convertheight = height * 1609.344;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "yard":
                    convertheight = height * 0.9144;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "foot":
                    convertheight = height * 0.3048;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   mile^3");
                    break;
                case "inch":
                    convertheight = height * 0.0254;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "kilometer":
                    convertheight = height * 1000;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "meter":
                    convertheight=height;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "centimeter":
                    convertheight = height * 0.01;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "milimeter":
                    convertheight = height * 0.001;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "micrometer":

                    convertheight = height * 9.999999999999e-7;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   mile^3");
                    break;
                case "nanometer":
                    convertheight = height * 9.999999999999e-10;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   mile^3");
                    break;
                case "angstrom":
                    convertheight = height * 1e-10;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
            }
        }

        private void milekilometer() {
            switch (StringToTo) {
                case "mile":
                    convertheight = height * 1.609344;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "yard":
                    convertheight = height * 0.0009144;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "foot":
                    convertheight = height * 0.0003048;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "inch":
                    convertheight = height * 0.0000254;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "kilometer":
                    convertheight=height;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "meter":
                    convertheight = height * 0.001;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "centimeter":
                    convertheight = height * 0.00001;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "milimeter":
                    convertheight = height * 0.000001;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "micrometer":

                    convertheight = height * 1e-9;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "nanometer":
                    convertheight = height * 9.999999999999e-13;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "angstrom":
                    convertheight = height * 1e-13;
                    convertwidth=width;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
            }
        }

        private void mileinch() {
            switch (StringToTo) {
                case "mile":
                    convertwidth=width;
                    convertheight = height * 63360;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " mile^3");
                    break;
                case "yard":
                    convertwidth=width;
                    convertheight = height * 36;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " mile^3");
                    break;
                case "foot":
                    convertwidth=width;
                    convertheight = height * 12;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "inch":
                    convertwidth=width;
                    convertheight=height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "kilometer":
                    convertwidth=width;
                    convertheight = height * 39370.07874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "meter":
                    convertwidth=width;
                    convertheight = height * 39.37007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "centimeter":
                    convertwidth=width;
                    convertheight = height * 0.3937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "milimeter":
                    convertwidth=width;
                    convertheight = height * 0.03937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "micrometer":
                    convertwidth=width;
                    convertheight = height * 0.00003937007874016;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "nanometer":
                    convertwidth=width;
                    convertheight = height * 3.937007874016e-8;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "angstrom":
                    convertwidth=width;
                    convertheight = height * 3.937007874016e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " mile^3");
                    break;
            }
        }

        private void milefoot() {
            switch (StringToTo) {
                case "mile":
                    convertwidth=width;
                    convertheight = height * 5280;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "yard":
                    convertwidth=width;
                    convertheight = height * 3;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "foot":
                    convertwidth=width;
                    convertheight=height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "inch":
                    convertwidth=width;
                    convertheight = height * 0.08333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    ;
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "kilometer":
                    convertwidth=width;
                    convertheight = height * 3280.839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "meter":
                    convertwidth=width;
                    convertheight = height * 3.280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "centimeter":
                    convertwidth=width;
                    convertheight = height * 0.03280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "milimeter":
                    convertwidth=width;
                    convertheight = height * 0.003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "micrometer":
                    convertwidth=width;
                    convertheight = height * 0.000003280839895013;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "nanometer":
                    convertwidth=width;
                    convertheight = height * 3.280839895013e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "angstrom":
                    convertwidth=width;
                    convertheight = height * 3.280839895013e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
            }
        }

        private void milemileyard() {

            switch (StringToTo) {

                case "mile":
                    convertwidth=width;
                    convertheight = height * 1760;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "yard":
                    convertwidth=width;
                    convertheight=height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   mile^3");
                    break;
                case "foot":
                    convertwidth=width;
                    convertheight = height * 0.3333333333333;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   mile^3");
                    break;
                case "inch":
                    convertwidth=width;
                    convertheight = height * 0.02777777777778;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   mile^3");
                    break;
                case "kilometer":
                    convertwidth=width;
                    convertheight = height * 1093.613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "meter":
                    convertwidth=width;
                    convertheight = height * 1.093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   mile^3");
                    break;
                case "centimeter":
                    convertwidth=width;
                    convertheight = height * 0.01093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "milimeter":
                    convertwidth=width;
                    convertheight = height * 0.001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "micrometer":
                    convertwidth=width;
                    convertheight = height * 0.000001093613298338;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "nanometer":
                    convertwidth=width;
                    convertheight = height * 1.093613298338e-9;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "   mile^3");
                    break;
                case "angstrom":
                    convertwidth=width;
                    convertheight = height * 1.093613298338e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);

                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
            }
        }


        private void mile() {
            switch (StringToTo) {
                case "mile":
                    convertwidth=width;
                    convertheight=height;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " mile^3");
                    break;
                case "yard":
                    convertwidth=width;
                    convertheight = height * 0.000568182;

                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "foot":
                    convertwidth=width;
                    convertheight = height * 0.0001893939393939;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "inch":
                    convertwidth=width;
                    convertheight = height * 0.00001578282828283;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "kilometer":
                    convertwidth=width;
                    convertheight = height * 0.6213711922373;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + "  mile^3");
                    break;
                case "meter":
                    convertwidth=width;
                    convertheight = height * 0.0006213711922373;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " mile^3");
                    break;
                case "centimeter":
                    convertwidth=width;
                    convertheight = height * 0.000006213711922373;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " mile ^ 3");
                    break;
                case "milimeter":
                    convertwidth=width;
                    convertheight = height * 6.213711922373e-7;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " mile ^ 3");
                    break;
                case "micrometer":
                    convertwidth=width;
                    convertheight = height * 6.213711922373e-10;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " mile ^ 3");
                    break;
                case "nanometer":
                    convertwidth=width;
                    convertheight = height * 6.213711922373e-13;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " mile ^ 3");
                    break;
                case "angstrom":
                    convertwidth=width;
                    convertheight = height * 6.213711922373e-14;
                    result=2*(radius*convertwidth)+2*(radius*convertheight)+2*(convertwidth*convertheight);
                    textViewResultrectVolume.setText("" + result + " mile ^ 3");
                    break;
            }
        }

    public void hideKeyboard() {
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity()
                .getSystemService(android.content.Context.INPUT_METHOD_SERVICE);

        inputMethodManager.hideSoftInputFromWindow(
                getActivity().getCurrentFocus()
                        .getWindowToken(), 0);
    }
    }