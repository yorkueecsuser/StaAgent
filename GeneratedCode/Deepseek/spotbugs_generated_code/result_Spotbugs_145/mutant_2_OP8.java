import java.util.Random;

class TypeQualifierBug {
    public static void showBug(Object obj) {
        String a = (String) obj; // Renamed obj to a
        int length = a.length();
        System.out.println("Length of the string: " + length);
    }

    public static void main(String[] args) {
        Random random = new Random();
        Object obj = random.nextInt(2) == 0? "Test String" : 123; // For demonstrating the bug
        showBug(obj);
    }
}