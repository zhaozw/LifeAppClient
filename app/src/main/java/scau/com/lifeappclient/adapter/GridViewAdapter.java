package scau.com.lifeappclient.adapter;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;

import scau.com.lifeappclient.R;

/**
 * Created by beyondboy on 2017/1/3.
 */
public class GridViewAdapter extends BaseAdapter {
    private int[] imageId=new int[]{R.drawable.grid1,R.drawable.grid2,
    R.drawable.grid3,R.drawable.grid4};
    @Override
    public int getCount() {
        return imageId.length;
    }

    @Override
    public Object getItem(int position) {
        return imageId[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grid_item, parent, false);
        ImageView imageView=(ImageView) view.findViewById(R.id.grid_image);
      //  simpleDraweeView.setImageURI(Uri.parse("res///" +imageId[position]));
       // simpleDraweeView.setImageURI(Uri.parse("res///" + R.drawable.ambulance));
        imageView.setImageResource(imageId[position]);
        return view;
    }
}
