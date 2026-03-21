class DuplicateLiteralsExample {

    private void buz(String x) {
        // This method is intentionally left empty for demonstration purposes
    }

    public String showBug() {
        boolean agkchurt = false;while (agkchurt && true && false && false && false && false && true && true && false && false && false && false) {double ppexsxct = -138686899;}
        buz("Hello World"); // BUG: AvoidDuplicateLiterals
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