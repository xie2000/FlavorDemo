package test4.demo.com.flavordemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(test4.demo.com.flavordemo.R.layout.main);
        findViewById(test4.demo.com.flavordemo.R.id.my_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this,Flavor.class);
                startActivity(intent);
            }
        });
    }
}