public class StringProcessor {
    private String originalText;
    private String processedText;

    public StringProcessor(String originalText) {
        this.originalText = originalText;
        this.processedText = "";
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public String getOriginalText() {
        return originalText;
    }

    public String getProcessedText(int k, char replacementChar) {
        StringBuilder result = new StringBuilder();
        String[] words = originalText.split("\\s+"); // Розділяємо текст на слова

        for (String word : words) {
            if (word.length() >= k) {
                // Замінюємо k-у літеру в слові
                result.append(word.substring(0, k - 1)).append(replacementChar).append(word.substring(k));
            } else {
                result.append(word); // Якщо k більше довжини слова, то залишаємо без змін
            }
            result.append(" "); // Додаємо пробіл між словами
        }

        // Повертаємо оброблений текст без останнього пробілу
        return result.toString().trim();
    }
}
