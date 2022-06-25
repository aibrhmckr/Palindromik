import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Palindrom olup olmadığını merak ettiğiniz kelimeyi giriniz: ");
        String str = scanner.next();
        if(isPalindrome(str)){
            System.out.println("Girilen kelime palindrom");

        }
        else {
            System.out.println("Girilen kelime palindrom değil");

        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;

    }
}