import java.util.Random;
import java.util.Scanner;

public class Lab10 
{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) 
    {
        Q1();
        Q2();
        Q3();
        Q4();
        scan.close();
    }

    public static void Q1() 
    {
        String input = ("");
        while (!input.equals("q")) 
        {
            System.out.println("Pick a shape: square, rectangle, circle (or 'q' to quit)");
            input = scan.nextLine();
            
            if (input.equals("square")) 
            {
                double a;
                System.out.println("Enter the length of side a: ");
                a = Double.parseDouble(scan.nextLine());
                System.out.println("The circumference of the square is: " + a * 4);
                System.out.println("The area of the square is: " + a * a);

            } else if (input.equals("rectangle")) 
            {
                double a, b;
                System.out.println("Enter the length of side a: ");
                a = Double.parseDouble(scan.nextLine());
                System.out.println("Enter the length of side b: ");
                b = Double.parseDouble(scan.nextLine());
                System.out.println("The circumference of the rectangle is: " + (2 * a + 2 * b));
                System.out.println("The area of the rectangle is: " + (a * b));
            } else if (input.equals("circle")) 
            {
                double r;
                System.out.println("Enter the radius: ");
                r = Double.parseDouble(scan.nextLine());
                System.out.println("The circumference of the circle is: " + (Math.PI * r * 2));
                System.out.println("The area of the circle is: " + (Math.PI * r * r));
            }
        }
    }

    public static void Q2() 
    {
        System.out.println("Q2: Enter the current day (1-31): ");
        int num = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the current month: (1-12)");
        int num2 = Integer.parseInt(scan.nextLine());

        switch(num)
        {
            case 1:
            System.out.print("You selected 1st of "); break;
            case 2:
            System.out.print("You selected 2nd of "); break;
            case 3:
            System.out.print("You selected 3rd of "); break;
            case 4:
            System.out.print("You selected 4th of "); break;
            case 5:
            System.out.print("You selected 5th of "); break;
            case 6:
            System.out.print("You selected 6th of "); break;
            case 7:
            System.out.print("You selected 7th of "); break;
            case 8:
            System.out.print("You selected 8th of "); break;
            case 9:
            System.out.print("You selected 9th of "); break;
            case 10:
            System.out.print("You selected 10th of "); break;
            case 11:
            System.out.print("You selected 11th of "); break;
            case 12:
            System.out.print("You selected 12th of "); break;
            case 13:
            System.out.print("You selected 13th of "); break;
            case 14:
            System.out.print("You selected 14th of "); break;
            case 15:
            System.out.print("You selected 15th of "); break;
            case 16:
            System.out.print("You selected 16th of "); break;
            case 17:
            System.out.print("You selected 17th of "); break;
            case 18:
            System.out.print("You selected 18th of "); break;
            case 19:
            System.out.print("You selected 19th of "); break;
            case 20:
            System.out.print("You selected 20th of "); break;
            case 21:
            System.out.print("You selected 21st of "); break;
            case 22:
            System.out.print("You selected 22nd of "); break;
            case 23:
            System.out.print("You selected 23rd of "); break;
            case 24:
            System.out.print("You selected 24th of "); break;
            case 25:
            System.out.print("You selected 25th of "); break;
            case 26:
            System.out.print("You selected 26th of "); break;
            case 27:
            System.out.print("You selected 27th of "); break;
            case 28:
            System.out.print("You selected 28th of "); break;
            case 29:
            System.out.print("You selected 29th of "); break;
            case 30:
            System.out.print("You selected 30th of "); break;
            case 31:
            System.out.print("You selected 31st of "); break;

        }

        switch(num2)
        {
            case 1:
            System.out.println("January"); break;
            case 2:
            System.out.println("February"); break;
            case 3:
            System.out.println("March"); break;
            case 4:
            System.out.println("April"); break;
            case 5:
            System.out.println("May"); break;
            case 6:
            System.out.println("June"); break;
            case 7:
            System.out.println("July"); break;
            case 8:
            System.out.println("August"); break;
            case 9:
            System.out.println("September"); break;
            case 10:
            System.out.println("October"); break;
            case 11:
            System.out.println("November"); break;
            case 12:
            System.out.println("December"); break;
        }
    }

public static void Q3() 
{
    System.out.println("Q3: Enter how many numbers you want to check for primality: ");
    int n = scan.nextInt();
    int counter = 0;
    for (int i = 0; i < n; i++) {
    if (i < 2)
    continue;
    boolean check = true;

    for (int j = 2; j * j <= i; j++) 
    {
        if (i % j == 0) {
        check = false;
        break;
    }
    }
        if (check == true) 
        {
            counter++;
        }
    }

        System.out.println("There are: " + counter + " primes between 0 and " + n);
    }

    public static void Q4() 
    {
        Random rng = new Random();

        String next;
        System.out.println("Q4: Let's play a game. Type \"A\" to attack, \"B\" to buff your next attack. Kill the enemy to win!");
        System.out.println("Q4: You must roll higher than the enemy armor class (12) to hit. Roll 20 for a critical hit!");
        System.out.println("Q4: Your damage is 2-16 (2d8)");

        int enemyHP = 100;
        int a = 0;

        boolean check = false;
        while (true) 
        {

            boolean doAttack = false;
            boolean check2 = false;
            while (!check2) 
            {
                next = scan.nextLine();
                check2 = true;
                switch (next) 
                {
                    case "A", "a":
                        doAttack = true;
                        break;
                    case "B", "b":
                        check = true;
                        System.out.println("Buffing! +5 to your next attack roll and damage");
                        break;
                    default:
                        System.out.println("Invalid input");
                        check2 = false;
                }
            }

            if (doAttack) {
                a++;
                int attackRoll = rng.nextInt(20) + 1;
                int damage = 0;
                System.out.print("You rolled: " + attackRoll);
                if(check) 
                {
                    attackRoll += 5;
                    System.out.print(" + 5 (buff active)\n");
                } 
                else 
                {
                    System.out.println();
                }
                if (attackRoll >= 12) 
                {
                    damage = rng.nextInt(8) + 1;
                    damage += rng.nextInt(8) + 1;
                    if(check) 
                    {
                        damage += 5;
                    }
                    if (attackRoll == 20 || (check && attackRoll == 20 + 5)) 
                    {
                        damage *= 2;
                        System.out.print("Critical hit! ");
                    }
                    System.out.print("You dealt " + damage + " damage");
                    if(check) 
                    {
                        System.out.print(" (buffed attack)");
                    }
                    enemyHP -= damage;
                    System.out.println("\nEnemy HP: " + Math.max(0, enemyHP));

                } 
                else 
                {
                    System.out.println("Miss");
                }

                check = false;
                if (enemyHP <= 0) 
                {
                    System.out.println("Enemy died in " + a + " turns");
                    scan.close();
                    return;
                }
            }

        }
    }
}
