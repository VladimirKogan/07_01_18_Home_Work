package com.example.vladik.a07_01_18_home_work;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class AddPerson extends AppCompatActivity {

    private MenuItem cancelItem, pushItem;
    private EditText nameInput, phoneInput, emailInput, descriptionInput;
    private String nameInputStr, phoneInputStr, emailInputStr, descriptionInputStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_menu, menu);
        cancelItem = menu.findItem(R.id.cancel_item);
        pushItem = menu.findItem(R.id.push_item);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.push_item){}
        if(item.getItemId() == R.id.cancel_item){}

        return super.onOptionsItemSelected(item);
    }
    public void createItem(){

    }

}
