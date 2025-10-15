import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double num;

        System.out.println("Tell me one number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextDouble();

        if (num < 0) {
            System.out.println("This number is a negative number!");
        } else
            System.out.println("This number is a positive number!");

        System.out.println("Do you wanna try one more time? Y/N");
        scanner.nextLine();
        String answer = scanner.nextLine();

        while(answer == "Y"){
            System.out.println("Tell me one more number: ");
            num = scanner.nextDouble();
            scanner.nextLine();
        }

    }

}