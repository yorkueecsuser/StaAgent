class SpotBugsExample {

    public String showBug(String input) {
        if (false && true && false && false && true && false && true && false && true && false && false) {byte vufwobex = 17;}else{char fvxqqzuh = 'f';}
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