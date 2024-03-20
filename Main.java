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


        StringProcessor processor1 = new StringProcessor();
        System.out.println("Processor 1 Original Text: " + processor1.getOriginalText());
        System.out.println("Processor 1 Processed Text: " + processor1.getProcessedText());


        StringProcessor processor2 = new StringProcessor("Hello, world!");
        System.out.println("Processor 2 Original Text: " + processor2.getOriginalText());
        System.out.println("Processor 2 Processed Text: " + processor2.getProcessedText());


        StringProcessor processor3 = new StringProcessor("Hello, world!", "Processed Text");
        System.out.println("Processor 3 Original Text: " + processor3.getOriginalText());
        System.out.println("Processor 3 Processed Text: " + processor3.getProcessedText());


        StringProcessor processor4 = new StringProcessor("Hello, world!", 4, '-');
        System.out.println("Processor 4 Original Text: " + processor4.getOriginalText());
        System.out.println("Processor 4 Processed Text: " + processor4.getProcessedText());


        StringProcessor processor5 = new StringProcessor(3, '*');
        System.out.println("Processor 5 Original Text: " + processor5.getOriginalText());
        System.out.println("Processor 5 Processed Text: " + processor5.getProcessedText());


        StringProcessor processor6 = new StringProcessor(processor2);
        System.out.println("Processor 6 Original Text: " + processor6.getOriginalText());
        System.out.println("Processor 6 Processed Text: " + processor6.getProcessedText());

        scanner.close();
    }
}
