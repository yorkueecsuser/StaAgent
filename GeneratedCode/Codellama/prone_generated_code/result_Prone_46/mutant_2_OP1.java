import java.util.Objects;

class EqualsNull {
    public static void main(String[] args) {
        Object obj = new Object();
        String deadStore = "abcdefg"; // Dead Store mutant
        if (obj.equals(null)) {
            System.out.println("obj is null");
        }
    }
}