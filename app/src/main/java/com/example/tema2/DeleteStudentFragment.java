package com.example.tema2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteStudentFragment extends Fragment {

    private EditText txt_name, txt_mark;
    private Button deleteButton;

    public DeleteStudentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_delete_student, container, false);

       deleteButton = view.findViewById(R.id.delete_button);
       txt_name = view.findViewById(R.id.delete_name_text);
       txt_mark = view.findViewById(R.id.delete_mark_text);

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = txt_name.toString();
                String mark = txt_mark.toString();
                Student std = new Student();
                std.setName(name);
                std.setMark(mark);
                MainActivity.myAppDatabase.myDataAccessObject().deleteStudent(std);


                Toast.makeText(getActivity(),"Student removed",Toast.LENGTH_SHORT).show();
                txt_mark.setText("");
                txt_name.setText("");
            }
        });
       return view;
    }

}
