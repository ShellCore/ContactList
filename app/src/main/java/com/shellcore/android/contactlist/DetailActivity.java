package com.shellcore.android.contactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView contactName = (TextView) findViewById(R.id.contact_name);

        Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();

        // TODO: Get the rest of the contact parameters
        String name = bundle.getString("name");

        // TODO: Once you have all the values for a contact add them to the views
        contactName.setText(name);
    }
}
