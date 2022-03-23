// top find no of object created  in a program 
// using keyword static 

class Objcount 
{
  static int i= 0 ;
 
   Objcount()
    {
       i++ ;
   }
   
   void display()
  {
    System.out.println(" NO OF OBJECTS CREATED " + i ) ;
}
  

public static void main(String args[])
 {
    Objcount  a = new Objcount() ;
   Objcount  b= new Objcount() ;
  Objcount  c= new Objcount() ;
  Objcount  d  = new Objcount() ;
  d.display() ;
}

}
  
