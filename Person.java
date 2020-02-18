

import java.io.*;
import java.util.*;
//d.oberle
public class Person		//this defines a new data type

{
//data fields - the parts of the object that hold info
   private String name;		//private means they can only be accessed in class person
   private int age;			//even sub (derived) classes can't get to them without
   private double weight;	//an accessor method
   private boolean alive;                 
      
//methods - the parts of the object that do actions

//pre: a > 0 and w > 0 (age and weight must be positive)
//post:  this is a constructor - it runs when a person is created
//and you send it 3 parameters - i.e. person x = new person("Stan", 39, 172);
   public Person(String n, int a, double w)
   
   {
      name = n;
      age = a;
      weight = w;
      alive = true;
   }

 //post:  this is another constructor - it is called when you create
 //a new person and you send it no parameters - i.e. person x = new person();
   public Person()
   {
      name = "blank";
      age = 0;
      weight = 0;
      alive = false;
   }
//post: this is an accessor method to send the age (private data field)
   public int getAge()
   {
      return age;
   }

   public String getName()
   {
      return name;
   }

   public double getWeight()
   {
      return weight;
   }

 //post:this method will show the persons info if we send a person to System.out.println
   public String toString()
   {
      String ans = "";
      ans = ans + "Name:" + name + ", Age:" + age + ", Weight:" + weight;
      if (alive)
         ans = ans + ": alive";
      else
         ans = ans + ": deceased";
      return ans;	
   }

 //post:  this method will allow the user to enter a persons data fields

   public void readInfo() throws IOException
   {
      Scanner input=new Scanner(System.in);
      System.out.print("Enter the persons name:");
      name = input.next();
      System.out.print("Enter the persons age:");
      age = input.nextInt();
      System.out.print("Enter the persons weight:");
      weight = input.nextDouble();
      alive = true;
   }

   public void setInfo(String n, int a, double w)
   {
    name = n;
    age = a;
    weight =w;
   }

 //post:  this method will make a baby

   public void born()
   {
      name = "To be determined";
      age = 0;
      weight = (Math.random()*9) + 6;
      alive = true;
   }
//post:  this method will change data fields to decomposing and deceased

   public void die()
   {
      weight = weight/2.0;
      alive = false;
   }

}