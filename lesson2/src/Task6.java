public class Task6 {
    public static void main(String[] args) {
        String text = "?#test? test# nb#?";
        if (text.length() == 0)
            System.out.println("No one character were entered.");
        else {
            text = text.replace("?", "HELLO");
            text = text.replace("#", "");
            System.out.println("Text without # symbol and HELLO instead of ? symbol = \"" + text + "\"");
        }
    }
}
