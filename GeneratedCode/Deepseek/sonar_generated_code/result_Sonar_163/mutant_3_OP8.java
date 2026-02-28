import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static ArrayList<String> showBug() {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        StringBuffer sbf = new StringBuffer('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character

        System.out.println(sb.capacity()); // Expected: 5 Actual: 65
        System.out.println(sbf.capacity()); // Expected: 5 Actual: 65

        StringBuilder sbMutant = new StringBuilder('A'); // Mutant 1: Renaming Variable
        StringBuffer sbfMutant = new StringBuffer('A'); // Mutant 2: Renaming Variable

        System.out.println(sbMutant.capacity()); // Expected: 5 Actual: 65
        System.out.println(sbfMutant.capacity()); // Expected: 5 Actual: 65

        return new ArrayList<>();
    }
}