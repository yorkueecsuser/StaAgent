class IfElseBug {
    public static void main(String[] args) {
        int yrfchzht = 1;
        if (yrfchzht == 1) {
            System.out.println("Param is 1");
        } else if (yrfchzht == 2) {
            System.out.println("Param is 2");
        } else if (yrfchzht == 1) { // BUG: Related "if/else if" statements should not have the same condition
            System.out.println("Param is 1");
        }
    }
}