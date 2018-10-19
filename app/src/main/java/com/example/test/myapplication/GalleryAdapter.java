package com.example.test.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryAdapter extends BaseAdapter{


    Context mContext;
    private int selectItem;


    private int screen_width;

    public void set_width(int width){
        this.screen_width = width;
    }

    private int drawable1[]=new int[] {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    public GalleryAdapter(Context mContext){
        this.mContext=mContext;
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 9999;          //这里的目的是可以让图片循环浏览
    }



    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }
    public void setSelectItem(int selectItem) {

        if (this.selectItem != selectItem) {
            this.selectItem = selectItem;
            notifyDataSetChanged();
        }
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ImageView imageView=new ImageView(mContext);
//        imageView.setImageResource(drawable1[position%drawable1.length]);
//取余，让图片循环浏览

        if(selectItem==position){
//            Animation animation = AnimationUtils.loadAnimation(mContext, R.anim.my_scale_action);    //实现动画效果
            imageView.setLayoutParams(new Gallery.LayoutParams(screen_width/5,150));
//            imageView.startAnimation(animation);  //选中时，这是设置的比较大
        } else if(Math.abs(selectItem-position)==1){
            imageView.setLayoutParams(new Gallery.LayoutParams(screen_width/5,120));
        }else{
            imageView.setLayoutParams(new Gallery.LayoutParams(screen_width/5,90));
//未选中
        }
        return imageView;
    }





}
