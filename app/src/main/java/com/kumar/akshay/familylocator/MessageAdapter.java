package com.kumar.akshay.familylocator;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MessageAdapter extends ArrayAdapter<LocationMessage> {

    public MessageAdapter(Context context, int resource, List<LocationMessage> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message, parent, false);
        }

        TextView userTextView = (TextView) convertView.findViewById(R.id.userNameTextView);
        TextView locationTextView = (TextView) convertView.findViewById(R.id.locationTextView);
        TextView timeTextView = (TextView) convertView.findViewById(R.id.timeTextView);


        LocationMessage message = getItem(position);

        userTextView.setText(message.getUser());
        locationTextView.setText(message.getCurrentLocation());
        timeTextView.setText(message.getTime());

        return convertView;
    }
}
