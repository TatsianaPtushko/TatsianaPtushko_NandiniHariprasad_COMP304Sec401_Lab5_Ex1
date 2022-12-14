package com.example.tatsianaptushko_nandinihariprasad_comp304sec401_lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CuisineList extends AppCompatActivity {

    ListView listView;
    String cuisineList[] = {"Italian", "Greek", "Chinese", "Indian", "North American", "Mexican", "Vietnamese","Thai"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine_list);


        listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, cuisineList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);

                switch (selectedItem) {
                    case "Italian":
                             Intent intent =new Intent(CuisineList.this, Italian.class);
                            startActivity(intent);
                        break;
                    case "Greek":
                             Intent intent2 =new Intent(CuisineList.this, Greek.class);
                             startActivity(intent2);
                        break;
                    case "Chinese":
                             Intent intent3 =new Intent(CuisineList.this, Chinese.class);
                              startActivity(intent3);
                        break;
                    case "Indian":
                            Intent intent4 =new Intent(CuisineList.this, Indian.class);
                              startActivity(intent4);
                        break;

                    case "North American":
                             Intent intent5 =new Intent(CuisineList.this, NorthAmerican.class);
                              startActivity(intent5);
                        break;
                    case "Mexican":
                             Intent intent6 =new Intent(CuisineList.this, Mexican.class);
                              startActivity(intent6);
                        break;
                    case "Vietnamese":
                             Intent intent7 =new Intent(CuisineList.this, Vietnamese.class);
                              startActivity(intent7);
                        break;
                    case "Thai":
                             Intent intent8 =new Intent(CuisineList.this, Thai.class);
                              startActivity(intent8);
                        break;

                }
            }
        });

    }
}