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
        TextView contactLastName = (TextView) findViewById(R.id.contact_last_name);
        TextView contactEmail = (TextView) findViewById(R.id.contact_email);
        TextView contactPhone = (TextView) findViewById(R.id.contact_phone);

        Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();

        String name = bundle.getString("name");
        String lastName = bundle.getString("lastName");
        String email = bundle.getString("email");
        Integer phoneNumber = bundle.getInt("phoneNumber");

        contactName.setText(name);
        contactLastName.setText(lastName);
        contactEmail.setText(email);
        contactPhone.setText(String.valueOf(phoneNumber));
    }
}
