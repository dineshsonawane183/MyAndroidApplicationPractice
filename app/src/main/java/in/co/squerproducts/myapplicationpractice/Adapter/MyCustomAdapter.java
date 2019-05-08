package in.co.squerproducts.myapplicationpractice.Adapter;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import in.co.squerproducts.myapplicationpractice.R;

public class MyCustomAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] values;
    private final Integer[] images;

    public MyCustomAdapter(Activity context, String[] values, Integer[] images) {
        super(context, R.layout.activity_custom_list_view_with_image, values);
        this.context = context;
        this.values = values;
        this.images = images;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.activity_custom_list_view_with_image, null, true);

        ImageView imageView = view.findViewById(R.id.lvImage);
        TextView textView = view.findViewById(R.id.tvListItem);

        imageView.setImageResource(images[position]);
        textView.setText(values[position]);
        return view;
    }
}
