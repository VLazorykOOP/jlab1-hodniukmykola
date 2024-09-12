import java.util.Scanner;

public class RemoveFirstLetterOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення тексту
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        // Розділяємо текст на слова з урахуванням розділових знаків
        String[] words = text.split("\\s+");  // Розділення тексту за пробілами

        // Обробка кожного слова
        for (int i = 0; i < words.length; i++) {
            words[i] = removeDuplicateFirstLetter(words[i]);
        }

        // Збирання слів назад у текст
        String result = String.join(" ", words);

        // Виведення результату
        System.out.println("Результат:");
        System.out.println(result);

        scanner.close();
    }

    // Метод для видалення всіх повторних входжень першої літери в слові
    public static String removeDuplicateFirstLetter(String word) {
        if (word.isEmpty()) {
            return word;
        }

        // Визначаємо першу літеру (в нижньому регістрі для нечутливості до регістру)
        char firstLetter = Character.toLowerCase(word.charAt(0));

        // Створюємо новий рядок, де зберігаємо першу літеру і видаляємо всі її наступні входження
        StringBuilder result = new StringBuilder();
        result.append(word.charAt(0));  // Додаємо першу літеру

        // Проходимо по решті літер і додаємо лише ті, які не є першою літерою
        for (int i = 1; i < word.length(); i++) {
            char currentLetter = word.charAt(i);
            if (Character.toLowerCase(currentLetter) != firstLetter) {
                result.append(currentLetter);
            }
        }

        return result.toString();
    }
}
