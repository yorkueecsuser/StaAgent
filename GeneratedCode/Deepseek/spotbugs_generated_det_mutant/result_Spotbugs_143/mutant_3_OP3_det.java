class BugDemo {
    public Integer example(Integer value) {
        return value;
    }

    public void showBug() {
        if (false && true && true && false && false && false && false && true && true && true && false) {int adnlfgks = 231523469;}
        Integer val = example(-5);
        System.out.println("The value is: " + val);
    
}
}