class Shape
{
  
  void area( int a)
  {
    System.out.println("AREA OF SQUARE IS :") ;
    System.out.println(a*a) ;
   }
   
   void area( int a ,int b)
   {
   System.out.println("AREA OF RECTANGLE:") ;
    System.out.println(a*b) ;
   }
   
   void area( int a ,int b,int c)
   {
   System.out.println("AREA OF EQUILATERALN TRAINGLE") ;
    System.out.println(a*b*c) ;
   }
   
    public static void main( String args[])
    {
     Shape obj = new Shape() ;
     obj.area(5) ;
     obj.area(10,20) ;
     obj.area(5,5,5) ;
     }
 }    
  
