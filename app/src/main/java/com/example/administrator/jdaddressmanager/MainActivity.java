package com.example.administrator.jdaddressmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.jdaddressmanager.jdaddressselector.BottomDialog;
import com.example.administrator.jdaddressmanager.jdaddressselector.OnAddressSelectedListener;
import com.example.administrator.jdaddressmanager.jdaddressselector.model.City;
import com.example.administrator.jdaddressmanager.jdaddressselector.model.County;
import com.example.administrator.jdaddressmanager.jdaddressselector.model.Province;

public class MainActivity extends AppCompatActivity implements OnAddressSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonBottomDialog = (Button) findViewById(R.id.buttonBottomDialog);
        assert buttonBottomDialog != null;
        buttonBottomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                BottomDialog.show(MainActivity.this, MainActivity.this);
                BottomDialog dialog = new BottomDialog(MainActivity.this);
                dialog.setOnAddressSelectedListener(MainActivity.this);
                dialog.show();
            }
        });
    }

    @Override
    public void onAddressSelected(Province province, City city, County county) {
        String s =
                (province == null ? "" : province.name) +
                        (city == null ? "" : "\n" + city.name) +
                        (county == null ? "" : "\n" + county.name);

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
