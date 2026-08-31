import java.util.Scanner;
class EmployeeManagement{
    Scanner sc=new Scanner(System.in);
    String empName,empID,post,dept,email,phone;

    double empSalary;
    boolean check=false;

    void mainMenu(){

        System.out.println("1.Add Employee");
        System.out.println("2.View Employee");
        System.out.println("3.Search Employee");
        System.out.println("4.Update data of the employee");
        System.out.println("5.Exit");

        System.out.println("Enter your choice first:");
        int choice=sc.nextInt();
        
        switch(choice){
            case 1:
                addEmployee();
                break;
            case 2:
                viewEmployee();
                break;
            case 3:
                 empSearch();
                break;
            case 4:
                System.out.println("You change only phone number,email,department! ");
                updateDetails();
                break;
            case 5:
                break;
            default:
                System.out.println("Choose valid options!");
                break;   
        }
    }

    void addEmployee(){
        
        System.out.println("Enter Employee Name:");
        empName=sc.nextLine();
        empName=sc.nextLine();

        System.out.println("Enter Employee ID:");
        empID=sc.next();

        System.out.println("Enter phone number:");
        phone=sc.next();

        System.out.println("Enter email:");
        email=sc.next();
        System.out.println("Enter the post of the employee:");
        post=sc.nextLine();
         post=sc.nextLine();
        System.out.println("Enter the department employee belongs:");
        dept=sc.nextLine();

        System.out.println("Enter employee salary:");
        empSalary=sc.nextDouble();

        check=true;


    }

    void viewEmployee(){
        if(!check){
            System.out.println("Add the employee first!");
            addEmployee();
        }
        else{
        System.out.println("Employee Name Is:"+empName);
        System.out.println("Employee ID Is:"+empID);
        System.out.println("Employee Phone Number Is:"+phone);
        System.out.println("Employee Email Is:"+email);
        System.out.println("Employee Salary Is:"+empSalary);
        System.out.println("Employee Post:"+post);
        System.out.println("Employee Department Is:"+dept);
        }
    }
    void empSearch(){
        System.out.println("Enter the employee id you want to search for:");
        String search_id=sc.next();
        if(search_id==empID){
            System.out.println("Employee is available./n Employee details are given below:");
            viewEmployee();
        }
        else{
            System.out.println("There is no such employee!");
        }
    }

    void updateDetails(){
        System.out.println("Enter  new phone number:");
        phone=sc.next();

        System.out.println("Enter new email:");
        email=sc.next();

        System.out.println("Enter new department:");
        dept=sc.nextLine();


    }
    public static void main(String [] args){
        EmployeeManagement obj=new EmployeeManagement();
        obj.mainMenu();

    }
}