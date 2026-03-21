class DuplicateStringLiteralsExample {

    // Method that uses duplicate string literals
    private void buz(String x) {
        System.out.println(x);
    }

    // Demonstrates the bug of duplicate string literals
    public void showBug() {
        if (true && false && false && true && false && true && true && true && false && false && false) {short yaituvvu = -5148;}
        buz("Hello, World!"); // BUG: AvoidDuplicateLiterals
        buz("Hello, World!"); // BUG: AvoidDuplicateLiterals
        buz("Hello, World!"); // BUG: AvoidDuplicateLiterals
        buz("Hello, World!"); // BUG: AvoidDuplicateLiterals
    
}

    public static void main(String[] args) {
        DuplicateStringLiteralsExample example = new DuplicateStringLiteralsExample();
        example.showBug();
    }
}