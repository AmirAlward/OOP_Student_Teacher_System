import java.util.Scanner;



public class Student extends person {

    Student( String name , String last , double id) {
        super(name, last, id );
    }
    
    private double study_level ;
    private double gpa ;

    public double getStudy_level() {
        return study_level;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setStudy_level(double study_level) {
        this.study_level = study_level;
    }

    public double getGpa() {
        return gpa;
    }
    public void menu(   ){
        super.menu();

    }




    public void menuS (){

        char option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome "+getFirstName() + " " + getLaststName() );
        System.out.println("Your ID:"+ getId() );
        System.out.println("\n");

        do{


            System.out.println("********************************************");
            System.out.println("Student :");
            System.out.println("Choose an option");
            System.out.println("a) Personal info");
            System.out.println("b) study info");

            option=sc.next().charAt(0);
            System.out.println("\n");

            switch (option){

                case 'a':
                    super.menu();
                    break;

                case 'b':                  
                    char option1;
                    Scanner sc1=new Scanner(System.in);
                    System.out.println("\n");

                    do{                     
                        System.out.println("********************************************");
                        System.out.println("Choose an option");
                        System.out.println("a) show info ");
                        System.out.println("b) Edit Study level ");
                        System.out.println("c) Edit Gpa ");
                        System.out.println("e) Exit");
                        option1=sc1.next().charAt(0);
                        System.out.println("\n");

                        switch (option1){
                            
                            case 'a':
                                System.out.println( "Study level: "+ study_level );
                                System.out.println( "GPA: "+ gpa );
                                System.out.println( "******************************************** ");
                                System.out.println("\n");             
                                break;

                            case 'b':
                                System.out.println("......................");
                                System.out.println("Current level :" + study_level);
                                System.out.println("\n");
                                System.out.println("Enter the New level :");
                                Scanner sc2=new Scanner(System.in);
                                Double le=sc2.nextDouble();
                                setStudy_level(le);
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


                    }while(option1 !='e');
                    break;
                    

                case 'e':
                    System.out.println("......................");
                    break;

                default:
                    System.out.println("Choose a correct option to proceed");
                    break;
                    }


        }while(option!='e');
        System.out.println("Thank you for using our services");

        

    }


      
            
            
            
            
}
