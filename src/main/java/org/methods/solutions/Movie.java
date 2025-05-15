package org.methods.solutions;

//!                             Declare the appropriate accessor and mutator
//!                             methods for this class. Output literal values to console.
class Movie {

    boolean isStreaming = true;
    char rating = 'R';
    double runtime = 1.5;
    int views = 2000;

    public static void main(String[] args) {
        Movie movie = new Movie();
        System.out.println(movie.isStreaming() + " " + movie.getRating() + " " + movie.getRuntime()+ " " + movie.getViews());
    }

    public boolean isStreaming() {
        return isStreaming;
    }

    public void setStreaming(boolean streaming) {
        isStreaming = streaming;
    }

    public char getRating() {
        return rating;
    }

    public void setRating(char rating) {
        this.rating = rating;
    }

    public double getRuntime() {
        return runtime;
    }

    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
