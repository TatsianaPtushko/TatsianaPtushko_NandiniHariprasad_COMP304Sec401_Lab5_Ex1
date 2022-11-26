package com.example.tatsianaptushko_nandinihariprasad_comp304sec401_lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mexican extends AppCompatActivity {

    ListView listView;
    String[] restaurantsArray ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexican);

        restaurantsArray = getResources().getStringArray(R.array.mexican_restaurants);
        listView = (ListView)findViewById(R.id.listView_mexican);
        // Create an ArrayAdapter that will contain all list items
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, restaurantsArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                Intent intent =new Intent(Mexican.this, MapsActivity.class);


                switch (selectedItem) {
                    case "Comal y Canela":
                        intent.putExtra("lat",43.70330);
                        intent.putExtra("lng",-79.50417);
                        intent.putExtra("title", "Comal y Canela");
                        break;
                    case "Sinaloa Factory":
                        intent.putExtra("lat",43.78414);
                        intent.putExtra("lng",-79.60043);
                        intent.putExtra("title", "Sinaloa Factory");
                        break;
                    case "Taqueria Gus":
                        intent.putExtra("lat",43.65440);
                        intent.putExtra("lng",-79.40179);
                        intent.putExtra("title", "Taqueria Gus");
                        break;

                    case "Titas Mexican Food":
                        intent.putExtra("lat",43.61279);
                        intent.putExtra("lng",-79.48935);
                        intent.putExtra("title", "Titas Mexican Food");
                        break;
                }

                startActivity(intent);
            }
        });


    }
}