class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(str);

// Unreachable switch statement mutation
        int value = getValue();
        switch (value) {
        case 1:
            System.out.println("Reachable branch");
            break;
        case 2:
            System.out.println("Unreachable branch");
            break;
        default:
            System.out.println("Default branch");
            break;
        }
    }

    public static int getValue() {
        return 1;
    }
}