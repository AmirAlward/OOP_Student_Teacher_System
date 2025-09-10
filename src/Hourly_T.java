import java.util.Scanner;

public class Hourly_T extends Teacher {

    private double working_hour ;
    private double hour_rate ;

    Hourly_T( String name , String last , double id) {
        super(name, last, id );
    }

    public double getWorking_hour() {
        return working_hour;
    }

    public void setWorking_hour(double working_hour) {
        this.working_hour = working_hour;
    }

    public double getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }




    public void menuH (){

        char option;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome T:"+getFirstName() + " " + getLaststName() );
        System.out.println("Your ID:"+ getId() );
        System.out.println("\n");

        do{
            
            System.out.println("********************************************");
            System.out.println("Teacher :");
            System.out.println("Choose an option");
            System.out.println("a) Personal or teaching info");
            System.out.println("b) Salary info");
            option=sc.next().charAt(0);
            System.out.println("\n");

            switch (option){


                case 'a':
                    super.menuT();
                    break;

                case 'b':
                
                    char option1;
                    Scanner sc1=new Scanner(System.in);
                    System.out.println("\n");

                    do{
                    
                        System.out.println("********************************************");
                        System.out.println("Choose an option");
                        System.out.println("a) show info ");
                        System.out.println("b) Edit Salary ");
                        System.out.println("c) Edit bounus ");
                        System.out.println("e) Exit");

                        option1=sc1.next().charAt(0);
                        System.out.println("\n");

                        switch (option1){

                            case 'a':
                                System.out.println( "Working hour : "+ working_hour );
                                System.out.println( "Hour Rate : "+ hour_rate );
                                System.out.println( "******************************************** ");
                                System.out.println("\n");             
                                break;

                            case 'b':
                                System.out.println("......................");
                                System.out.println("Current Salary :" + getSalary( ));
                                System.out.println("\n");
                                System.out.println("Enter the New Salary :");
                                Scanner sc2=new Scanner(System.in);
                                Double sa=sc2.nextDouble();
                                setSalary(sa);
                                System.out.println("......................");
                                System.out.println("\n");
                                break;

                            case 'c':
                                System.out.println("......................");
                                System.out.println("Current Working hour :" + working_hour);
                                System.out.println("\n");
                                System.out.println("Enter the New Bonus :");
                                Scanner sc3=new Scanner(System.in);
                                Double wo=sc3.nextDouble();
                                setWorking_hour(wo);
                                System.out.println("......................");
                                System.out.println("\n");
                                break;  
                            
                            case 'd':
                                System.out.println("......................");
                                System.out.println("Current Hour Rate :" + hour_rate);
                                System.out.println("\n");
                                System.out.println("Enter the New Hour Rate :");
                                Scanner sc4=new Scanner(System.in);
                                Double hr=sc4.nextDouble();
                                setHour_rate(hr);
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
