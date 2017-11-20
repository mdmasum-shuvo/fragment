package com.masum.fragcomunicate;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by masum on 5/12/16.
 */
public class Fragment_B extends Fragment {
    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        tv= (TextView) getActivity().findViewById(R.id.textView);
    }

    public void changdata(String data){
        tv.setText(data);

    }
}
