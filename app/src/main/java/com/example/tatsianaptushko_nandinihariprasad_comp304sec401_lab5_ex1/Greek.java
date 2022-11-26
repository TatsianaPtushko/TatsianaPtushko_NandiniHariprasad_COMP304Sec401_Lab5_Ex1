package com.example.tatsianaptushko_nandinihariprasad_comp304sec401_lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Greek extends AppCompatActivity {
    //RecyclerView listView;
    ListView listView;
    String[] restaurantsArray ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greek);

        listView = (ListView)findViewById(R.id.GreekListView);
        // Create an ArrayAdapter that will contain all list items
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, restaurantsArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                Intent intent =new Intent(Greek.this, MapsActivity.class);

                switch (selectedItem) {
                    case "Mamakas Taverna":
                        intent.putExtra("lat",43.64599);
                        intent.putExtra("lng",-79.41964);
                        intent.putExtra("title", "Mamakas Taverna");
                        break;
                    case "Athens Pastries":
                        intent.putExtra("lat",43.67800);
                        intent.putExtra("lng",-79.34883);
                        intent.putExtra("title", "Athens Pastries");
                        break;
                    case "Ballissimo Loukoumades Bar":
                        intent.putExtra("lat",43.69726);
                        intent.putExtra("lng",-79.32902);
                        intent.putExtra("title", "Ballissimo Loukoumades Bar");
                        break;

                }

                startActivity(intent);
            }
        });

    }
}