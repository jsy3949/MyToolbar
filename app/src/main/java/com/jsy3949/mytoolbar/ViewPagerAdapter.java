package com.jsy3949.mytoolbar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.img_ka_01, R.drawable.img_ka_02,R.drawable.img02,R.drawable.img03};
    private String[] text_arr = {"슬라이드01","슬라이드02","슬라이드03","슬라이드04"};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        //객체화된 데이터 값을 보여주겠다는 의미
        return view == object;
    }
    //데이터 아이템을 메모리에 저장하겠다(인스턴트화)는 의미
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.viewpager_slide,null); //대상물을 가져오겠다는 역할
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);  //인플레이션되 부분 중 인자값을 정의
        TextView textView = (TextView)view.findViewById(R.id.textView);
        imageView.setImageResource(images[position]); //배열 데이터를 지정되 곳애 넣어주겠다는 것을 의미

        //String text = (position + 1) + " / " +images.length;
        textView.setText(text_arr[position]);
        ViewPager vp = (ViewPager) container; //container는 지정된 곳에 담겠다는 의미
        vp.addView(view,0); //모든 배열을 추가하겠다는 것을 의미 (최초의 배열 데이터부터 마지막 배열데이터까지)

        return view;
    }
    /*인스턴트화 한다는 것 자체가 안드로이드 시스템에서 메모리 공간을 차지하게 되는데,
    실제 사용하지 않는 메모리는 제거해야합니다.종료 역할을 하게 됨*/
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       ViewPager vp = (ViewPager) container;
       View view = (View) object;
       vp.removeView(view);
    }
}
