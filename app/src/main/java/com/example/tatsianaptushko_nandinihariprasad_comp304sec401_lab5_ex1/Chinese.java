package com.example.tatsianaptushko_nandinihariprasad_comp304sec401_lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chinese extends AppCompatActivity {
android.widget.ListView listView;
    String[] restaurantsArray ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);

        restaurantsArray = getResources().getStringArray(R.array.chinese_restaurants);
        listView = (ListView)findViewById(R.id.listView_chinese);
        // Create an ArrayAdapter that will contain all list items
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, restaurantsArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                Intent intent =new Intent(Chinese.this, MapsActivity.class);

                switch (selectedItem) {
                    case "Kroran Uyghur Cuisine":
                        intent.putExtra("lat",43.75871);
                        intent.putExtra("lng",-79.28893);
                        intent.putExtra("title", "Kroran Uyghur Cuisine");
                        break;
                    case "Charcoal Kebab House":
                        intent.putExtra("lat",43.75743);
                        intent.putExtra("lng",-79.23896);
                        intent.putExtra("title", "Charcoal Kebab House");
                        break;
                    case "Dream Yunnan":
                        intent.putExtra("lat",43.65580);
                        intent.putExtra("lng",-79.39373);
                        intent.putExtra("title", "Dream Yunnan");
                        break;

                    case "Taste of Guang Xi":
                        intent.putExtra("lat",43.65549);
                        intent.putExtra("lng",-79.39936);
                        intent.putExtra("title", "Taste of Guang Xi");
                        break;
                }

                startActivity(intent);
            }
        });



    }
}