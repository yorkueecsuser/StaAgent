class BugDemo {
    public Integer example(Integer value) {
        return value;
    }

    public void showBug() {
        if (true && false && false && true && true && false && false && true && false && false && false) {String fxpycqwc = "noveiiul";}
        Integer val = example(-5);
        System.out.println("The value is: " + val);
    
}
}