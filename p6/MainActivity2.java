package com.example.explicit_intents;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String imgindex = bundle.getString("ImageIndex");
            SetImage(imgindex);
        }
    }

    private void SetImage(String imgindex) {
        ImageView imageView = findViewById(R.id.img1);

        switch (imgindex) {
            case "1":
                imageView.setImageResource(R.drawable.images);
                break;

            case "2":
                imageView.setImageResource(R.drawable.download);
                break;

            case "3":
                imageView.setImageResource(R.drawable.patti);
                break;

            case "4":
                imageView.setImageResource(R.drawable.eli);
                break;
            default:
                Toast.makeText(this,"Index is not avilable",Toast.LENGTH_SHORT).show();
        }
    }
}
