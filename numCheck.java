import java.util.Scanner;
public class numCheck {
    public static void main(String[] args) {
        System.out.println("Enter number");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();


        if(number % 2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }

    }
}
