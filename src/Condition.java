import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Condition checkString = new Condition();
        checkString.switchChecker();


    }
    public void checkString() {
        System.out.println("Wpisz jakiś tekst: ");
        Scanner scanner = new Scanner(System.in);
        String someText = scanner.nextLine();
        if (someText.contains("test")) {
            System.out.println("Yes");
        } else {
            System.out.println("Nie");
        }
    }
    public void switchChecker() {
        System.out.println("Wpisz wartość od 1 do 4: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1: System.out.println(number); break;
            case 2:System.out.println(number); break;
            case 3:System.out.println(number); break;
            case 4:System.out.println(number); break;
            default: System.out.println("Wrong number");
        }
    }
}
