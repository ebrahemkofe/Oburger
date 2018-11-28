package com.example.ebrahem.oburger;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class MyListAdapter extends ArrayAdapter<Hero> {

    List<Hero> heroList;

    Context context;

    int resource;

    public MyListAdapter(Context context, int resource, List<Hero> heroList) {
        super(context, resource, heroList);
        this.context = context;
        this.resource = resource;
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.my_custom_list_happymeal, null);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewTeam = view.findViewById(R.id.textViewTeam);
        Hero hero = heroList.get(position);

        imageView.setImageDrawable(context.getResources().getDrawable(hero.getImage()));
        textViewName.setText(hero.getName());
        textViewTeam.setText(hero.getTeam());




        return view;
    }

}