package com.example.admin.testapp_52;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;




public class Main2Activity extends AppCompatActivity {
    ListView zhl;
    ArrayAdapter zhap;
    String[] name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        zhl=(ListView)findViewById(R.id.zhl1);
        name=getResources().getStringArray(R.array.zonghe);
        zhap=new ArrayAdapter<String>(Main2Activity.this,android.R.layout.simple_spinner_dropdown_item,name);
        zhl.setAdapter(zhap);




    }
}
