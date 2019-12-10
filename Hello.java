import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Enter name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        hello(name);

    }

    public static void hello(String name)
    {
        System.out.println("Hello " + name + "!");
    }


