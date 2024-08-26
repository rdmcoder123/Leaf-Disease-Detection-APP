package com.example.myfarm.fragement.fragement;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.myfarm.R;
import com.example.myfarm.fragement.activities.diseaseActivity;

public class CropPhoto extends Fragment {
    ImageView imageView;
    TextView button;
    TextView button1;
    public Bitmap image = null;


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragement_cropphoto, container, false);
        imageView = view.findViewById(R.id.imageView);
        button = view.findViewById(R.id.read);
        button1 = view.findViewById(R.id.read1);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(getContext(), diseaseActivity.class);
                intent.putExtra("Bitmap", "open");
                startActivity(intent);

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(getContext(), diseaseActivity.class);
                intent.putExtra("Bitmap", "opencamera");
                startActivity(intent);


            }
        });

        return view;
    }


}
