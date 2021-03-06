package tech.sutd.a50001_2020_lesson1startercode_yuanhawk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

import static tech.sutd.a50001_2020_lesson1startercode_yuanhawk.R.id.chara_button;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> images;
    Button charaButton;
    ImageView charaImage;
    int count = 0;

    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        //TODO 1.3 Instantiate An ArrayList object
        images = new ArrayList<>(10);

        //TODO 1.4 Add the image IDs to the ArrayList
        images.add(R.drawable.ashketchum);
        images.add(R.drawable.bartsimpson);
        images.add(R.drawable.edogawaconan);
        images.add(R.drawable.judyhopps);
        images.add(R.drawable.nemo);
        images.add(R.drawable.nickwilde);
        images.add(R.drawable.pikachu);
        images.add(R.drawable.snorlax);
        images.add(R.drawable.tomandjerry);
        images.add(R.drawable.yoda);

        //TODO 1.5 Get references to the charaButton and charaImage widgets using findViewById
        charaImage = findViewById(R.id.chara_image);

        //TODO 1.6 For charaButton, invoke the setOnClickListener method
        //TODO 1.7 Create an anonymous class which implements View.OnClickListener interface
        //TODO 1.8 Within onClick, write code to randomly select an image ID from the ArrayList and display it in the ImageView
        findViewById(chara_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = r.nextInt(10);

                //TODO 1.9 [On your own] Create another button, which when clicked, will cause one image to always be displayed
                charaImage.setImageResource(images.get(count));
            }
        });
    }
}