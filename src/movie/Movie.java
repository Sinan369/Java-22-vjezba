package movie;

import javax.swing.*;

public class Movie {
    private String name;
    private String director;
    private int review;

    public Movie(String name, String director, int review) {
        this.name = name;
        this.director = director;
        if (review >= 1 && review <= 10){
            this.review = review;
        } else {
            JOptionPane.showMessageDialog(null, "Ocjena u jednom od ovih filmova nije u odgovarajućem opsegu! Opseg ocjene mora biti u rasponu od 1-10");
        }
    }

    public String getName() {
        System.out.println("Ime Filma je: " + name);
        return name;
    }

    public String getDirector() {
        System.out.println("Redatelj Filma je: " + director);
        return director;
    }

    public int getReview() {
        System.out.println("Ocjena filma je: " + review);
        return review;
    }
}
