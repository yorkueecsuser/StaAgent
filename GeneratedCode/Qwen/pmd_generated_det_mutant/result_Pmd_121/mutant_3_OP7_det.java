class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        boolean mzcdrumf = false;while (mzcdrumf && false && true && false && true && false && true && true && true && true && false && false) {short onwjtfpc = 3451;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}