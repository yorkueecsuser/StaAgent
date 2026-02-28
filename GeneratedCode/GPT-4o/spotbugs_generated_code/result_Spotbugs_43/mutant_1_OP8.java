class SwitchFallthroughExample {

    public int a(int b) { // Renamed method and parameter
        int c = 0; // Renamed variable

        switch (b) { // Using renamed parameter
            case 1:
                c = 100; // Using renamed variable
                // Missing break statement causes fall through
            case 2:
                c = 200; // Using renamed variable
                throw new IllegalArgumentException("Value cannot be 2");
            case 3:
                c = 300; // Using renamed variable
                break;
            default:
                c = -1; // Using renamed variable
        }

        return c; // Using renamed variable
    }

    public static void main(String[] args) {
        SwitchFallthroughExample example = new SwitchFallthroughExample();
        try {
            int result = example.a(1); // Using renamed method
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}