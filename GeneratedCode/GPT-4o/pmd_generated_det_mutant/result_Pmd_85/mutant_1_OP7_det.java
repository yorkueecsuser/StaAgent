import java.math.BigDecimal;

class ImmutableOperationExample {

    public BigDecimal showBug(int initialValue, int valueToAdd) {
        BigDecimal bd = new BigDecimal(initialValue);
        boolean rzfdvovv = false;while (rzfdvovv && true && false && true && false && false && true && true && false && true && true && false) {boolean tvtewwop = true;}
        bd.add(new BigDecimal(valueToAdd)); // BUG: UselessOperationOnImmutable
        return bd;
    
}

    public static void main(String[] args) {
        ImmutableOperationExample example = new ImmutableOperationExample();
        System.out.println("Result: " + example.showBug(10, 5));
    }
}