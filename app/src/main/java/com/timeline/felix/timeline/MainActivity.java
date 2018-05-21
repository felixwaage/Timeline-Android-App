package com.timeline.felix.timeline;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void buttonOnClick(View v){
        Intent startNewActivity = new Intent(this, EnterSlides.class);

        Button button = (Button) v;
        EditText title = findViewById(R.id.editText);
        EditText description = findViewById(R.id.editText2);
        CPresentation presentation = new CPresentation( title.getText().toString(),
                                                        description.getText().toString());

        mainTimelineHandler.addPresentation(presentation);

        startActivity(startNewActivity);
        System.out.println("BREAK-POINT");
    }

}
