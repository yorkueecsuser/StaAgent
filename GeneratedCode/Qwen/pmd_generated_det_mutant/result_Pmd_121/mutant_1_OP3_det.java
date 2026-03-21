class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        if (false && false && false && true && true && true && true && false && true && false && false) {float eglvrblq = -725558818;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}