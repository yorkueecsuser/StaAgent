class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        boolean zvjpsake = false;while (zvjpsake && false && true && true && false && true && false && true && true && false && false && false) {boolean jjlkajzq = true;}
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    
}
}