package com.developer.happypaws4.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.developer.happypaws4.ActivityLogin;
import com.developer.happypaws4.R;

public class FragmentProfile extends Fragment {

    Button btnLogout;
    public static final int REQUEST_CODE_LOGOUT = 1;

    public FragmentProfile() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        btnLogout = view.findViewById(R.id.btn_Logout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(getContext(), ActivityLogin.class), REQUEST_CODE_LOGOUT);
            }
        });
        return view;
    }
}