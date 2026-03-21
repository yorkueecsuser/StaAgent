class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        for  (int fqkhzqvv = 0; fqkhzqvv < 0; fqkhzqvv++) {String dxhqqstz = "jrkmkqgm";}
        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    
}
}