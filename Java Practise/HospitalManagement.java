import java.util.Scanner;
class HospitalManagement{
    Scanner sc=new Scanner(System.in);

    int pID[]=new int[100];
    String pName[]=new String[100];
    byte age[]=new byte[100];
    String pGender[]=new String[100];
    String pDisease[]=new String[100];
    String dName[]=new String[100];
    int priority[]=new int[100];

    int count=0;
    int c=0;
    void add(){
        System.out.println("Enter Patient ID:");
        pID[count]=sc.nextInt();

        System.out.println("Enter Patient Name:");
        pName[count]=sc.nextLine();
        pName[count]=sc.nextLine();

        System.out.println("Enter Patient Age:");
        age[count]=sc.nextByte();

        System.out.println("Enter Patient Gender:");
        pGender[count]=sc.next();

        System.out.println("Enter Patient Disease:");
        pDisease[count]=sc.nextLine();
        pDisease[count]=sc.nextLine();

        System.out.println("Enter Doctor Name:");
        dName[count]=sc.nextLine();

        System.out.println("Enter Priority:\n"+"1.Normal\n"+"2.Emergency");
        int p=sc.nextInt();
        if(p==1){
            priority[count]=1;
        }
        else if(p==2){
            priority[count]=2;
        }
        else{
            System.out.println("Enter a valid choice !");
        }
        count++;

    }
    void viewAll(){
    
        for(int i=0;i<=count-1;i++){
            System.out.println("\nPatient Name:"+pName[i]);
            System.out.println("Patient ID:"+pID[i]);
            System.out.println("Patient Disease:"+pName[i]+"\n");
        }

    }
    void searchPatient(){
        System.out.println("Enter patient ID");
        int paID=sc.nextInt();
        for(int i=0;i<count;i++){
            if(pID[i]==paID){
                System.out.println("Patient ID:"+pID[i]);
                System.out.println("Patient Name:"+pName[i]);
                System.out.println("Patient Disease:"+pDisease[i]);
                System.out.println("Assigned Doctor:"+dName[i]);
            }
        }
    }

    void callNext(){
        
        if(priority[c]==1){

            System.out.println("======Normal Patient=======");
            System.out.println("Patient ID:"+pID[c]);
            System.out.println("Patient Name:"+pName[c]);
            System.out.println("Patient Disease:"+pDisease[c]);
            c++;
            
        }
        else if(priority[c]==2){
            System.out.println("======Emergency Patient=======");
            System.out.println("Patient ID:"+pID[c]);
            System.out.println("Patient Name:"+pName[c]);
            System.out.println("Patient Disease:"+pDisease[c]);
            c++;
        }
    }

    void viewWaiting(){

        System.out.println("\n=======Waiting Queue=======\n");
        for(int i=c;i<priority.length;i++){
            if(pID[i]==0){
                continue;
            }
            else{
                System.out.println("Patient ID:"+pID[i]);
                System.out.println("Patient Name:"+pName[i]);
                System.out.println("Patient Disease:"+pDisease[i]);
                System.out.println("Assigned Doctor:"+dName[i]);
            }
            System.out.println();
            
        }
    
    }

    void sortQ(){
        System.out.println("\n------------------\n");
        System.out.println("Sort by Normal patients");
        int check=pID[0];

        for(int i=1;i<pID.length;i++){
            for(int j=0;j<pID.length;j++){
                if(check<pID[i]){

                }
            }
            
        }
    }

    


    void mainMenu(){
        System.out.println("\n=========Hospital Queue Management System=========\n");
        System.out.println("1.Add Patient");
        System.out.println("2.View All Patients");
        System.out.println("3.Search Patient");
        System.out.println("4.Call Next Patient");
        System.out.println("5.View Waiting Queue");
        System.out.println("6.Sort Patients");
        System.out.println("7.Update Patient");
        System.out.println("8.Remove Patient");
        System.out.println("9.Hospital Report");
        System.out.println("10.Exit");
        System.out.println("==========================================\n");
    }
    public static void main(String [] args){

        HospitalManagement obj=new HospitalManagement();
        int choice;
        do{
            obj.mainMenu();
            System.out.println("Enter your choice:");
             choice=obj.sc.nextInt();
            
            switch(choice){
                case 1:
                    obj.add();
                    break;
                case 2:
                    obj.viewAll();
                    break;
                case 3:
                    obj.searchPatient();
                    break;
                case 4:
                    obj.callNext();
                    break;

                case 5:
                    obj.viewWaiting();
                    break;
                case 6:
                    obj.sortQ();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Enter a valid Choice !");
                    break;
                
            }
        }
        while(choice!=10);

    }
}