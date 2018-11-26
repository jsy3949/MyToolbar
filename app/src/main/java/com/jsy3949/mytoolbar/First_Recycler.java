package com.jsy3949.mytoolbar;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class First_Recycler extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<ItemList> itemLists = new ArrayList<>();

    public First_Recycler(){
        itemLists.add(new ItemList(R.drawable.img01,"카카오 머니","카카오페이"));
        itemLists.add(new ItemList(R.drawable.img02,"카카오 특징","카카오케릭터 옆모습"));
        itemLists.add(new ItemList(R.drawable.img03,"카카오 행사","KTC"));
        itemLists.add(new ItemList(R.drawable.img01,"카카오 머니","카카오페이"));
        itemLists.add(new ItemList(R.drawable.img02,"카카오 특징","카카오케릭터 옆모습"));
        itemLists.add(new ItemList(R.drawable.img03,"카카오 행사","KTC"));
        itemLists.add(new ItemList(R.drawable.img01,"카카오 머니","카카오페이"));
        itemLists.add(new ItemList(R.drawable.img02,"카카오 특징","카카오케릭터 옆모습"));
        itemLists.add(new ItemList(R.drawable.img03,"카카오 행사","KTC"));
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        /*XML 파일를 연동 역할 & 각 항목에 대한 메서드 (함수)를 호출*/
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_item,viewGroup,false);
        return new Rowcell(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        ((Rowcell)viewHolder).imageView_item.setImageResource(itemLists.get(position).item_image);
        ((Rowcell)viewHolder).textView_title.setText(itemLists.get(position).item_title);
        ((Rowcell)viewHolder).textView_sub.setText(itemLists.get(position).item_subtitle);

    }



    @Override
    public int getItemCount() {
        return itemLists.size();
    }


    private class Rowcell extends RecyclerView.ViewHolder{
        ImageView imageView_item;
        TextView textView_title;
        TextView textView_sub;

        public Rowcell(View view){
            super(view);
            imageView_item = (ImageView) view.findViewById(R.id.itemImageView);
            textView_title = (TextView) view.findViewById(R.id.itemTitle);
            textView_sub = (TextView) view.findViewById(R.id.itemSubTitle);

        }
    }



}
