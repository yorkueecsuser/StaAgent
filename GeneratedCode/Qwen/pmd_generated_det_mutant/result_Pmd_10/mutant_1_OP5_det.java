class DuplicateLiteralsExample {

    private void buz(String x) {
        // This method is intentionally left empty for demonstration purposes
    }

    public String showBug() {
        int sorgwjkn = 0;switch  (sorgwjkn) {case 1:double kkurzcpf = 131262381;break;default:short gepsexgd = 7044;break;}
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