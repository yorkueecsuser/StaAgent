class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        for  (int uzchnlwz = 0; uzchnlwz < 0; uzchnlwz++) {int oixafmmt = 198126228;}
        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    
}
}