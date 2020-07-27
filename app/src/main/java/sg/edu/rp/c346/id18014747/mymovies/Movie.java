package sg.edu.rp.c346.id18014747.mymovies;

import java.util.Calendar;

public class Movie {

    private String title, rated, genre, in_theatre, description;
    private int year, stars;
    private Calendar watched_on;

    public Movie(String title, int year, String rated, String genre, Calendar watched_on, String in_theatre, String description, int stars) {
        this.title = title;
        this.rated = rated;
        this.genre = genre;
        this.in_theatre = in_theatre;
        this.description = description;
        this.year = year;
        this.watched_on = watched_on;
        this.stars = stars;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Calendar getWatched_on() {
        return watched_on;
    }

    public void setWatched_on(Calendar watched_on) {
        this.watched_on = watched_on;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
