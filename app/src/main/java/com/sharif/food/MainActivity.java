package com.sharif.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rav);


        ArrayList<FoodModel> arrayList = new ArrayList<>();
        arrayList.add(new FoodModel("Burgar","This item is very Delicious",R.drawable.burgar));
        arrayList.add(new FoodModel("Chicken","This item is very Delicious Most of the pepole are like the food ",R.drawable.checken));
        arrayList.add(new FoodModel("Pizza","This item is very Delicious",R.drawable.pizza));
        arrayList.add(new FoodModel("Sandwich","This item is very Delicious Most of the pepole are like the food",R.drawable.sandwish));
        arrayList.add(new FoodModel("Pasta","This item is very Delicious",R.drawable.pasta));
        arrayList.add(new FoodModel("Cake","This item is very Delicious",R.drawable.cake));
        arrayList.add(new FoodModel("Falooda","This item is very Delicious",R.drawable.faluda));
        arrayList.add(new FoodModel("Lacchi","This item is very Delicious",R.drawable.lacchi));
        arrayList.add(new FoodModel("Coke","This item is very Delicious",R.drawable.coke));
        arrayList.add(new FoodModel("Coffe","This item is very Delicious",R.drawable.coffe));

         FoodAdapter foodAdapter = new FoodAdapter(MainActivity.this,arrayList);
        //LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        //linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //rv.setLayoutManager(linearLayoutManager);

        //GridLayoutManager layoutManager = new GridLayoutManager(MainActivity.this,2,
               // GridLayoutManager.VERTICAL,true);
       //rv.setLayoutManager(layoutManager);

        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        rv.setLayoutManager(layoutManager);
         rv.setAdapter(foodAdapter);

    }
}