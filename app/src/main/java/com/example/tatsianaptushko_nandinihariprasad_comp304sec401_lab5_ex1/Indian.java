package com.example.tatsianaptushko_nandinihariprasad_comp304sec401_lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Indian extends AppCompatActivity {
    //RecyclerView listView;
    ListView listView;
    String[] restaurantsArray ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian);

        restaurantsArray = getResources().getStringArray(R.array.indian_restaurants);
        listView = (ListView)findViewById(R.id.IndianListView);
        // Create an ArrayAdapter that will contain all list items
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, restaurantsArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                Intent intent =new Intent(Indian.this, MapsActivity.class);

                switch (selectedItem) {
                    case "The Host":
                        intent.putExtra("lat",43.66992);
                        intent.putExtra("lng",-79.39585);
                        intent.putExtra("title", "The Host");
                        break;
                    case "Avani":
                        intent.putExtra("lat",43.60625);
                        intent.putExtra("lng",-79.69192);
                        intent.putExtra("title", "Avani");
                        break;
                    case "The Maharaja":
                        intent.putExtra("lat",43.59896);
                        intent.putExtra("lng",-79.66032);
                        intent.putExtra("title", "The Maharaja");
                        break;

                    case "Sabras":
                        intent.putExtra("lat",43.75982);
                        intent.putExtra("lng",-79.22736);
                        intent.putExtra("title", "Sabras");
                        break;

                }

                startActivity(intent);
            }
        });
    }
}