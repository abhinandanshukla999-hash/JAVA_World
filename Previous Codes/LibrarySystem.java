import java.util.Scanner;
public class LibrarySystem {
    Scanner sc=new Scanner(System.in);
    int bookId,avlBook,totalBook;
    String bookName="",authName="";
    boolean isBookAdded=false;
    void addBook(){
        
        
        System.out.println("Enter Book ID:");
         bookId=sc.nextInt();

         System.out.println("Enter Book Name:");
         sc.nextLine();
          bookName=sc.nextLine();

         System.out.println("Enter Author Name:");
         authName=sc.nextLine();

         System.out.println("Enter Total Copies:");
         totalBook=sc.nextInt();

         avlBook=totalBook;

         isBookAdded=true;

    }

    void searchBook(){
        System.out.println("Enter the book you want to search:");
        String searchBook=sc.nextLine();

        if (searchBook==bookName) {
            System.out.println("Book is present");
            viewBook();
        }
        else{
            System.out.println("Go and add book !");
        }

        
    }

    void viewBook(){
        if (isBookAdded==false) {
            System.out.println("Go and add first!");
        }
        else{
        System.out.println("Book ID:\n"+bookId);
        System.out.println("Book Name:"+bookName);
        System.out.println("Author Name:"+authName);
        System.out.println("Total Copies:"+totalBook);
        System.out.println("Available Copies:"+avlBook);
        }
    }
    void mainMenu(){
        System.out.println("1.Add Book");
        System.out.println("2.View Book");
        System.out.println("3.Search Book");
        System.out.println("4.Issue Book");
        System.out.println("5.Return Book");
        System.out.println("6.Delete Book");
        System.out.println("7.Library Report");
        System.out.println("8.Exit");
    }


    public static void main(String[] args) {
        LibrarySystem obj=new LibrarySystem();
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            obj.mainMenu();
            System.out.println("Enter choice:");
             choice=sc.nextInt();
            
            
            switch (choice) {
                case 1:
                    obj.addBook();

                    break;
                case 2:
                    obj.viewBook();
                    break;
                case 3:
                    obj.searchBook();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
        while (choice!=8) ;
        sc.close();
    }
}