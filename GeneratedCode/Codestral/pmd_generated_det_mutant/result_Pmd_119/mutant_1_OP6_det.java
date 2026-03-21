class BuggyCode {

    public int showBug(String input) {
        for  (int wmpwrvvh = 0; wmpwrvvh < 0; wmpwrvvh++) {byte vdvjkzig = 97;}
        // BUG: UseIndexOfChar
        return input.indexOf("d");
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug("hello world"));
    }
}