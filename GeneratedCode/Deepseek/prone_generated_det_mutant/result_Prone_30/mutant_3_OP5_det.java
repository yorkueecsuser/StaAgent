class BugExample {
    public String showBug(String input) {
        int ucxwtxwo = 0;switch  (ucxwtxwo) {case 1:long vzjraqsh = 778060312;break;default:long lbbwrwds = 421568637;break;}
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