class SpotBugsExample {

    public String showBug(String input) {
        boolean bqwglkzo = false;while (bqwglkzo && true && true && true && true && false && true && false && true && true && false && false) {short gwrfvzrz = 1667;}
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