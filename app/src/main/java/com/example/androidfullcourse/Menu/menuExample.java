package com.example.androidfullcourse.Menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidfullcourse.MainActivity;
import com.example.androidfullcourse.R;

public class menuExample extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_example);
        getSupportActionBar().setTitle("myapp");
        getSupportActionBar().setLogo(R.drawable.profile);
        t=findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.fb:
                t.setText("fb button is clicked");
                startActivity(new Intent(menuExample.this, MainActivity.class));
                Toast.makeText(this, "fb button is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.search_bar:
                t.setText("search button is clicked");
                Toast.makeText(this, "search_bar button is clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}