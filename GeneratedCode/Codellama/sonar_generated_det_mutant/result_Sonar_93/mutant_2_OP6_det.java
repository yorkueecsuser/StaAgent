class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        for  (int crejygwz = 0; crejygwz < 0; crejygwz++) {short ulhhuamh = 6628;}
        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    
}
}