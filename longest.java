
import java.util.Scanner;

public class longest {
    public static void main(String[] args) {

        System.out.println("Please enter the number of strings:");

        Scanner input = new Scanner(System.in);
        int unitSize = input.nextInt();


        System.out.println("Please enter " + unitSize + " Strings:");

        Scanner s = new Scanner(System.in);
        String[] array = new String[unitSize];


        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextLine();
        }

        longest(array);


    }

    public static void longest(String array[])
    {
        String longestString = array[0];
        for(int x=1; x<array.length; x++)
        {
            if(array[x].length()> longestString.length())
            {
                longestString = array[x];
            }
        }
        for(int y=0; y<array.length; y++)
        {
            if(array[y].length()== longestString.length())
            {
                System.out.println("Longest string is: " + array[y]);
            }
        }
    }


}
