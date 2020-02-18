
public class LightDriver
{
   
   public static void main(String[]arg)
   {
      int t = (int)(Math.random()*1401)+100;
      
      LightBulb[] x = new LightBulb[t];
      
      for(int p = 0; p<x.length; p++)
      {
         x[p] = new LightBulb();
         System.out.print(x[p].isOn() + " ");
      }
      System.out.println();
      
      int count = 0;
      int o = (int)(Math.random()*141)+1;
   
      for(int k = 1; k<=o; k++)
      {
         System.out.println("Iteration " + k);
         for(int s = 0; s<x.length; s = s+k)
         {
            x[s].pullString();     
         }
         
         for(int p = 0; p<x.length; p++)
         {
            System.out.print(x[p].isOn()+" ");
         }
         System.out.println();
         for(int y = 0; y<x.length; y++)
         {
            count++;
         }
      }
   
      System.out.println(count);
   }
}