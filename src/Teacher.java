import java.util.Scanner;

public class Teacher extends person {

    private String sub ;
    private double class_num ;
    private double salary ;
    

    Teacher( String name , String last , double id) {
        super(name, last, id );
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getSub() {
        return sub;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getClass_num() {
        return class_num;
    }

    public void setClass_num(double class_num) {
        this.class_num = class_num;
    }

    public double getSalary() {
        return salary;
    }




    public void menuT (){

        char option;
        Scanner sc1=new Scanner(System.in);
        System.out.println("\n");

        do{
            
            System.out.println("********************************************");
            System.out.println("Choose an option");
            System.out.println("a) Personal info");
            System.out.println("b) Teaching info");
            option=sc1.next().charAt(0);
            System.out.println("\n");

            switch (option){


                case 'a':
                    super.menu();
                    break;

                case 'b':
                
                    char option1;
                    Scanner sc2=new Scanner(System.in);
                    System.out.println("\n");

                    do{
                    
                        System.out.println("********************************************");
                        System.out.println("Choose an option");
                        System.out.println("a) show info ");
                        System.out.println("b) Edit Subject ");
                        System.out.println("c) Edit Class number ");
                        System.out.println("e) Exit");

                        option1=sc2.next().charAt(0);
                        System.out.println("\n");

                        switch (option1){

                            case 'a':
                                System.out.println( "Subject : "+ sub );
                                System.out.println( "Class number: "+ class_num );
                                System.out.println( "******************************************** ");
                                System.out.println("\n");             
                                break;

                            case 'b':
                                System.out.println("......................");
                                System.out.println("Current Subject :" + sub);
                                System.out.println("\n");
                                System.out.println("Enter the New Subject :");
                                Scanner sc3=new Scanner(System.in);
                                String su=sc3.nextLine();
                                setSub(su);
                                System.out.println("......................");
                                System.out.println("\n");
                                break;

                            case 'c':
                                System.out.println("......................");
                                System.out.println("Current Class :" + class_num);
                                System.out.println("\n");
                                System.out.println("Enter the New GPA :");
                                Scanner sc4=new Scanner(System.in);
                                Double cl=sc4.nextDouble();
                                setClass_num(cl);
                                System.out.println("......................");
                                System.out.println("\n");
                                break;    

                            case 'e':
                                System.out.println("......................");
                                break;

                            default:
                                System.out.println("Choose a correct option to proceed");
                                break;

                        }
                
                    }while(option1 != 'e');
                    break;
                        
                case 'e':
                    System.out.println("......................");
                    break;

                default:
                    System.out.println("Choose a correct option to proceed");
                    break;

            }
        
        
        }while(option != 'e');
        System.out.println("Thank you for using our services");



        
    }             
            

    
    
}
