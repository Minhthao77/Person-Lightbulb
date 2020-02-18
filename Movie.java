//Minh Thao  Pd: 6

public class Movie
{
   private String title;
   private String rating;
   private String release;
   
   public Movie()
   {
      title = "The Thing";
      rating = "R";
      release = "1981";
   }
   
   public Movie(String t, String r, String re)
   {
      title = t; 
      rating = r.toUpperCase();
      release = re;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public String getYear()
   {
      return release;
   }
   
   public void changeRating(String rn)
   {
      rating = rn.toUpperCase();
   }
   
   public String toString()
   {
      return title + ", " + "rated " + rating + ", " + release;
   }
    
}//end Movie