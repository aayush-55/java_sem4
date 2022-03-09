import  java.util.*;

class Bank 
{
 int acc_no ;
 String name ;
 int amount ;
  
  void insert(int a ,String nm, int am)
  {
    acc_no= a ;
    name=nm ;
    amount=am ;
    
  }
  
  void deposit ( int d)
  {
    amount = amount + d;
  } 
  
  void withdraw(int  w)
  {
    if(w<amount)
    amount=amount-w ;
    
    else
    System.out.println(" not suuficent balance");
    
}
  
  
  void display()
  {
    System.out.println(acc_no + " " +name + " " + amount) ;
    }
    
   
   public static void main(String args [])
   {
    Scanner sc= new Scanner(System.in) ;
    
     System.out.println("enter account number") ;
       int a =sc.nextInt() ;
        sc.nextLine() ;
      System.out.println("Enter your name") ;
       String n=sc.nextLine() ;
     
     
     
       System.out.println("enter intial balance  ; ") ;
        int bl =sc.nextInt() ;
        
        System.out.println("enter amount to deposit   ") ;
        int d =sc.nextInt() ;
        
        System.out.println("enter amount to withdraw") ;
        int w= sc.nextInt() ; 
        
        Bank b =new Bank() ;
        b.insert(a,n,bl) ;
        b.display() ;
        b.deposit(d) ;
        b.withdraw(w) ; 
        b.display() ;
        
        } 
        
  }      
        
        
        
        
        
        
        
     
     
     
   
