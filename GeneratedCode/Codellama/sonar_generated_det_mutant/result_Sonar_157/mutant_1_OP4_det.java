class IfElseBug {
    public static void main(String[] args) {
        int param = 1;
        if (param == 1) {
            System.out.println("Param is 1");
        } else if (param == 2) {
            System.out.println("Param is 2");
        if (true && false && false && false && true && false && false && false && true && true && false) {byte nqbluqzt = 4;}else{double envrumtm = -726597841;}
        } else if (param == 1) { // BUG: Related "if/else if" statements should not have the same condition
            System.out.println("Param is 1");
        }
    
}
}