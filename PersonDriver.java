

import java.io.*;
//d.oberle
public class PersonDriver
{

   public static void main(String argv[])throws IOException
   {
   
   //make a person object using the 3 argument constructor
      Person tonyBennet = new Person("Tony Bennet", 63, 192);
      Person me = new Person("Reverend Oberle", 45, 225);
   	//make a person object using the default constructor
      Person jonDoe = new Person();
      Person you = new Person();
      System.out.println(me);
      System.out.println(tonyBennet);
      System.out.println(jonDoe);
      you.readInfo();
      System.out.println(you); 
      
      Student Nancy = new Student("Nancy", 17, 178);
      System.out.println(Nancy);
      
      Person[] people = new Person[5];
      
      for(int p = 0; p<5; p++)
      {
         people[p] = new Person();
         people[p].readInfo();
      }
      int p = (int)(Math.random()*6);
      people[p].die();
      
      for(p = 0; p<5; p++)
      {
       System.out.println(people[p]);
      }
      
      
      Person x = new Person();
      x.born();
      System.out.println(x);
      x.setInfo("Bruce Campbell", 28, 173);
      System.out.println(x);
      
   }
}