package com.db.shoaibali.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    database Mydb;
    EditText name,password,identity;
    Button insert,view,search,update,delete;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Mydb = new database(this);
        name = (EditText)findViewById(R.id.name);
        password = (EditText)findViewById(R.id.password);
        identity = (EditText)findViewById(R.id.identity);
        insert = (Button)findViewById(R.id.insert);
        view = (Button)findViewById(R.id.view);
        search = (Button)findViewById(R.id.search);
        update = (Button)findViewById(R.id.update);
        delete = (Button)findViewById(R.id.delete);

        //1st test commit
        //another commit



    }

    @Override
    public void onClick(View v) {

    }
}
