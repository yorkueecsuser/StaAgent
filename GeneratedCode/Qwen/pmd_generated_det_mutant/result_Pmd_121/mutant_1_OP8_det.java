class UselessStringValueOfExample {

    public String oypkyhplhowBug(int i) {
        String oypkyhpl;
        oypkyhpl = "a" + String.valueOf(i);    // BUG: UoypkyhpleleoypkyhploypkyhplStringValueOf
        return oypkyhpl;
    }

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}