package com.example.vukmir.developmenttutorial;

import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class GraphicsAndAnimation extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphics_and_animation);


        ImageView img1 = (ImageView) findViewById(R.id.magentaShape);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"YOU CLICKED!",Toast.LENGTH_SHORT).show();
            }
        });

        ImageView img2 = (ImageView) findViewById(R.id.cyanShape);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"YOU clicked!",Toast.LENGTH_SHORT).show();
            }
        });


    }


}























        /*
        //int height = (int) getResources().getDimension(R.dimen.);

        //CREATE shape by coding ----????????????

        //get cintainer view
       // RelativeLayout rl = (RelativeLayout) findViewById(R.id.)

        //create magenta shape
        ShapeDrawable magentaShape = new ShapeDrawable(new OvalShape());
        magentaShape.getPaint().setColor(Color.MAGENTA);
        magentaShape.setIntrinsicHeight(250);
        magentaShape.setIntrinsicWidth(250);
        magentaShape.setAlpha(127);

        //put shape into view
        ImageView magentaView = new ImageView(getApplicationContext());
        magentaView.setImageDrawable(magentaShape);
        magentaView.setPadding(20,20,20,20);

        //specify placement
        RelativeLayout.LayoutParams magentaViewLayoutParams = new RelativeLayout.LayoutParams(250,250);
        magentaViewLayoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
        magentaViewLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        magentaView.setLayoutParams(magentaViewLayoutParams);
        */