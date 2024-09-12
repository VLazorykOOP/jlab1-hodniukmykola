import java.util.Scanner;

public class RemoveFirstLetterOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        
        String[] words = text.split("\\s+");  // розділення тексту за пробілами

        // Обробка кожного слова
        for (int i = 0; i < words.length; i++) {
            words[i] = removeDuplicateFirstLetter(words[i]);
        }

        // Збирання слів назад у текст
        String result = String.join(" ", words);

        System.out.println("Результат:");
        System.out.println(result);

        scanner.close();
    }

    
    public static String removeDuplicateFirstLetter(String word) {//видалення повторонь перших літер
        if (word.isEmpty()) {
            return word;
        }

        
        char firstLetter = Character.toLowerCase(word.charAt(0));

        
        StringBuilder result = new StringBuilder();
        result.append(word.charAt(0));  

        
        for (int i = 1; i < word.length(); i++) {
            char currentLetter = word.charAt(i);
            if (Character.toLowerCase(currentLetter) != firstLetter) {
                result.append(currentLetter);
            }
        }

        return result.toString();
    }
}
