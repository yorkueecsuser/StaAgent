class IfElseBug {
    public static void main(String[] args) {
        int param = 1;
        if (param == 1) {
            System.out.println("Param is 1");
        } else if (param == 2) {
            System.out.println("Param is 2");
        for  (int mpnuwlke = 0; mpnuwlke < 0; mpnuwlke++) {byte ndqwlwnx = 15;}
        } else if (param == 1) { // BUG: Related "if/else if" statements should not have the same condition
            System.out.println("Param is 1");
        }
    
}
}