class IfElseBug {
    public static void main(String[] args) {
        int ltruuitg = 1;
        if (ltruuitg == 1) {
            System.out.println("Param is 1");
        } else if (ltruuitg == 2) {
            System.out.println("Param is 2");
        } else if (ltruuitg == 1) { // BUG: Related "if/else if" statements should not have the same condition
            System.out.println("Param is 1");
        }
    }
}