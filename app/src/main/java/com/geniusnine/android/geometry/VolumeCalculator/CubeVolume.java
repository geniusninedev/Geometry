package com.geniusnine.android.geometry.VolumeCalculator;

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

public class CubeVolume extends  android.support.v4.app.Fragment {
    EditText editTextLength;
    Spinner spinnerCube;
    int valueOfFirst;
    TextView cubeResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.activity_cube_volume, container, false);

        editTextLength=(EditText)view.findViewById(R.id.editTextCubeLength);
        spinnerCube=(Spinner)view.findViewById(R.id.spinnerCubeLength);
        cubeResult=(TextView) view.findViewById(R.id.textViewResultCubeVolume);



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


        Button calculate=(Button)view.findViewById(R.id.buttonCalculateCube);
        Button clear=(Button)view.findViewById(R.id.buttonResetCube);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, area);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerCube.setAdapter(dataAdapter);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CubeVolumeCalculator cubeVolume=new CubeVolumeCalculator();

                hideKeyboard();

                if(editTextLength.getText().toString().trim().equals("")){
                    editTextLength.setError("Enter The Edge Length");
                }

                else{

                    if (spinnerCube.getSelectedItem().toString().trim().equals("mile")) {

                        valueOfFirst = Integer.parseInt(editTextLength.getText().toString().trim());

                        cubeResult.setVisibility(View.VISIBLE);

                        double result =  cubeVolume.cubeVolumeCalci(valueOfFirst);
                        cubeResult.setText("Cube Volume: "+result+"  mile ^ 3");


                    }


                    if (spinnerCube.getSelectedItem().toString().trim().equals("yard")) {

                        valueOfFirst = Integer.parseInt(editTextLength.getText().toString().trim());

                        cubeResult.setVisibility(View.VISIBLE);

                        double result =  cubeVolume.cubeVolumeCalci(valueOfFirst);
                        cubeResult.setText("Cube Volume: "+result+"  yard ^ 3 ");



                    }
                    if (spinnerCube.getSelectedItem().toString().trim().equals("foot")) {

                        valueOfFirst = Integer.parseInt(editTextLength.getText().toString().trim());

                        cubeResult.setVisibility(View.VISIBLE);

                        double result =  cubeVolume.cubeVolumeCalci(valueOfFirst);
                        cubeResult.setText("Cube Volume: "+result+"  foot ^ 3 ");


                    }
                    if (spinnerCube.getSelectedItem().toString().trim().equals("inch")) {


                        valueOfFirst = Integer.parseInt(editTextLength.getText().toString().trim());
                        cubeResult.setVisibility(View.VISIBLE);

                        double result =  cubeVolume.cubeVolumeCalci(valueOfFirst);
                        cubeResult.setText("Cube Volume: "+result+"  inch ^ 3 ");
                    }

                    if (spinnerCube.getSelectedItem().toString().trim().equals("kilometer")) {


                        valueOfFirst = Integer.parseInt(editTextLength.getText().toString().trim());

                        cubeResult.setVisibility(View.VISIBLE);

                        double result =  cubeVolume.cubeVolumeCalci(valueOfFirst);
                        cubeResult.setText("Cube Volume:  "+result+"  kilometer ^ 3 ");



                    }
                    if (spinnerCube.getSelectedItem().toString().trim().equals("meter")) {

                        valueOfFirst = Integer.parseInt(editTextLength.getText().toString().trim());
                        cubeResult.setVisibility(View.VISIBLE);

                        double result =  cubeVolume.cubeVolumeCalci(valueOfFirst);
                        cubeResult.setText("Cube Volume: "+result+"  meter ^ 3 ");



                    }
                    if (spinnerCube.getSelectedItem().toString().trim().equals("centimeter")) {


                        valueOfFirst = Integer.parseInt(editTextLength.getText().toString().trim());

                        cubeResult.setVisibility(View.VISIBLE);

                        double result =  cubeVolume.cubeVolumeCalci(valueOfFirst);
                        cubeResult.setText("Cube Volume:  "+result+ "  centimeter ^ 3 ");



                    }
                    if (spinnerCube.getSelectedItem().toString().trim().equals("milimeter")) {

                        valueOfFirst = Integer.parseInt(editTextLength.getText().toString().trim());

                        cubeResult.setVisibility(View.VISIBLE);

                        double result =  cubeVolume.cubeVolumeCalci(valueOfFirst);
                        cubeResult.setText("Cube Volume:  "+result+ "  milimeter ^ 3 ");

                    }
                    if (spinnerCube.getSelectedItem().toString().trim().equals("micrometer")) {

                        valueOfFirst = Integer.parseInt(editTextLength.getText().toString().trim());

                        cubeResult.setVisibility(View.VISIBLE);

                        double result =  cubeVolume.cubeVolumeCalci(valueOfFirst);
                        cubeResult.setText("Cube Volume:  "+result+ "  micrometer ^ 3 ");



                    }
                    if (spinnerCube.getSelectedItem().toString().trim().equals("nanometer")) {

                        valueOfFirst = Integer.parseInt(editTextLength.getText().toString().trim());

                        cubeResult.setVisibility(View.VISIBLE);

                        double result =  cubeVolume.cubeVolumeCalci(valueOfFirst);
                        cubeResult.setText("Cube Volume:  "+result+ "  nanometer ^ 3 ");



                    }
                    if (spinnerCube.getSelectedItem().toString().trim().equals("angstrom")) {


                        valueOfFirst = Integer.parseInt(editTextLength.getText().toString().trim());

                        cubeResult.setVisibility(View.VISIBLE);

                        double result =  cubeVolume.cubeVolumeCalci(valueOfFirst);
                        cubeResult.setText("Cube Volume: "+result+ "  angstrom ^ 3 ");



                    }

                }


            }


        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextLength.setText("");
                cubeResult.setVisibility(View.GONE);


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



