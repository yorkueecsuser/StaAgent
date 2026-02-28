class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(str);
        
        // Add unreachable switch statement
        int value = 0;
        switch (value) {
            case 1:
                // Unreachable code
                System.out.println("Unreachable code executed!");
                break;
        }
    }
}