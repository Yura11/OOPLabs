import java.util.Scanner;

public class StringProcessor {
    private String originalText;
    private String processedText;


    public StringProcessor() {
        this.originalText = "";
        this.processedText = "";
    }


    public StringProcessor(String originalText) {
        this.originalText = originalText;
        this.processedText = "";
    }


    public StringProcessor(String originalText, String processedText) {
        this.originalText = originalText;
        this.processedText = processedText;
    }


    public StringProcessor(String originalText, int k, char replacementChar) {
        this.originalText = originalText;
        this.processedText = "";

        this.getProcessedText(k, replacementChar);
    }


    public StringProcessor(int k, char replacementChar) {
        this.originalText = "";
        this.processedText = "";

        this.getProcessedText(k, replacementChar);
    }


    public StringProcessor(StringProcessor other) {
        this.originalText = other.originalText;
        this.processedText = other.processedText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public String getOriginalText() {
        return originalText;
    }

    public String getProcessedText(int k, char replacementChar) {
        StringBuilder result = new StringBuilder();
        String[] words = originalText.split("\\s+");

        for (String word : words) {
            if (word.length() >= k) {

                result.append(word.substring(0, k - 1)).append(replacementChar).append(word.substring(k));
            } else {
                result.append(word);
            }
            result.append(" ");
        }


        return result.toString().trim();
    }


    public String getProcessedText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціле число k для фільтрування:");
        int k = scanner.nextInt();
        System.out.println("Введіть символ для заміни:");
        char replacementChar = scanner.next().charAt(0);
        return getProcessedText(k, replacementChar);
    }
}
