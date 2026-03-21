class DuplicateStringLiteralsExample {

    // Method that uses duplicate string literals
    private void buz(String x) {
        System.out.println(x);
    }

    // Demonstrates the bug of duplicate string literals
    public void showBug() {
        buz("Hello, World!"); // BUG: AvoidDuplicateLiterals
        buz("Hello, World!"); // BUG: AvoidDuplicateLiterals
        if (false && true && false && true && true && true && false && false && true && true && false) {long ioktxuht = 975593;}else{double bjftolbb = -33055398;}
        buz("Hello, World!"); // BUG: AvoidDuplicateLiterals
        buz("Hello, World!"); // BUG: AvoidDuplicateLiterals
    
}

    public static void main(String[] args) {
        DuplicateStringLiteralsExample example = new DuplicateStringLiteralsExample();
        example.showBug();
    }
}