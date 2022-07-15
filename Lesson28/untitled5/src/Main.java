public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        //1

        int age = 17;


        if (age < 0) {
            System.out.println("Wrong age");
        }

        if (age < 18) {
            System.out.println("You are still underage");
        } else {
            System.out.println("You are adult");
        }


        //2



        int years = 3;
        int salary = 4000;

        if (years == 0) {
            System.out.println("No bonus, your wage - " + salary);
        } else {
        if (years < 3) {
            salary = salary + salary*10/100;
            if (salary > 4000) {
                salary = salary + 500;
            } else {
                salary = salary + 1000;
            }
            System.out.println("Your wage - " + salary);
        } else {
            salary = salary + salary*20/100;
            if (salary > 4000) {
                salary = salary + 500;
            } else {
                salary = salary + 1000;
            }
                    System.out.println("Your wage - " + salary);
        }}


        //3


        int result = 0;
        for (int i = 0; i<51; i++)
        {
            result = result + i;
        }
        System.out.println("Sum of numbers = " + result);




    }
}