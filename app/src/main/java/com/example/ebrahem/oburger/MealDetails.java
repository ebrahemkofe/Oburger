package com.example.ebrahem.oburger;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class MealDetails extends Fragment {


    TextView t;
    public MealDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_meal_details, container, false);
        t=v.findViewById(R.id.counter);

        return v;
    }
    int x=1;
    public void blus (View view){
        t.setText((x++)+"");

    }
    public void min (View view){
        if(x>1)
            t.setText((x--)+"");
        else
            t.setText(1 +"");
    }
    public void add (View view){
        Toast.makeText(getActivity(), "added ...", Toast.LENGTH_SHORT).show();

    }

}
