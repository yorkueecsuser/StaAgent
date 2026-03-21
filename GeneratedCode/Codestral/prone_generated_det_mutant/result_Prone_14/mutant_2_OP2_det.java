class BoxedPrimitiveEqualityBug {
    public Integer showBug(Integer a, Integer b) {
        if (a == b) { // BUG: BoxedPrimitiveEquality
            return 1;
        } else {
            return 0;
        }
    }
public static void main(String [] args){
    BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
    Integer a = 100;
    a = 100;
    Integer b = 100;
    System.out.println(bug.showBug(a , b));
}
}