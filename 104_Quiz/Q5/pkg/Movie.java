package pkg;

public class Movie{
    String movie;
    double rating; 
    int revenue;
    int numRatings;
    
public Movie(){
    movie = "Avengers"; 
    rating = 8.0;
    numRatings = 33;
    revenue = 623357910;
    
}
public Movie(String a, double b, int c, int d){
    movie = a;
    rating = b;
    numRatings = c;
    revenue = d;
}
// Part 2
public void movieToString(String a, double b, int c, int d){
    System.out.println("Movie: " + movie);
    System.out.println("Rating: " + rating);
    System.out.println("Number of ratings: " + numRatings);
    System.out.println("Revenue: " + revenue);
}
// Part 3
public String getMovieName(){
    return movie;
}
public double getRevenue(){
    return rating;
}
public int getNumber(){
    return numRatings;
}
//public int getRevenue(){
   // return revenue;
//}
// Part 4

public double addRating(double a){
    rating = ((rating * numRatings + a)/(numRatings + 1));
    
    numRatings++;
    return rating;
}

// Part 5
public double getRatings(){
    return rating;
}

public boolean compareRatings(Movie a){
    return a.getRatings < rating;
}

}


