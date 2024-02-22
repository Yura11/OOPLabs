import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть рядок тексту:");
        String inputText = scanner.nextLine();

        System.out.println("Введіть ціле число k:");
        int k = scanner.nextInt();
        System.out.println("Введіть символ для заміни:");
        char replacementChar = scanner.next().charAt(0);

        StringProcessor processor = new StringProcessor(inputText);

        System.out.println("Результат обробки тексту:");
        System.out.println(processor.getProcessedText(k, replacementChar));

        scanner.close();
    }
}





