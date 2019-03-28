package com.example.frontend_shopping_cart;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button supplierButton, shopButton;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        shopButton = findViewById(R.id.button_shop);
        supplierButton = findViewById(R.id.button_suppliers);

        findViewById(R.id.button_suppliers).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Product.class);
                startActivity(intent);
            }
        });



    }
}
