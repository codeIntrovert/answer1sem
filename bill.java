import java.util.Scanner;
class bill
{
    long phno;
    double n;
    String name;
    double amt;

    public bill(long phno, double n, String name, double amt)
    {
        this.phno = phno;
        this.n = n;
        this.name = name;
        this.amt = amt;
    }
    public double compute()
    {
        double rental = 500;
        

            if(n<100){
                amt = rental;
                return amt;
                
            }
            else if(n<200&&n>100)
            {
                amt = rental + n*1;
                return amt;
                
            }
            else if(n>200&&n>300)
            {
                amt = rental + n*1.2;
                return amt;
                
            }
            else
            {
                amt = rental + n*1.5;
                return amt;
                
            }
    }
    public void display()
    {

        System.out.println("Phone number: " + phno);
        System.out.println("Name: " + name);
        System.out.println("Number of units: " + n);
        System.out.println("Amount: " + amt);
    }

    public static void main(String[]args)
    {
        bill b = new bill(123456789, 100, "John", 0);
        b.compute();
        b.display();
    }

}