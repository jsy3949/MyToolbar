package com.jsy3949.mytoolbar;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.second_fragment,container,false);

        final Button btnFragment1 = (Button) view.findViewById(R.id.move_first_btn);
        btnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.main_frameLayout , new FirstFragment());
                fr.commit();
            }
        });

        return view;
    }
}
