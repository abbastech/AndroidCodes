package com.example.android.viewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Ahmed Abbas on 10/21/2017.
 */

public class CustomSwipeAdapter extends PagerAdapter {
    private int [] image_resource = {R.drawable.img1,R.drawable.img2,
            R.drawable.img3,R.drawable.img4,R.drawable.img5
    };

    private String[] text_resource={"Sample 1","Sample 2","Sample 3","Sample 4","Sample 5"};

    private Context ctx;
    private LayoutInflater layoutInflater;

    public CustomSwipeAdapter(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resource.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipe_layout,container,false);

        ImageView imageView =(ImageView) item_view.findViewById(R.id.image_view);
        TextView textView =(TextView) item_view.findViewById(R.id.image_count);
        TextView textresource = (TextView) item_view.findViewById(R.id.txtrandom);

        int arraySize = text_resource.length;
        for(int i = 0; i < arraySize; i++) {
            textresource.append(text_resource[i]);
        }

        imageView.setImageResource(image_resource[position]);
        textView.setText("Image : "+position);

        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
        //super.destroyItem(container, position, object);
    }
}
