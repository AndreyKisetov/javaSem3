import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Insert list's length: ");
        int len = iScanner.nextInt();
        scanWords(len);
        iScanner.close();
    }

    // С консоли вводятся 10 слов
    // Нужно их прочитать и вывести только уникальные
    public static void scanWords(int len) {
        Scanner iScanner = new Scanner(System.in);
        Set<String> words = new HashSet<>();
        for (int i = 0; i < len; i++) {
            System.out.println("Insert word: ");
            words.add(iScanner.next());
        }
        iScanner.close();
        System.out.println(words.toString());

    }
}
