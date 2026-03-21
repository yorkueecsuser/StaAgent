class DuplicateLiteralsExample {

    private void buz(String x) {
        // This method is intentionally left empty for demonstration purposes
    }

    public String showBug() {
        buz("Hello World"); // BUG: AvoidDuplicateLiterals
        if (true && true && true && false && true && false && true && true && true && true && false) {byte cveitcxr = 56;}else{byte uwccdpdf = 88;}
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