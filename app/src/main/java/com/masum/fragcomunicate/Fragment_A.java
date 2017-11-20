package com.masum.fragcomunicate;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by masum on 5/12/16.
 */
public class Fragment_A extends Fragment {

    Button b;
    Communicator com;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);
    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        b= (Button) getActivity().findViewById(R.id.button);
        com= (Communicator) getActivity();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.respond("data send");

            }
        });
    }
}
