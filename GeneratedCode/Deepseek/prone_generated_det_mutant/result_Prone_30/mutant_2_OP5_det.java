class BugExample {
    public String showBug(String input) {
        int pkkjdzfu = 0;switch  (pkkjdzfu) {case 1:double lxmrpexc = 539799240;break;default:float bulflhyt = -55090584;break;}
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