import  java.util.*; 
class Student 

 {
     int roll_no , id ;
 
    String name ;
 
     static  String university="GEHU"; 
     static String  branch =" CSE"  ; // using of static keyword  

     Student( int roll_no ,int id ,String name ) 
     {
        this.roll_no = roll_no ;    // using of this keyword 
        this.id          =   id ;
        this.name    =  name  ;
     }
     
     void display()     // display function  
     {
       System.out.println(" Student name : " +  name) ;
        System.out.println(" University name : " +  university ) ; 
       System.out.println(" Branch name :" + branch) ;
       System.out.println(" Roll no :" + roll_no ) ;
       System.out.println(" ID : "  + id ) ;
   }
  
     public static void main(String args [])
    {
       Scanner sc = new Scanner(System.in) ; // scanner class 
       
       System.out.println(" enter student name ") ; 
        String name = sc.nextLine() ; 

       System.out.println(" enter id ") ;
        int id = sc.nextInt() ;

        System.out.println(" enter  roll no") ;
         int roll_no= sc.nextInt() ;
    
        Student  a   =  new Student( roll_no ,  id,  name) ;
     
        a.display() ;
 } 

}
