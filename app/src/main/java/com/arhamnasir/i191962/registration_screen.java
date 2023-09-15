//package com.arhamnasir.i191962;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.app.Activity;
//
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.AutoCompleteTextView;
//import android.widget.Spinner;
//import android.widget.Toast;
//
//public class registration_screen extends AppCompatActivity {
//
//    // Define the array of options
//    String[] item= { "Pakistan", "India", "Uganda", "Others"};
//
//    AutoCompleteTextView autocompletetextview;
//
//    String[] itemcity= {"Islamabad", "Burewala", "Lahore", "Others"};
//
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_registration_screen);
//
//        autocompletetextview = findViewById(R.id.auto_complete_text_view);
//
//
//        // Create an ArrayAdapter using the options array and a default spinner layout
//        ArrayAdapter<String> adapterItems = new ArrayAdapter<String>(this,R.layout.list_item);
//
//        // Specify the layout to use when the list of choices appears
//        autocompletetextview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//               String item = adapterView.getItemAtPosition(1).toString();
//                Toast.makeText(registration_screen.this, "Item"+ item, Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
//
//
//        // dropdown city
//        autocompletetextview = findViewById(R.id.auto_complete_text_view);
//
//
//        // Create an ArrayAdapter using the options array and a default spinner layout
//        ArrayAdapter<String> adapterItemsCity = new ArrayAdapter<String>(this,R.layout.list_item);
//
//        // Specify the layout to use when the list of choices appears
//        autocompletetextview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                String item = adapterView.getItemAtPosition(1).toString();
//                Toast.makeText(registration_screen.this, "Item"+ item, Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
//
//
//    }
//}

package com.arhamnasir.i191962;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class registration_screen extends AppCompatActivity {

    // Define the array of options
    String[] countries = {"Pakistan", "India", "Uganda", "Others"};
    String[] cities = {"Islamabad", "Burewala", "Lahore", "Others"};

    AutoCompleteTextView autoCompleteCountry;
    AutoCompleteTextView autoCompleteCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_screen);

        autoCompleteCountry = findViewById(R.id.auto_complete_country);
        autoCompleteCity = findViewById(R.id.auto_complete_city);

        // Create an ArrayAdapter for countries using the 'countries' array
        ArrayAdapter<String> adapterCountries = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, countries);

        // Set the adapter for the AutoCompleteTextView
        autoCompleteCountry.setAdapter(adapterCountries);

        // Set an item click listener for the country AutoCompleteTextView
        autoCompleteCountry.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedCountry = (String) parent.getItemAtPosition(position);
                Toast.makeText(registration_screen.this, "Selected Country: " + selectedCountry, Toast.LENGTH_SHORT).show();
            }
        });

        // Create an ArrayAdapter for cities using the 'cities' array
        ArrayAdapter<String> adapterCities = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, cities);

        // Set the adapter for the AutoCompleteTextView
        autoCompleteCity.setAdapter(adapterCities);

        // Set an item click listener for the city AutoCompleteTextView
        autoCompleteCity.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedCity = (String) parent.getItemAtPosition(position);
                Toast.makeText(registration_screen.this, "Selected City: " + selectedCity, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
