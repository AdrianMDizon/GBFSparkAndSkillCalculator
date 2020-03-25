package com.example.gbfss;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class NavigationBar extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    // Note: Taken from Android Studio's Fragment base
    private static final String DATE = "[Date]";
    private static final String TYPE = "[type]";
    //ArrayList<Key_MM> byMM = new ArrayList<>();
    private static Context context;

    public NavigationBar(){
        //required empty public constructor
    }

    //Note: Taken from Android Studio's Fragment base
    public static NavigationBar newInstance(Context context1) {
        NavigationBar fragment = new NavigationBar();
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
        View view = inflater.inflate(R.layout.nav_fragment,container, false);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        final Button sparkButton = view.findViewById(R.id.sparkButton);
        final Button skillButton = view.findViewById(R.id.skillButton);

        sparkButton.setTypeface(Typeface.DEFAULT_BOLD);

        sparkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sparkButton.setTypeface(Typeface.DEFAULT_BOLD);
                skillButton.setTypeface(Typeface.DEFAULT);
            }
        });

        skillButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sparkButton.setTypeface(Typeface.DEFAULT);
                skillButton.setTypeface(Typeface.DEFAULT_BOLD);
            }
        });


    }
}
