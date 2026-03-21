class BugDemo {
    public Integer example(Integer value) {
        return value;
    }

    public void showBug() {
        if (true && true && false && true && false && true && true && false && false && true && false) {short vqjrppaf = -3658;}else{short agiaufsl = -4180;}
        Integer val = example(-5);
        System.out.println("The value is: " + val);
    
}
}