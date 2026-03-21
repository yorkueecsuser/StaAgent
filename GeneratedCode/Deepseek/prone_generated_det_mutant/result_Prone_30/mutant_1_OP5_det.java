class BugExample {
    public String showBug(String input) {
        int yellkuyh = 0;switch  (yellkuyh) {case 1:String avzpweas = "jgbcalaa";break;default:boolean rfjbafeu = false;break;}
        if (input == null) { // BUG: DangerousLiteralNull
            return "Input cannot be null";
        } else {
            return "Input is: " + input;
        }
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug(null)); // Testing the bug
    }
}