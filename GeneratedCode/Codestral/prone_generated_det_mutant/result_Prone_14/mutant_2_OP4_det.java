class BoxedPrimitiveEqualityBug {
    public Integer showBug(Integer a, Integer b) {
        if (false && false && true && false && true && false && true && true && false && false && false) {boolean azzhogti = false;}else{int irlxxlqb = 525985351;}
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