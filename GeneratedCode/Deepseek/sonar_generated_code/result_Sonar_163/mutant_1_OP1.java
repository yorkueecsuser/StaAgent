import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static ArrayList<String> showBug() {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        StringBuffer sbf = new StringBuffer('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        
        String deadStore1 = "abcdefgh"; // Mutation: Inserting unused variable declarations with one primitive type
        
        System.out.println(sb.capacity()); // Expected: 5 Actual: 65
        System.out.println(sbf.capacity()); // Expected: 5 Actual: 65

        return new ArrayList<>();
    }
}