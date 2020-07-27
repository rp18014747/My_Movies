package sg.edu.rp.c346.id18014747.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Movie> alMovie;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);
        alMovie = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2014, 11, 15); // month from 0
        Calendar date2 = Calendar.getInstance();
        date2.set(2015, 5, 15); // month from 0
        Movie m1 = new Movie("The Avengers", 2020, "pg13", "Action | Sci-Fi", date1, "Golden Village - Bishan", "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.", 4);
        Movie m2 = new Movie("Planes", 2013, "pg", "Animation | Comedy", date2, "Cathay - AMK Hub", "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.", 2);
        alMovie.add(m1);
        alMovie.add(m2);

        caMovie = new CustomAdapter(this, R.layout.row, alMovie);
        lvMovie.setAdapter(caMovie);
        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Movie movie = alMovie.get(position);
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("title", movie.getTitle());
                intent.putExtra("year", movie.getYear()+"");
                intent.putExtra("rated", movie.getRated());
                intent.putExtra("genre", movie.getGenre());
                Calendar date = movie.getWatched_on();
                String date1 = date.get(Calendar.DATE) + "/" +
                        date.get(Calendar.MONTH) + "/" +
                        date.get(Calendar.YEAR);
                intent.putExtra("watched_on", date1);
                intent.putExtra("in_theatre", movie.getIn_theatre());
                intent.putExtra("description", movie.getDescription());
                intent.putExtra("rated", movie.getRated());
                intent.putExtra("stars", movie.getStars());
                startActivity(intent);
            }
        });
    }
}
