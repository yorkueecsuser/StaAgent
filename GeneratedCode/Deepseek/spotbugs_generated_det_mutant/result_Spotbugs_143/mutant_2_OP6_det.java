class BugDemo {
    public Integer example(Integer value) {
        return value;
    }

    public void showBug() {
        for  (int ndvpzhel = 0; ndvpzhel < 0; ndvpzhel++) {long zwucnspb = -772692289;}
        Integer val = example(-5);
        System.out.println("The value is: " + val);
    
}
}