import java.util.Scanner;

public class Palimdrom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir string girin: ");
        String girilenString = scanner.nextLine();

        if (isPalindrom(girilenString)) {
            System.out.println("Girilen ifade bir palindromdur.");
        } else {
            System.out.println("Girilen ifade bir palindrom değildir.");
        }


    }

    public static boolean isPalindrom(String str) {
        str = str.toLowerCase();

        str = str.replaceAll("[^a-zA-Z0-9]", "");

        int uzunluk = str.length();
        for (int i = 0; i < uzunluk / 2; i++) {
            if (str.charAt(i) != str.charAt(uzunluk - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
