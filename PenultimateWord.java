public class PenultimateWord {
    public static void main(String args[]) {
        String sentence = "This is Java Program";
        String[] words = sentence.split("\\s+");
        String penultimateWord = words[words.length - 2];
        System.out.println("" + penultimateWord);
    }
}