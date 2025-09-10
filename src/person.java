import java.util.Scanner;

public class person {

    private String firstName ;
    private String laststName ;
    private double id ;
    private double age ;
    private double phone_num ;
    private String email ;



    person (String name, String last , double id ){
        this.firstName = name;
        this.laststName = last ;
        this.id = id;
    }


    public void setFirstName ( String name ){
        this.firstName = name;
    }

    public void setLaststName(String laststName) {
        this.laststName = laststName;
    }

    public void setId ( double id ){
        this.id = id ;
    }
        
    public void setAge(double age) {
        this.age = age;
    }

    public void setphone_num ( double phone_num ){
        this.phone_num = phone_num ;
    }

    public void setEmail(String adress) {
        this.email = adress;
    }





    public String getFirstName() {
        return firstName;
    }

    public String getLaststName() {
        return laststName;
    }

    public double getId() {
        return id;
    }

    public double getAge() {
        return age;
    }

    public double getPhone_num() {
        return phone_num;
    }

    public String getEmail() {
        return email;
    }


    public void menu (){

        char option;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome "+firstName + " " + laststName );
        System.out.println("Your ID:"+id);
        System.out.println("\n");

        System.out.println("********************************************");
        System.out.println("Choose an option:");
        System.out.println("a) Show info");
        System.out.println("b) Edit First Name ");
        System.out.println("c) Edit Last Name ");
        System.out.println("d) Set or Edit Age ");
        System.out.println("f) Set or Edit phone number ");
        System.out.println("g) Edit ID number ");
        System.out.println("h) Set or Edit Email ");
        System.out.println("e) Exit");

        do{
            System.out.println("********************************************");
            System.out.println("Press O to show the options menu");
            option=sc.next().charAt(0);
            System.out.println("\n");

            switch (option){

                case 'o':
                    System.out.println("********************************************");
                    System.out.println("Choose an option:");
                    System.out.println("a) Show info");
                    System.out.println("b) Edit First Name ");
                    System.out.println("c) Edit Last Name ");
                    System.out.println("d) Set or Edit Age ");
                    System.out.println("f) Set or Edit phone number ");
                    System.out.println("g) Edit ID number ");
                    System.out.println("h) Set or Edit Email ");
                    System.out.println("e) Exit");
                    System.out.println("\n");
                    break;

                case 'a':
                    System.out.println( "Name: "+ firstName + laststName );
                    System.out.println( "Id: "+ id);
                    System.out.println( "Age: "+ age);
                    System.out.println( "Adress "+ email);
                    System.out.println( "phone number: " + phone_num);
                    System.out.println( "******************************************** ");
                    System.out.println("\n");             
                    break;

                case 'b':
                    System.out.println("......................");
                    System.out.println("Current Name :" + firstName);
                    System.out.println("\n");
                    System.out.println("Enter the New Name :");
                    Scanner sc1=new Scanner(System.in);
                    String amt=sc1.nextLine();
                    setFirstName(amt);
                    System.out.println("......................");
                    System.out.println("\n");
                    break;

                case 'c':
                    System.out.println("......................");
                    System.out.println("\n");
                    System.out.println("Current Name :" + laststName);
                    System.out.println("\n");
                    Scanner sc2=new Scanner(System.in);
                    String l=sc2.nextLine();
                    setLaststName(l);
                    System.out.println("......................");
                    System.out.println("\n");
                    break;

                case 'd':
                    System.out.println("......................");
                    System.out.println("\n");
                    System.out.println("Enter your Age :");
                    Scanner sc3=new Scanner(System.in);
                    double ag=sc3.nextDouble();
                    setAge(ag);
                    System.out.println("......................");
                    System.out.println("\n");
                    break;

                case 'f':
                    System.out.println("......................");
                    System.out.println("\n");
                    System.out.println("Enter your Phone number :");
                    Scanner sc4=new Scanner(System.in);
                    double num=sc4.nextDouble();
                    setphone_num(num);
                    System.out.println("......................");
                    System.out.println("\n");
                    break;

                case 'g':
                    System.out.println("......................");
                    System.out.println("\n");
                    System.out.println("Current ID :" + id);
                    System.out.println("\n");
                    Scanner sc5=new Scanner(System.in);
                    double idn=sc5.nextDouble();
                    setId(idn);
                    System.out.println("......................");
                    System.out.println("\n");
                    break;

                case 'h':
                    System.out.println("......................");
                    System.out.println("\n");
                    System.out.println("Enter your Email :");
                    Scanner sc6=new Scanner(System.in);
                    String em=sc6.nextLine();
                    setEmail(em);
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

        }while(option!='e');

        System.out.println("Thank you for using our services");

    }
   


    
}
