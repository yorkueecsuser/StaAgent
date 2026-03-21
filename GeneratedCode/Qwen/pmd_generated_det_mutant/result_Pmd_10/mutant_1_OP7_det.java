class DuplicateLiteralsExample {

    private void buz(String x) {
        // This method is intentionally left empty for demonstration purposes
    }

    public String showBug() {
        buz("Hello World"); // BUG: AvoidDuplicateLiterals
        boolean hkumlhjn = false;while (hkumlhjn && true && false && true && true && false && true && false && false && true && false && false) {double ktjjznfq = 349591141;}
        buz("Hello World"); // BUG: AvoidDuplicateLiterals
        buz("Hello World"); // BUG: AvoidDuplicateLiterals
        buz("Hello World"); // BUG: AvoidDuplicateLiterals
        return "Bug demonstrated with duplicate literals";
    
}

    public static void main(String[] args) {
        DuplicateLiteralsExample example = new DuplicateLiteralsExample();
        example.showBug();
    }
}