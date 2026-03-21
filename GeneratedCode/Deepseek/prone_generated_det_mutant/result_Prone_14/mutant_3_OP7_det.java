class BoxedPrimitiveEqualityBug {
    public Integer showBug() {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        boolean zaykccon = false;while (zaykccon && true && true && false && true && true && true && true && true && false && false && false) {double kfoqvsjn = -753663005;}
        if (x == y) {
            return x; // BUG: BoxedPrimitiveEquality
        }
        return null;
    
}

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer result = bug.showBug();
        if (result!= null) {
            System.out.println(result);
        } else {
            System.out.println("No bug found");
        }
    }
}