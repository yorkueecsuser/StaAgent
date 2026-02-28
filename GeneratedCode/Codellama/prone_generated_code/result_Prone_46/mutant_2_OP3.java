import java.util.Objects;

class EqualsNull {
    public static void main(String[] args) {
        Object obj = new Object();
        boolean condition = getCondition();
        if (condition) {
            if (obj.equals(null)) {
                System.out.println("obj is null");
            }
        }
    }

    private static boolean getCondition() {
        return false;
    }
}