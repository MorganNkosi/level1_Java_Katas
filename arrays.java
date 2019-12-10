import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        System.out.println("Enter Array size : ");

        Scanner input = new Scanner(System.in);
        int unitSize = input.nextInt();

        System.out.println("Enter "+unitSize+ " Strings for your 1st Array");

        Scanner scanner1 = new Scanner(System.in);
        String[] firstArray = new String[unitSize];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = scanner1.nextLine();
        }

        System.out.println("Enter " + unitSize + " Strings for your 2nd Array");

        
        String[] secondArray = new String[unitSize];

        for (int i = 0; i < secondArray.length; i++)
        {
            secondArray[i] = scanner1.nextLine();
        }
        combine(firstArray,secondArray);
    }

    public static void combine(String firstArray[], String secondArray[])
    {
        for (int i = 0; i < firstArray.length; i++)
        {
            System.out.print(firstArray[i] + " " + secondArray[i] + " ");
        }
    }
}

