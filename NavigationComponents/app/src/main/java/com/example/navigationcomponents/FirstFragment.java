package com.example.navigationcomponents;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_first,container,false);
         Button red=v.findViewById(R.id.red);
         red.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_redFragment);
             }
         });
         Button blue=v.findViewById(R.id.blue);
         blue.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_blueFragment);

             }
         });
         Button green=v.findViewById(R.id.green);
         green.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_greenFragment);

             }
         });
        return v;
    }
}
