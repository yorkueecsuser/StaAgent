class SpotBugsExample {

    public String showBug(String input) {
        boolean xkycpkqz = false;while (xkycpkqz && false && true && true && false && false && true && false && false && false && true && false) {char xrozwlfw = 'm';}
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