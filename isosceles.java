public class isosceles {

    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner input = new Scanner(System.in);
        int  num = input.nextInt();
        isosceles(num);
    }

    public static void isosceles(int height) {
        for (int i = 1; i <= height; i++) {

            for (int j = i; j<height; j++)
                System.out.print(" ");

            for (int k = 1; k <(i*2); k++)
                System.out.print("#");
            System.out.print("\n");
        }
    }
}
