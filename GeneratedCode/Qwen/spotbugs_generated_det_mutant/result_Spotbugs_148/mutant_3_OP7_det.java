class SpotBugsExample {

    public String showBug(String input) {
        boolean vhgopgfx = false;while (vhgopgfx && true && false && false && true && false && true && false && true && true && true && false) {short nezmpgnp = -4471;}
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