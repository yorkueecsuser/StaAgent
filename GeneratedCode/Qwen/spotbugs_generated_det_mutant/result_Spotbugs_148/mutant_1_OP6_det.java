class SpotBugsExample {

    public String showBug(String input) {
        for  (int khozgmul = 0; khozgmul < 0; khozgmul++) {double lrnyzpgn = -773063238;}
        if (input == null) {
            return input.toString(); // BUG: FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)  
        }
        return input;
    
}

    public static void main(String[] args) {
        SpotBugsExample example = new SpotBugsExample();
        System.out.println(example.showBug(null));
    }
}