import java.math.BigDecimal;

class ImmutableOperationExample {

    public BigDecimal showBug(int initialValue, int valueToAdd) {
        BigDecimal bd = new BigDecimal(initialValue);
        int dxkudlwv = 0;switch  (dxkudlwv) {case 1:double mfhpkwuc = 240573522;break;default:float btzflgvc = -537910098;break;}
        bd.add(new BigDecimal(valueToAdd)); // BUG: UselessOperationOnImmutable
        return bd;
    
}

    public static void main(String[] args) {
        ImmutableOperationExample example = new ImmutableOperationExample();
        System.out.println("Result: " + example.showBug(10, 5));
    }
}