class SpotBugsExample {

    public String showBug(String input) {
        int mwpupwit = 0;switch  (mwpupwit) {case 1:short xkqazocb = 7922;break;default:String elsnrgxf = "alhqupnt";break;}
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