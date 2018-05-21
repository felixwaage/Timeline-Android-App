package com.timeline.felix.timeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterSlides extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_slides);
        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonSaveClick();
            }
        });
    }

    public void onButtonSaveClick(){

        CPresentation current_presentation = mainTimelineHandler.getLastSelected();

        EditText secondsString = findViewById(R.id.editText6);
        int seconds = Integer.parseInt(secondsString.getText().toString());
        EditText description = findViewById(R.id.editText4);
        EditText title = findViewById(R.id.editText3);

        current_presentation.addSlide(seconds,title.getText().toString(), description.getText().toString());

        CSlide[] slides = current_presentation.getSlides();

        System.out.println("BREAK-POINT");
    }

}
