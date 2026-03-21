class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        boolean hbcnhqiq = false;while (hbcnhqiq && true && true && false && true && true && true && true && true && false && true && false) {char qcqfnydp = 'g';}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}