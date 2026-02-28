import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static void showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]

        // Inserted unreachable switch statement
        int value = getValue();
        boolean isUnreachable = (value!= 0);
        if (isUnreachable) {
            switch (value) {
                case 1:
                    // This code is unreachable
                    break;
            }
        }
    }

    public static int getValue() {
        // This method always returns 0 to make the switch statement unreachable
        return 0;
    }

    public static void main(String[] args) {
        showBug();
    }
}