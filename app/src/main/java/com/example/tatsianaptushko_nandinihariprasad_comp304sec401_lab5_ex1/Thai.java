package com.example.tatsianaptushko_nandinihariprasad_comp304sec401_lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Thai extends AppCompatActivity {
    //RecyclerView listView;
    ListView listView;
    String[] restaurantsArray ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai);

        listView = (ListView)findViewById(R.id.ThaiListView);
        // Create an ArrayAdapter that will contain all list items
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, restaurantsArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                Intent intent =new Intent(Thai.this, MapsActivity.class);

                switch (selectedItem) {
                    case "Lamoon Thai Cafe":
                        intent.putExtra("lat",43.66625);
                        intent.putExtra("lng",-79.34803);
                        intent.putExtra("title", "Lamoon Thai Cafe");
                        break;
                    case "Pai":
                        intent.putExtra("lat",43.64783);
                        intent.putExtra("lng",-79.38864);
                        intent.putExtra("title", "Pai");
                        break;
                    case "Eat BKK":
                        intent.putExtra("lat",43.75923);
                        intent.putExtra("lng",-79.41075);
                        intent.putExtra("title", "Eat BKK");
                        break;

                    case "Koh Lipe":
                        intent.putExtra("lat",43.65586);
                        intent.putExtra("lng",-79.39344);
                        intent.putExtra("title", "Koh Lipe");
                        break;

                }

                startActivity(intent);
            }
        });
    }
}