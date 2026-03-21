class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        if (true && true && true && true && false && false && true && false && false && true && false) {boolean pdqiawnf = false;}
        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    
}
}