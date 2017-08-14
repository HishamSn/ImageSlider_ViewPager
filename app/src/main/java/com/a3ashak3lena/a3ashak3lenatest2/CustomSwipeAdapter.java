package com.a3ashak3lena.a3ashak3lenatest2;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Hisham Snaimeh on 8/14/2017.
 */


public class CustomSwipeAdapter extends PagerAdapter {
private int [] img_resources={R.drawable.mac1,R.drawable.mac2};
    private Context ctx;
    private LayoutInflater layoutInflater;



    CustomSwipeAdapter(Context ctx)
    {
        this.ctx=ctx;
    }


    @Override
    public int getCount() {
        return img_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object obj) {
        return (view==(LinearLayout)obj);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view=layoutInflater.inflate(R.layout.swipe_layout,container,false);
        ImageView img=(ImageView) item_view.findViewById(R.id.imageView1);
        img.setImageResource(img_resources[position]);

        container.addView(item_view);


        return item_view;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);


        super.destroyItem(container, position, object);
    }
}
