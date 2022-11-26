package com.example.tatsianaptushko_nandinihariprasad_comp304sec401_lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Italian extends AppCompatActivity {
    //RecyclerView listView;
    ListView listView;
    String[] restaurantsArray ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian);
        restaurantsArray = getResources().getStringArray(R.array.italian_restaurants);

        listView = (ListView)findViewById(R.id.listView2);
        // Create an ArrayAdapter that will contain all list items
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, restaurantsArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                Intent intent =new Intent(Italian.this, MapsActivity.class);

                switch (selectedItem) {
                    case "Sugo":
                        intent.putExtra("lat",43.65829);
                        intent.putExtra("lng",-79.44232);
                        intent.putExtra("title", "Sugo");
                        break;
                    case "Bitondo’s Pizzeria":
                        intent.putExtra("lat",43.65412);
                        intent.putExtra("lng",-79.41325);
                        intent.putExtra("title", "Bitondo’s Pizzeria");
                        break;
                    case "Terroni":
                        intent.putExtra("lat",43.64629);
                        intent.putExtra("lng",-79.40916);
                        intent.putExtra("title", "Terroni");
                        break;

                    case "Death in Venice":
                        intent.putExtra("lat",43.64973);
                        intent.putExtra("lng",-79.42931);
                        intent.putExtra("title", "Death in Venice");
                        break;
                }

                startActivity(intent);
            }
        });




    }
}