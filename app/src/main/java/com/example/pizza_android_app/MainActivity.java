package com.example.pizza_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String data[]={"Margherita","PEPPER BARBECUE CHICKEN","Farm House","CHICKEN SAUSAGE","Mexican Green Wave","Chicken Golden Delight","Veg Extravaganza","Chicken Dominator","PANEER MAKHANI","Non Veg Supreme","CHEESE N CORN",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.Listview);

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_expandable_list_item_1,data);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        Toast.makeText(MainActivity.this, "Veg", Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Toast.makeText(MainActivity.this, "Non Veg", Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Toast.makeText(MainActivity.this, "Veg", Toast.LENGTH_SHORT).show();
                        break;

                    case 3:
                        Toast.makeText(MainActivity.this, "Non veg", Toast.LENGTH_SHORT).show();
                        break;

                    case 4:
                        Toast.makeText(MainActivity.this, "Veg", Toast.LENGTH_SHORT).show();
                        break;

                    case 5:
                        Toast.makeText(MainActivity.this, "Non Veg", Toast.LENGTH_SHORT).show();
                        break;

                    case 6:
                        Toast.makeText(MainActivity.this, "Veg", Toast.LENGTH_SHORT).show();
                        break;

                    case 7:
                        Toast.makeText(MainActivity.this, "Non Veg", Toast.LENGTH_SHORT).show();
                        break;

                    case 8:
                        Toast.makeText(MainActivity.this, "Veg", Toast.LENGTH_SHORT).show();
                        break;

                    case 9:
                        Toast.makeText(MainActivity.this, "Non Veg", Toast.LENGTH_SHORT).show();
                        break;
                    case 10:
                        Toast.makeText(MainActivity.this, " Veg", Toast.LENGTH_SHORT).show();
                        break;
                }


            }
        });



    }
}