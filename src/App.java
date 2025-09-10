import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        char option;
        char option1;

        do {

            Scanner sc =new Scanner(System.in);
            System.out.println("Please choose an option:");
            System.out.println("\n");
            System.out.println("a) Student");
            System.out.println("b) Teacher");
            option=sc.next().charAt(0);
            System.out.println("\n");
            System.out.println("......................");



            if (option == 'a' || option == 'b'){
            Scanner sc1 =new Scanner(System.in);
            System.out.println("......................");
            System.out.println("Type in your First Name");
            String name=sc1.nextLine();
            System.out.println("\n");

            System.out.println("Type in your Last Name ");
            String last=sc1.nextLine();
            System.out.println("\n");

            System.out.println("Type in your ID: ");
            double id =sc1.nextDouble();
            System.out.println("\n");


            switch (option){

                case 'a':
                    Student s1 = new Student(name, last, id ) ;
                    s1.menuS () ;
                    break;
                
                case 'b':{
                    
                    do {

                        Scanner sc2 =new Scanner(System.in);
                        System.out.println("Please choose a categeory:");
                        System.out.println("\n");
                        System.out.println("a) monthly paid ");
                        System.out.println("b) hourly paid ");
                        System.out.println("e) exit ");
                        option1=sc2.next().charAt(0);
                        System.out.println("\n");

                        switch(option1){

                            case 'a':
                                monthly_T m1 = new monthly_T(name, last, id ) ;
                                m1.menuM(); 
                                break;

                            case 'b':
                                monthly_T h1 = new monthly_T(name, last, id ) ;
                                h1.menuM(); 
                                break;

                            case 'e':
                                System.out.println("......................");
                                break;

                            default:
                                System.out.println("Choose a correct option to proceed");
                                break;


                        }

                    } while( option1 != 'e') ;break;


                }
            }
            }
            
        } while ( option != 'e') ;

      
    }
}
