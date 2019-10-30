package com.example.roubaisha.counter.mfragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.roubaisha.counter.R;
import com.example.roubaisha.counter.activity.Isha_nafil;
import com.example.roubaisha.counter.activity.Isha_sunnah;
import com.example.roubaisha.counter.activity.Ishafard;
import com.example.roubaisha.counter.activity.Ishanafil;
import com.example.roubaisha.counter.activity.Ishasunnah;
import com.example.roubaisha.counter.activity.Ishawitr;
import com.example.roubaisha.counter.mactivity.MIsha_nafil;
import com.example.roubaisha.counter.mactivity.MIsha_sunnah;
import com.example.roubaisha.counter.mactivity.MIshafard;
import com.example.roubaisha.counter.mactivity.MIshanafil;
import com.example.roubaisha.counter.mactivity.MIshasunnah;
import com.example.roubaisha.counter.mactivity.MIshawitr;

public class MFiveFragment extends Fragment {
    Activity context;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context=getActivity();
        return inflater.inflate(R.layout.fragment_five, container, false);
    }
    public void onStart(){
        super.onStart();
        Button btis=(Button)context.findViewById(R.id.btnOpenis);
        btis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, MIshasunnah.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpenif=(Button)context.findViewById(R.id.btnOpenif);
        btnOpenif.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, MIshafard.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpeniss=(Button)context.findViewById(R.id.btnOpeniss);
        btnOpeniss.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, MIsha_sunnah.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpenin=(Button)context.findViewById(R.id.btnOpenin);
        btnOpenin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, MIshanafil.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpeniw=(Button)context.findViewById(R.id.btnOpeniw);
        btnOpeniw.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, MIshawitr.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpeninn=(Button)context.findViewById(R.id.btnOpeninn);
        btnOpeninn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, MIsha_nafil.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
    }


}

