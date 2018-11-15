package com.jsy3949.mytoolbar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ThirdFragment extends Fragment {

    ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.third_fragment,container,false);

        /*대상 위치인 부분을 정의하고 외부 클래시인 어탭터를 적용하여 구현*/
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getActivity());

        viewPager.setAdapter(viewPagerAdapter);

        return view;
    }
}
