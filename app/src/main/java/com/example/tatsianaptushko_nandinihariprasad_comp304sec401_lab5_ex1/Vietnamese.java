package com.example.tatsianaptushko_nandinihariprasad_comp304sec401_lab5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Vietnamese extends AppCompatActivity {

    ListView listView;
    String[] restaurantsArray ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vietnamese);

        restaurantsArray = getResources().getStringArray(R.array.vietnamese_restaurants);
        listView = (ListView)findViewById(R.id.listView_vietnamese);
        // Create an ArrayAdapter that will contain all list items
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, restaurantsArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                Intent intent =new Intent(Vietnamese.this, MapsActivity.class);

                /*
                <item>Phở Sơn</item>
        <item>Bong Lua Vietnamese Restaurant</item>
        <item>Đà Nẵng Restaurant</item>
        <item>Pho Dau Bo</item>
                 */

                switch (selectedItem) {
                    case "Phở Sơn":
                        intent.putExtra("lat",43.70488);
                        intent.putExtra("lng",-79.47682);
                        intent.putExtra("title", "Phở Sơn");
                        break;
                    case "Bong Lua Vietnamese Restaurant":
                        intent.putExtra("lat",43.78959);
                        intent.putExtra("lng",-79.30251);
                        intent.putExtra("title", "Bong Lua Vietnamese Restaurant");
                        break;
                    case "Đà Nẵng Restaurant":
                        intent.putExtra("lat",43.74095);
                        intent.putExtra("lng",-79.51307);
                        intent.putExtra("title", "Đà Nẵng Restaurant");
                        break;

                    case "Pho Dau Bo":
                        intent.putExtra("lat",43.74988);
                        intent.putExtra("lng",-79.54943);
                        intent.putExtra("title", "Pho Dau Bo");
                        break;
                }

                startActivity(intent);
            }
        });

    }
}