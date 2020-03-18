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
public class AddStudentFragment extends Fragment {

    private EditText studentName, studentMark;
    private Button button;

    public AddStudentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_add_student,container,false);
    studentName = view.findViewById(R.id.name_text);
    studentMark = view.findViewById(R.id.mark_text);
    button = view.findViewById(R.id.add_button);

        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                String name = studentName.getText().toString();
                String mark = studentMark.getText().toString();

                Student std = new Student();
                std.setMark(mark);
                std.setName(name);

                MainActivity.myAppDatabase.myDataAccessObject().addStudent(std);
                Toast.makeText(getActivity(),"Student added",Toast.LENGTH_SHORT).show();

                studentName.setText("");
                studentMark.setText("");
            }
        });


    return view;


    }

}
