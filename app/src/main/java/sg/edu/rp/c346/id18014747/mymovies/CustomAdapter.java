package sg.edu.rp.c346.id18014747.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Movie> movieList;

    public CustomAdapter(Context context, int resource, ArrayList<Movie> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvLabel = rowView.findViewById(R.id.textViewLabel);
        ImageView ivRating = rowView.findViewById(R.id.imageViewRating);

        // Obtain the Task information based on the position
        Movie currentMovie = movieList.get(position);

        // Set values to the TextView to display the corresponding information
        tvTitle.setText(currentMovie.getTitle());
        Calendar date = Calendar.getInstance();
        if (currentMovie.getYear() == date.get(Calendar.YEAR)) {
            tvTitle.setTextColor(getContext().getResources().getColor(android.R.color.holo_red_dark));
        }
        tvLabel.setText(currentMovie.getYear() + " - " + currentMovie.getGenre());
        switch (currentMovie.getRated()) {
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

        return rowView;
    }
}