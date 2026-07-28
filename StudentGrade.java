import java.util.Scanner;
public class StudentGrade {

    void Grade(){
        String name;
        long rollno;
        byte java,python,c;
        short total;
        float per;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter the roll no.:");
        rollno=sc.nextLong();
        System.out.println("Enter marks in java:");
        java=sc.nextByte();
        System.out.println("Enter marks in python:");
        python=sc.nextByte();
        System.out.println("Enter marks in C:");
        c=sc.nextByte();
        total=(short)(java+python+c);
        per=(total/3);
        System.out.println("You percentage is:"+per);
        if(per>=90){
            System.out.println("Grade A");
        }
        else if(per>=65 &&per<90){
            System.out.println("Grade B");
        }
                else if(per>=33 &&per<65){
            System.out.println("Grade C");
        }
        else{
            System.out.println("You are FAIL...");
      }
      
      
    }
    public static void main(String [] args){
        StudentGrade obj=new StudentGrade();
        obj.Grade();
    }
}