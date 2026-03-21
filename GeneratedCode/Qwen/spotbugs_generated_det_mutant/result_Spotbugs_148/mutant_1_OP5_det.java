class SpotBugsExample {

    public String showBug(String input) {
        int jqyhwzym = 0;switch  (jqyhwzym) {case 1:boolean kxqdpbtq = true;break;default:float zcwgequz = 240710328;break;}
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