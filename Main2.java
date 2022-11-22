import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Insert list's length: ");
        int len = iScanner.nextInt();
        scanWords(len);
        iScanner.close();
    }

    // С консоли вводятся несколько слов
    // Нужно их прочитать и вывести только уникальные и их количество
    public static void scanWords(int len) {
        Scanner iScanner = new Scanner(System.in);
        Map<String, Integer> words = new HashMap<>();
        for (int i = 0; i < len; i++) {
            System.out.println("Insert word: ");
            String word = iScanner.next();
            if (words.containsKey(word)) {
                int count = words.get(word);
                words.put(word, count+1);
            }
            else {
                words.put(word, 1);
            }
            
        }

        iScanner.close();
        System.out.println(words.toString());

    }

}
