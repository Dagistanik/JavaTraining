public class Reverss {
    public static void main(String[] args) {
        String word = "zalupa";
        String reverse = new String("");
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
    }
}
