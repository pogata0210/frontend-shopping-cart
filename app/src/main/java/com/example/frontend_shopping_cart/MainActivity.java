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

        findViewById(R.id.button_shop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openActivity2();

            }
        });



    }
    public void openActivity2(){
        Intent i = new Intent(this, shoppingExperience.class);
        startActivity(i);

    }
}

/**
 * 2.0 aouth example
 new Thread(new Runnable() {
@Override
public void run() {
String auth = Base64.encodeToString("lambda-client:lambda-secret".getBytes(), Base64.DEFAULT);

Map<String, String> headerProperties = new HashMap<>();
headerProperties.put("Authorization", "Basic " + auth);


String tokenRequest = NetworkAdapter.httpRequest(
        "http://10.0.2.2:8080/oauth/token?grant_type=password&username=lucy&password=ILuvM4th&scope=",
        "POST", null, headerProperties);

                Log.i(TAG, tokenRequest);
                        try {
                        String token = new JSONObject(tokenRequest).getString("access_token");

                        headerProperties.clear();
                        headerProperties.put("Authorization", "Bearer " + token);

                        String result = NetworkAdapter.httpRequest("http://10.0.2.2:8080/students/students", "GET", null, headerProperties);
                        Log.i("Authentication", result);
                        } catch (JSONException e) {
                        e.printStackTrace();
                        }
                        }
                        }).start();
                        }
                        }

 **/