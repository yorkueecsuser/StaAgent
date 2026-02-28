import java.util.ArrayList;

class Main {
    // Bug Rule: "StringBuilder" and "StringBuffer" should not be instantiated with a character
    public static void main(String[] args) {
        showBug();
    }

    public static ArrayList<String> showBug() {
        StringBuilder sb = new StringBuilder('A');
        StringBuffer sbf = new StringBuffer('A');

        System.out.println(sb.capacity());
        System.out.println(sbf.capacity());

        // Unreachable for loop begins
        for(int i = 0; false; i++);
        // Unreachable for loop ends

        return new ArrayList<>();
    }
}