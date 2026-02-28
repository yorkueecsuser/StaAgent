import java.util.ArrayList;

class Main {
    // Bug Rule: "StringBuilder" and "StringBuffer" should not be instantiated with a character
    // Description: When a developer uses the StringBuilder or StringBuffer constructor with a single character as an argument, the likely
    // intent is to create an instance with the character as the initial string value.
    // However, this is not what happens because of the absence of a dedicated StringBuilder(char) or StringBuffer(char) constructor. Instead, StringBuilder(int) or StringBuffer(int) is invoked, which results in an instance with the provided int value as the initial capacity of the StringBuilder or StringBuffer.
    // The reason behind this behavior lies in the automatic widening of char expressions to int when required. Consequently,
    // the UTF-16 code point value of the character (for example, 65 for the character 'A' ) is interpreted as an int to specify the initial capacity.

    public static void main(String[] args) {
        showBug();
    }

    public static ArrayList<String> showBug() {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        StringBuffer sbf = new StringBuffer('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character

        if (false) {
            System.out.println(sb.capacity()); // Expected: 5 Actual: 65
            System.out.println(sbf.capacity()); // Expected: 5 Actual: 65
        }

        return new ArrayList<>();
    }
}