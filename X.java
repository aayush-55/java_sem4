class Bank 
{
  float getROI( )
  {
   return 0.0f ;
   }
}

class HDFC extends Bank 
 {
  float getROI()
   {
   return 4.0f ;
   }
 }
 
 class PNB extends Bank
 {
  float getROI()
   {
   return 4.5f ;
   }   
  }
  
  class SBI extends Bank 
  {
   float getROI() 
   {
   return 5.0f ;
   }
  }
  
  class X 
  {
   public static void main(String args[])
    {
     Bank obj1 = new HDFC();
     Bank obj2 = new PNB() ;
     Bank obj3 = new SBI()  ;
     
     System.out.println(" RATE OF HDFC -" + obj1.getROI() + " % " ) ;
     System.out.println(" RATE OF PNB -" + obj2.getROI()+" %" );
     System.out.println(" RATE OF SBI -" + obj3.getROI() + " % "  );
     }
  }
