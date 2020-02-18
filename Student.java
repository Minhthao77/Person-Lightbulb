
import java.io.*;
//d.oberle
public class Student extends Person		//this defines a new data type

{
//data members and methods will be inherited from the base class person

//pre: a > 0 and w > 0 (age and weight must be positive)
//post:  this is a constructor - it runs when a person is created
//and you send it 3 parameters - i.e. person x = new student("Stan", 39, 172);

   public Student(String n, int a, double w)
   {
      super(n, a, w);		//call the super classes constructor (base class person)
   }

   //post:  this is another constructor - it is called when you create
   //a new student and you send it no parameters - i.e. person x = new student();
	//their age is a random # from 7 - 18 and their weight is between 80 and 230

   public Student()
   {
      super("punk", (int)(Math.random()*12 + 7), (int)(Math.random()*151 + 80));
   }

//pre:  age>=7 && age<=18
//post: will return the student's grade level if they are of age, -1 otherwise
   public int findGrade()
   {
      if (this.getAge() <= 18 && this.getAge() >= 7)
         return this.getAge() - 6;
      return -1;
   }

//post:this method will show the persons info
//it's POLYMORPHIC because it has the same name as the base class but
//it does something different (also shows what grade the student is in)
   public String toString()
   {
      String ans = "";
      ans = ans + "Name:" + this.getName() + ", Age:" + this.getAge() + ", Weight:" + this.getWeight();
      ans = ans + "\n" + "Grade level: " + findGrade();
      return ans;
   }
}