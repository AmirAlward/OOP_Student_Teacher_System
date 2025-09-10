import java.util.Scanner;

public class monthly_T extends Teacher {

    private double bonus ;
    private double dedu ;

    monthly_T( String name , String last , double id) {
        super(name, last, id );
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setDedu(double dedu) {
        this.dedu = dedu;
    }

    public double getBonus() {
        return bonus;
    }

    public double getDedu() {
        return dedu;
    }



    public void menuM (){

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
                                System.out.println( "Salary : "+ getSalary() );
                                System.out.println( "Bonus : "+ bonus );
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
                                System.out.println("Current Bonus :" + bonus);
                                System.out.println("\n");
                                System.out.println("Enter the New Bonus :");
                                Scanner sc3=new Scanner(System.in);
                                Double bo=sc3.nextDouble();
                                setBonus(bo);
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
        
                            System.out.println("Thank you for using our services");
        
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
