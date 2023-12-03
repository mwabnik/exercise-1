import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Condition checkString = new Condition();
        checkString.checkString();
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
}
