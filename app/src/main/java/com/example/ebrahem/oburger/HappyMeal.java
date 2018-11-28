package com.example.ebrahem.oburger;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HappyMeal extends Fragment {

    TextView name;
    TextView smallname;
    TextView smallprise;
    TextView largeprise;
    TextView largename;
    ImageView meal;

    List< com.example.ebrahem.oburger.Hero> heroList;
    ListView listView;
    public HappyMeal() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        heroList = new ArrayList<>();
        View v= inflater.inflate(R.layout.fragment_happy_meal, container, false);
        name=v.findViewById(R.id.MealName);
        meal=v.findViewById(R.id.MealPhoto);
        smallname=v.findViewById(R.id.SmallMeal);
        smallprise=v.findViewById(R.id.SmallPrise);
        largename=v.findViewById(R.id.LargeMeal);
        largeprise=v.findViewById(R.id.LargePrise);
        listView = v.findViewById(R.id.listView);


        heroList.add(new com.example.ebrahem.oburger.Hero(R.drawable.mac, "chicken macdo", "From 31.58"));
        heroList.add(new com.example.ebrahem.oburger.Hero(R.drawable.mac, "cheese burger", "From 30.95"));
        heroList.add(new com.example.ebrahem.oburger.Hero(R.drawable.mac, "mc nuggets 4pieces", "From 31.95"));
        heroList.add(new com.example.ebrahem.oburger.Hero(R.drawable.mac, "mc nuggets 6piece", "From 35.95"));
        heroList.add(new com.example.ebrahem.oburger.Hero(R.drawable.mac, "double cheese burger", "From 34.95"));
        heroList.add(new com.example.ebrahem.oburger.Hero(R.drawable.mac, "beef burger", "From 28.95"));
        heroList.add(new com.example.ebrahem.oburger.Hero(R.drawable.mac, "double beef burger", "From 32.95"));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
                    Intent a = new Intent(getContext(),HappyMealDetails.class);
                    startActivity(a);
                    name.setText("chicken macdo");
                    meal.setImageResource(R.drawable.mac);
                    smallname.setText("chicken macdo Small");
                    smallprise.setText("31.58");
                    largename.setText("chicken macdo Large");
                    largeprise.setText("41.58");

                }
                if(position==1)
                {
                    Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
                    name.setText("cheese burger");
                    meal.setImageResource(R.drawable.mac);
                    smallname.setText("cheese burger Small");
                    smallprise.setText("30.95");
                    largename.setText("cheese burger Large");
                    largeprise.setText("45.95");
                }
                if(position==2)
                {
                    Intent a = new Intent(getContext(),HappyMealDetails.class);
                    startActivity(a);
                    Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
                    name.setText("mc nuggets 4pieces");
                    meal.setImageResource(R.drawable.mac);
                    smallname.setText("mc nuggets 4pieces Small");
                    smallprise.setText("31.58");
                    largename.setText("mc nuggets 4pieces Large");
                    largeprise.setText("35.58");
                }
                if(position==3)
                {
                    Intent a = new Intent(getContext(),HappyMealDetails.class);
                    startActivity(a);
                    Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
                    name.setText("mc nuggets 6piece");
                    meal.setImageResource(R.drawable.mac);
                    smallname.setText("mc nuggets 6piece Small");
                    smallprise.setText("35.58");
                    largename.setText("mc nuggets 6piece Large");
                    largeprise.setText("41.58");
                }
                if(position==4)
                {
                    Intent a = new Intent(getContext(),HappyMealDetails.class);
                    startActivity(a);
                    Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
                    name.setText("double cheese burger");
                    meal.setImageResource(R.drawable.mac);
                    smallname.setText("double cheese burger Small");
                    smallprise.setText("34.95");
                    largename.setText("double cheese burger Large");
                    largeprise.setText("45.95");
                }
                if(position==5)
                {
                    Intent a = new Intent(getContext(),HappyMealDetails.class);
                    startActivity(a);
                    Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
                    name.setText("beef burger");
                    meal.setImageResource(R.drawable.mac);
                    smallname.setText("beef burger Small");
                    smallprise.setText("28.95");
                    largename.setText("beef burger Large");
                    largeprise.setText("37.58");
                }
                if(position==6)
                {
                    Intent a = new Intent(getContext(),HappyMealDetails.class);
                    startActivity(a);
                    Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
                    name.setText("double beef burger");
                    meal.setImageResource(R.drawable.mac);
                    smallname.setText("double beef burger Small");
                    smallprise.setText("32.58");
                    largename.setText("double beef burger Large");
                    largeprise.setText("40.58");
                }
            }
        });
        com.example.ebrahem.oburger.MyListAdapter adapter = new com.example.ebrahem.oburger.MyListAdapter(getActivity(), R.layout.my_custom_list_happymeal, heroList);


        listView.setAdapter(adapter);

        return v;

    }

}
