package com.example.sanketpatel.wordpower;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sanket Patel on 26-08-2018.
 */

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    ArrayList<String> words = new ArrayList<String>();
    ArrayList<String> word_description = new ArrayList<String>();

    public String name[]={"Brij","Brij 1 ","Brij 2 ","Brij 3 "};
    ArrayList<String> Userlist=new ArrayList<String>();

    public  int bck[]={Color.BLUE,Color.CYAN,Color.GRAY,Color.GREEN,Color.BLUE,Color.CYAN};

    public SlideAdapter(Context context, ArrayList<String> strings,ArrayList<String> userlist2){

        this.context=context;
        words=strings;
        word_description=userlist2;






    }

    @Override
    public int getCount() {
        return words.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slide,container,false);
        LinearLayout linearLayout=(LinearLayout)view.findViewById(R.id.slidelinearlayout);
        TextView textView=(TextView)view.findViewById(R.id.write);
        TextView desc=(TextView)view.findViewById(R.id.desc);
        textView.setText(words.get(position));
        desc.setText(word_description.get(position));
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       container.removeView((LinearLayout)object);
    }
}
