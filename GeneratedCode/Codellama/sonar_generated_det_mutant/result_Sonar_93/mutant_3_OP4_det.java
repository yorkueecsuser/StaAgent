class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        if (false && true && false && false && true && false && false && false && true && true && false) {byte cjrgvdsu = -13;}else{byte cmpssifh = -119;}
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    
}
}