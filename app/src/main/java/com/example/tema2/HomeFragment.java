package com.example.tema2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    private Button addButton, readButton, deleteButton;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,container,false);
        addButton = view.findViewById(R.id.btn_add);
        addButton.setOnClickListener(this);
        readButton = view.findViewById(R.id.btn_view);
        readButton.setOnClickListener(this);
        deleteButton = view.findViewById(R.id.btn_delete);
        deleteButton.setOnClickListener(this);
        return view;

    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_add:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new AddStudentFragment()).addToBackStack(null).commit();
                break;

            case R.id.btn_view:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ReadStudentsFragment()).addToBackStack(null).commit();
                break;

            case R.id.btn_delete:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new DeleteStudentFragment()).addToBackStack(null).commit();
                break;


        }

    }

}
