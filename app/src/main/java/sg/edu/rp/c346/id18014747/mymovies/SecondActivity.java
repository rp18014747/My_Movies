package sg.edu.rp.c346.id18014747.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvTitle, tvLabel, tvWatchedOn, tvTheatre, tvDescription;
    ImageView ivRating;
    RatingBar ratingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intentlayout);

        tvTitle = findViewById(R.id.textViewTitle);
        tvLabel = findViewById(R.id.textViewLabel);
        tvWatchedOn = findViewById(R.id.textViewWatchedOn);
        tvTheatre = findViewById(R.id.textViewTheatre);
        tvDescription = findViewById(R.id.textViewDesc);
        ivRating = findViewById(R.id.imageViewRating);
        ratingbar = findViewById(R.id.ratingBar);

        Intent intentReceived = getIntent();
        String title = intentReceived.getStringExtra("title");
        String year = intentReceived.getStringExtra("year");
        String genre = intentReceived.getStringExtra("genre");
        String watchedOn = intentReceived.getStringExtra("watched_on");
        String theatre = intentReceived.getStringExtra("in_theatre");
        String description = intentReceived.getStringExtra("description");
        String rated = intentReceived.getStringExtra("rated");
        int stars = intentReceived.getIntExtra("stars", 0);
        tvTitle.setText(title);
        tvLabel.setText(year + " - " + genre);
        tvDescription.setText(description);
        tvWatchedOn.setText("Watched on: " + watchedOn);
        tvTheatre.setText("In Theatre: " + theatre);
        switch (rated) {
            case "g":
                ivRating.setImageResource(R.drawable.rating_g);
                break;
            case "m18":
                ivRating.setImageResource(R.drawable.rating_m18);
                break;
            case "nc16":
                ivRating.setImageResource(R.drawable.rating_nc16);
                break;
            case "pg":
                ivRating.setImageResource(R.drawable.rating_pg);
                break;
            case "pg13":
                ivRating.setImageResource(R.drawable.rating_pg13);
                break;
        }
        ratingbar.setRating(stars);
    }
}
