import java.util.Objects;

class EqualsNull {
    public static void main(String[] args) {
        Object obj = new Object();
        int value = getValue();
        switch (value) {
            case 1:
                // unreachable code
                if (obj.equals(null)) {
                    System.out.println("obj is null");
                }
                break;
            default:
                System.out.println("obj is not null");
                break;
        }
    }

    private static int getValue() {
        return 0;
    }
}