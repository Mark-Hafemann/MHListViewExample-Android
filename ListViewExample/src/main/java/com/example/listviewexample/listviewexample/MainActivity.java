package com.example.listviewexample.listviewexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

    // String that will populate the list view
    private String[] myContacts = {"Mark", "Joe", "John", "Tim", "Sal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_list);

        populateListView();
        }

    private void populateListView() {

        // Build adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.contact, myContacts);

        // Configure list view
        ListView list = (ListView)findViewById(R.id.contact_list_view);
        list.setAdapter(adapter);
    }

}
