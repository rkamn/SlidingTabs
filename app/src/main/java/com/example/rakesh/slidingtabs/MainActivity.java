package com.example.rakesh.slidingtabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    private TableLayout mtableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtableLayout = (TableLayout)findViewById(R.id.tabs);

       /* mtableLayout.add
        mtableLayout.add
        mtableLayout.addTab(mtableLayout.newTab().setText("Tab3"));
        mtableLayout.addTab(mtableLayout.newTab().setText("Tab4"));
        set.TabGravity(TableLayout.GRAVITY_FILL);*/
    }
}
