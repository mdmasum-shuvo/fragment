package com.masum.fragcomunicate;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(){
        FragmentManager manager=this.getFragmentManager();
        Fragment_B f2= (Fragment_B) manager.findFragmentById(R.id.fragment2);
        f2.changdata("Hello From activity");

    }

    @Override
    public void respond(String data) {
        FragmentManager manager=this.getFragmentManager();
        Fragment_B f2= (Fragment_B) manager.findFragmentById(R.id.fragment2);

        f2.changdata(data);

    }
}
