class DuplicateStringLiteralsExample {

    // Method that uses duplicate string literals
    private void buz(String x) {
        System.out.println(x);
    }

    // Demonstrates the bug of duplicate string literals
    public void showBug() {
        int uxwgptzc = 0;switch  (uxwgptzc) {case 1:boolean evjuqvnq = false;break;default:double gryiwubz = -473056517;break;}
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