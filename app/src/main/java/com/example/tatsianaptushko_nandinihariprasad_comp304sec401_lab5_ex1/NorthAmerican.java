package com.example.tatsianaptushko_nandinihariprasad_comp304sec401_lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NorthAmerican extends AppCompatActivity {
    //RecyclerView listView;
    ListView listView;
    String[] restaurantsArray ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_american);

        listView = (ListView)findViewById(R.id.NorthAmericanListView);
        // Create an ArrayAdapter that will contain all list items
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, restaurantsArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                Intent intent =new Intent(NorthAmerican.this, MapsActivity.class);

                switch (selectedItem) {
                    case "Richmond Station":
                        intent.putExtra("lat",43.65144);
                        intent.putExtra("lng",-79.37950);
                        intent.putExtra("title", "Richmond Station");
                        break;
                    case "Pow Wow Cafe":
                        intent.putExtra("lat",43.65415);
                        intent.putExtra("lng",-79.40171);
                        intent.putExtra("title", "Pow Wow Cafe");
                        break;
                    case "Halifax Donair":
                        intent.putExtra("lat",43.51513);
                        intent.putExtra("lng",-79.88135);
                        intent.putExtra("title", "Halifax Donair");

                    case "Antler Kitchen and Bar":
                        intent.putExtra("lat",43.64974);
                        intent.putExtra("lng",-79.43057);
                        intent.putExtra("title", "Antler Kitchen and Bar");
                        break;

                }

                startActivity(intent);
            }
        });


    }
}