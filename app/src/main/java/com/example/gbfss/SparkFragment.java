package com.example.gbfss;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class SparkFragment extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    // Note: Taken from Android Studio's Fragment base
    private static final String DATE = "[Date]";
    private static final String TYPE = "[type]";
    private static Context context;
    int crystals, singleTickets, tenTickets, currentSparks, totalSparks;

    public SparkFragment(){
        //required empty public constructor
    }

    //Note: Taken from Android Studio's Fragment base
    public static SparkFragment newInstance(Context context1) {
        SparkFragment fragment = new SparkFragment();
        Bundle args = new Bundle();
        context = context1;
        /*args.putString(DATE, param1);
        args.putBoolean("isDate",isDate);
        args.putBoolean("isDOB",isDOB);

        if(isDOB){
            args.putString(TYPE,"birthdate");
        }
        else{
            args.putString(TYPE,"date of first contact");
        }*/

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    //Note: Taken from Android Studio's Fragment base
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            /*dateString = getArguments().getString(DATE);
            dateType = getArguments().getString(TYPE);
            mIs_Date = getArguments().getBoolean("isDate");
            mIsDOB = getArguments().getBoolean("isDOB");*/
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.spark_fragment,container, false);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        final EditText crystalInput = view.findViewById(R.id.crystalInsert);
        final EditText singleInput = view.findViewById(R.id.singleInsert);
        final EditText tenInput = view.findViewById(R.id.tenInsert);
        final EditText sparkInput = view.findViewById(R.id.sparkInsert);
        final TextView resultText = view.findViewById(R.id.resultText);
        Button calculateButton = view.findViewById(R.id.calculateButton);



        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crystals = Integer.parseInt(crystalInput.getText().toString());
                singleTickets = Integer.parseInt(singleInput.getText().toString());
                tenTickets = Integer.parseInt(tenInput.getText().toString());
                currentSparks = Integer.parseInt(sparkInput.getText().toString());

                totalSparks = Arithmetic.calculateSpark(crystals,singleTickets,tenTickets, currentSparks);
                String result = Integer.toString(totalSparks);
                result += " / 300";
                resultText.setText(result);
            }
        });
    }
}
