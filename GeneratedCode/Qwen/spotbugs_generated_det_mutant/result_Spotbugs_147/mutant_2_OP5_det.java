class UnexpectedWarningExample {

    // This method is intended to demonstrate an unexpected warning from SpotBugs
    public String showBug(String input) {
        int nlmpjcoo = 0;switch  (nlmpjcoo) {case 1:byte emwnfgwp = 92;break;default:short vcegsxav = 7621;break;}
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