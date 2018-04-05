package com.example.admin.testapp_52;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;




public class Main3Activity extends AppCompatActivity {
    ListView shsy;
    ArrayAdapter zhap;
    String[] name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        shsy=(ListView)findViewById(R.id.shsy);
        name=getResources().getStringArray(R.array.shsy);
        zhap=new ArrayAdapter<String>(Main3Activity.this,android.R.layout.simple_spinner_dropdown_item,name);
        shsy.setAdapter(zhap);




    }
}
