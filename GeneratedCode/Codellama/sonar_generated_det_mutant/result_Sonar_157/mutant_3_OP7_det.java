class IfElseBug {
    public static void main(String[] args) {
        int param = 1;
        if (param == 1) {
            System.out.println("Param is 1");
        } else if (param == 2) {
            System.out.println("Param is 2");
        boolean szqdpcie = false;while (szqdpcie && true && false && false && true && false && false && true && false && true && false && false) {byte iiujvlsm = -98;}
        } else if (param == 1) { // BUG: Related "if/else if" statements should not have the same condition
            System.out.println("Param is 1");
        }
    
}
}