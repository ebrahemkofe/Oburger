package com.example.ebrahem.oburger;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HappyMealDetails extends Fragment {

TextView e;
TextView t;
ImageView i;
ImageView s;
    public HappyMealDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_happy_meal, container, false);
        t=v.findViewById(R.id.mealname);
        e=v.findViewById(R.id.MealName);
        i=v.findViewById(R.id.mealphoto);
        s=v.findViewById(R.id.MealPhoto);


        return v;


    }
    public void SmallMeal (View view)
    {
        t.setText(e.getText());
        i.setImageResource(R.drawable.mac);
        Intent a = new Intent(getContext(),HappyMealDetails.class);
        startActivity(a);
    }
    public void LargeMeal (View view)
    {
        t.setText(e.getText());
        i.setImageResource(R.drawable.mac);
        Intent a = new Intent(getContext(),HappyMealDetails.class);
        startActivity(a);    }

}
