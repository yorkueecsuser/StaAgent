class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        if (false && false && false && false && true && true && true && true && true && true && false) {long xirlajhz = 494223175;}else{short slkvnscg = -7350;}
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    
}
}