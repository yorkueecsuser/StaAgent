class BoxedPrimitiveEqualityExample {

    public boolean showBug(Integer a, Integer b) {
        return a == b; // BUG: BoxedPrimitiveEquality
    }
public static void main(String [] args){
    BoxedPrimitiveEqualityExample example = new BoxedPrimitiveEqualityExample();
    example = new BoxedPrimitiveEqualityExample();
    System.out.println("Comparing 127 and 127: " + example.showBug(127 , 127));
    System.out.println("Comparing 128 and 128: " + example.showBug(128 , 128));
}
}