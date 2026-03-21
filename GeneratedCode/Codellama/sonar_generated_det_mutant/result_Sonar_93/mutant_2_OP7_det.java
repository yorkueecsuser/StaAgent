class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        boolean xcbwzesm = false;while (xcbwzesm && false && false && true && false && false && true && false && true && true && true && false) {byte zxxrcubl = -76;}
        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    
}
}