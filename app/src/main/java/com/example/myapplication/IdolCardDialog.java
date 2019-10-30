package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class IdolCardDialog extends DialogFragment {
    private static final String TAG = "IdolCardDialog";

    private TextView exit;

    private TextView idolName;
    private TextView rarity;
    private TextView dance;
    private TextView sing;
    private TextView charm;

    private ImageView image;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.idolcard, container, false);

        idolName = view.findViewById(R.id.name);
        rarity = view.findViewById(R.id.rarity);
        dance = view.findViewById(R.id.dance);
        sing = view.findViewById(R.id.sing);
        charm = view.findViewById(R.id.charm);
        image = view.findViewById(R.id.idolImage);

        exit = view.findViewById(R.id.exitButton);

        idolName.setText(getArguments().getString("name"));
        rarity.setText(getArguments().getString("rarity"));
        dance.setText(getArguments().getString("dance"));
        sing.setText(getArguments().getString("sing"));
        charm.setText(getArguments().getString("charm"));
        image.setBackgroundResource(getArguments().getInt("image"));

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: closing dialog");
                getDialog().dismiss();
            }
        });

        return view;
    }
}