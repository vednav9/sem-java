class Employee{  
 float salary=40000;  
}  
class c6 extends Employee{  
 int bonus=10000;  
 public static void main(String args[]){  
   c6 p=new c6();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}