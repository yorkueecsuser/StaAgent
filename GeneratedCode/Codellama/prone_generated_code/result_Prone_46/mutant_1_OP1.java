import java.util.Objects;

class EqualsNull {
    public static void main(String[] args) {
        Object obj = new Object();
        String rndStr = "abcdefg"; // Dead Store operator added this line
        if (obj.equals(null)) {
            System.out.println("obj is null");
        }
    }
}