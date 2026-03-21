class DuplicateLiteralsExample {

    private void buz(String x) {
        // This method is intentionally left empty for demonstration purposes
    }

    public String showBug() {
        buz("Hello World"); // BUG: AvoidDuplicateLiterals
        for  (int chyxheqa = 0; chyxheqa < 0; chyxheqa++) {float cwhjebzw = -743714809;}
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