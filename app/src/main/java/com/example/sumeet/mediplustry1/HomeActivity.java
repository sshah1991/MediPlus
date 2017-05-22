package com.example.sumeet.mediplustry1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.addDrug) {
            Toast.makeText(getApplicationContext(), "Clicked Add", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(HomeActivity.this, AddDrugs.class);
            startActivity(intent);

        } else if (id == R.id.alarmList) {
            Toast.makeText(getApplicationContext(), "Clicked Alarm List", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.shopping) {
            Toast.makeText(getApplicationContext(), "Clicked Shopping", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
