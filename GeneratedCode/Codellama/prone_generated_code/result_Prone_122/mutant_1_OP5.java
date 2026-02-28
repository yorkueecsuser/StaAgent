import java.util.Objects;

class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int x = flag? foo : null;
        System.out.println(x);

        // Unreachable switch statement mutant
        int value = getValue();
        switch (value) {
            case 1:
                // code
                break;
            default:
                // default code
                break;
        }
    }

    // Helper method to generate unreachable switch statement
    private static int getValue() {
        return 0;
    }
}