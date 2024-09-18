import java.util.Scanner;
class member
{
    long Phone_number;
    Double Salary;
    String name,Address;
    int Age;
    void printSalary()
    {
        System.out.println("Salary is :"+Salary);
    }
}
class Employee extends member
{
    String specialization,department;

}
class Manager extends member
{
    String specialization,department;
}
public class pract_18 
{
    public static void main(String[] args) 
    {

        Scanner s = new Scanner(System.in);
       int emp,man;
       System.out.println("Enter number of Employee :");
       emp=s.nextInt();
       System.out.println("Enter number of Manager :");
       man=s.nextInt();
       s.nextLine(); // Consume the newline character
    //    Employee objemp = new Employee[emp];
    //    Manager objman= new Manager[man];
    Employee[] objemp;
    objemp=new Employee[emp];
    Manager[] objman;
    objman=new Manager[man];
    s.nextLine();

       System.out.println("Enter Information For Employee ");
       System.out.println();
       for(int i=0;i<emp;i++)
       {
        objemp[i] = new Employee();
          System.out.println("Enter information for "+i +" Employee:");
          System.out.println("Enter Name :");
          objemp[i].name=s.nextLine();
          System.out.println("Enter Age :");
          objemp[i].Age=s.nextInt();
          System.out.println("Enter Phone Number :");
          objemp[i].Phone_number=s.nextLong();
          s.nextLine(); // Consume the newline character
          System.out.println("Enter Address :");
          objemp[i].Address=s.nextLine();
          System.out.println("Enter Salary :");
          objemp[i].Salary=s.nextDouble();
          s.nextLine();
      }
      System.out.println("Enter Information For Manager ");
       System.out.println();
       for(int i=0;i<man;i++)
       {
        objman[i] = new Manager();
          System.out.println("Enter information for "+i +" Manager:");
          System.out.println("Enter Name :");
          objman[i].name=s.nextLine();
          System.out.println("Enter Age :");
          objman[i].Age=s.nextInt();
          System.out.println("Enter Phone Number :");
          objman[i].Phone_number=s.nextLong();
          s.nextLine();
          System.out.println("Enter Address :");
          objman[i].Address=s.nextLine();
          s.nextLine();
          System.out.println("Enter Salary :");
          objman[i].Salary=s.nextDouble();
          s.nextLine();
      }
      System.out.println("Information for employee is as follows :");
      for(int i=0;i<emp;i++)
      {
        System.out.println("For employee "+i);
        System.out.println("name :"+objemp[i].name);
        System.out.println("Age :"+objemp[i].Age);
        System.out.println("Phone Number :"+objemp[i].Phone_number);
        System.out.println("Address :"+objemp[i].Address);
        // System.out.println("salary :"+objemp[i].printSalary(objemp[i].Salary));
        objemp[i].printSalary();
        
      }
      System.out.println("Information for Manager is as follows :");
      for(int i=0;i<man;i++)
      {
        System.out.println("For employee "+i);
        System.out.println("name :"+objman[i].name);
        System.out.println("Age :"+objman[i].Age);
        System.out.println("Phone Number :"+objman[i].Phone_number);
        System.out.println("Address :"+objman[i].Address);
        // System.out.println("salary :"+objemp[i].printSalary(objemp[i].Salary));
        objman[i].printSalary();
      }
      // s.close();
    }
}
