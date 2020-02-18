//Minh Thao  Pd: 6

import java.io.*;
import java.util.*;

public class MovieDriver
{
   public static Scanner input = new Scanner(System.in);

   public static void menu()
   {
      System.out.println("1) Change rating\t\t2) show only the title\t\t3) show only the year");
      System.out.println("4) Run Again\t\t\t5) Quit");
   }
  
   public static void main(String[]arg)
   {
      int op = 0;
      Movie x = new Movie(); 
         
      System.out.println("Enter the title of a movie: ");
      String t = input.next();
      System.out.println("Enter the rating of a movie: ");
      String r = input.next();
      System.out.println("Enter the year of the movie: ");
      String re = input.next();
      Movie y = new Movie(t, r, re);
      
      System.out.println();
      System.out.println("Now Playing:");
      System.out.println(x);
      System.out.println(y);
      Movie c = y;
      
      while(op != 5)
      {  
         if(op == 4)
         {
         
            System.out.println("Enter the title of a movie: ");
            t = input.next();
            System.out.println("Enter the rating of a movie: ");
            r = input.next();
            System.out.println("Enter the year of the movie: ");
            re = input.next();
            c = new Movie(t, r, re);
         
            System.out.println();
            System.out.println("Now Playing:");
            System.out.println(x);
            System.out.println(c);
         }
         else
         {
            if(op == 1)
            {
               System.out.println("Enter the Rating of a movie: ");
               String rn = input.next();
            
               c.changeRating(rn);
               System.out.println("Now Playing:");
               System.out.println(x);
               System.out.println(c);
            }
            else
            {
               if(op == 2)
               {
                  System.out.println(x.getTitle());
                  System.out.println(c.getTitle());
               }
               
               else
               {
                  if(op == 3)
                  {
                     System.out.println(x.getYear());
                     System.out.println(c.getYear());
                  }
               }
            }
         }
         menu();
         op = input.nextInt();
      }
   }
}