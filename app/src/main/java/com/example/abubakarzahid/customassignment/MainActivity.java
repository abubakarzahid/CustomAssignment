package com.example.abubakarzahid.customassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int [] Images = {R.drawable.abubakar,R.drawable.anosh,R.drawable.hamza,R.drawable.nimra,R.drawable.ahmad,R.drawable.maria,R.drawable.danish,R.drawable.saba,R.drawable.mobashir,R.drawable.romaisa,R.drawable.arshad,R.drawable.rida};

    String [] Names = {"Abuabkar","Anosh","Hamza","Nimara","Ahmad","Maria","Danish","Saba","Mobashir","Romaisa","Arshad","Rioa"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView namelist = (ListView)findViewById(R.id.customlist);
        CustomAdapter customAdapter = new CustomAdapter();
        namelist.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return Images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.custom_layout,null);
            ImageView imageView = (ImageView)view.findViewById(R.id.customimages); // just like a view holder where we reduce findviewbyid
            TextView textView = (TextView)view.findViewById(R.id.txtnames);

            imageView.setImageResource(Images [i]);
            textView.setText(Names [i]);
            return view;
        }
    }
}
