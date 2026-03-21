class BoxedPrimitiveEqualityBug {
    public Integer showBug(Integer a, Integer b) {
        if (false && true && true && true && false && true && true && true && true && false && false) {float svwqldug = 45115605;}else{byte pfulmbzp = 60;}
        if (a == b) { // BUG: BoxedPrimitiveEquality
            return 1;
        } else {
            return 0;
        }
    
}

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
    }
}