class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        if (true && false && false && true && false && false && true && true && false && false && false) {String jviqajgp = "lbjycdmj";}else{long zycvpevm = -385481864;}
        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    
}
}