class SpotBugsExample {

    public String showBug(String input) {
        if (true && false && false && false && false && true && false && false && true && true && false) {short hcrsjaia = 9966;}else{float ehdhwfqf = 259084390;}
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