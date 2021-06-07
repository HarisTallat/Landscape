package com.haristallat2001.landscape;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements ListFragment.Onselect {

    TextView tvshow;
    ArrayList<String> show;
    String [] list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvshow=findViewById(R.id.tvshow);
//        show= new ArrayList<>();
//        show.add(" data 1");
//        show.add(" data 2");
//        show.add(" data 3");
//        show.add(" data 4");

        // if you want to use static array
      list= getResources().getStringArray(R.array.descriptions);
      if(findViewById(R.id.layout_po)!=null)
      {
          FragmentManager manager= getSupportFragmentManager();
          manager.beginTransaction().hide(manager.findFragmentById(R.id.fragment6)).commit();

      }
      else
      {
          FragmentManager manager= this.getSupportFragmentManager();
          manager.beginTransaction().show(manager.findFragmentById(R.id.fragment5)).show(manager.findFragmentById(R.id.fragment6)).commit();
      }
    }

    @Override
    public void getIndex(int index) {

        tvshow.setText(list[index]);
        if(findViewById(R.id.layout_po)!=null)
        {
            FragmentManager manager= getSupportFragmentManager();
            manager.beginTransaction().hide(manager.findFragmentById(R.id.fragment5)).show(manager.findFragmentById(R.id.fragment6)).addToBackStack(null).commit();


        }

    }
}