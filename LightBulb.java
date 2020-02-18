

    public class LightBulb
   {
      private boolean isTurnedOn;  //true of on, false if off
   
       public LightBulb()
      {
         isTurnedOn = false;
      }
   
   //*******FINISH THE TWO METHODS BELOW******************************************************
   //post: notifies the caller of the method of the state of the bulb
       public boolean isOn()
      {
         if(isTurnedOn == false)
         {
          return false;
         }
         else
         {
          return true;
         }
      }
   
   //post:  reverses the state of the bulb
       public void pullString()
      {
         if(isTurnedOn == false)
         {
          isTurnedOn = true;
         }
         else
         {
          isTurnedOn = false;
         }
      }
   //******************************************************************************************   
   }