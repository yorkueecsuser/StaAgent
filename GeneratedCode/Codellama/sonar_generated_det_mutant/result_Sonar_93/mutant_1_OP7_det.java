class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        boolean tmlvqrlp = false;while (tmlvqrlp && false && true && false && false && true && true && false && false && true && false && false) {String iahbgwxw = "lhyojpfe";}
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    
}
}