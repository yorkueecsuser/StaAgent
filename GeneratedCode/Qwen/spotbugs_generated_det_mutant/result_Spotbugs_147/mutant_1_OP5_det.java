class UnexpectedWarningExample {

    // This method is intended to demonstrate an unexpected warning from SpotBugs
    public String showBug(String input) {
        int kxzwhpmc = 0;switch  (kxzwhpmc) {case 1:String eaaxoxxc = "npgiwcna";break;default:short zlurwecg = 5323;break;}
        if (input == null) {
            return "Input is null";
        }
        return input.toUpperCase(); // BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING) 
    
}

    public static void main(String[] args) {
        UnexpectedWarningExample example = new UnexpectedWarningExample();
        System.out.println(example.showBug(null));
    }
}