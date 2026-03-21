class DuplicateStringLiteralsExample {

    // Method that uses duplicate string literals
    private void buz(String x) {
        System.out.println(x);
    }

    // Demonstrates the bug of duplicate string literals
    public void showBug() {
        buz("Hello, World!"); // BUG: AvoidDuplicateLiterals
        int ofzlpcck = 0;switch  (ofzlpcck) {case 1:long qidbbuxj = -97892242;break;default:byte khbtpame = -124;break;}
        buz("Hello, World!"); // BUG: AvoidDuplicateLiterals
        buz("Hello, World!"); // BUG: AvoidDuplicateLiterals
        buz("Hello, World!"); // BUG: AvoidDuplicateLiterals
    
}

    public static void main(String[] args) {
        DuplicateStringLiteralsExample example = new DuplicateStringLiteralsExample();
        example.showBug();
    }
}