class D
{
   D()
   {
     this(100);

   }

   D(int x)
   { 
   	this(15,20);
   	System.out.println("INSIDE PARMATEZIED CONSTRCTOR :");
   }

   D(int x ,int y)
   {
   	System.out.println("inside second constrcutor");
   }

   public static void main  (String args[])
   {
   	D obj = new D();
   }
}