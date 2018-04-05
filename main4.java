package com.example.admin.testapp_52;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;




public class Main4Activity extends AppCompatActivity {
    ListView xk;
    ArrayAdapter zhap;
    String[] name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        xk=(ListView)findViewById(R.id.xk);
        name=getResources().getStringArray(R.array.xk);
        zhap=new ArrayAdapter<String>(Main4Activity.this,android.R.layout.simple_spinner_dropdown_item,name);
        xk.setAdapter(zhap);




    }
}
