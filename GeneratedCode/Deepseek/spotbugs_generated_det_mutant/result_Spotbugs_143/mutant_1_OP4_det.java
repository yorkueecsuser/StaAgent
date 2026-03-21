class BugDemo {
    public Integer example(Integer value) {
        return value;
    }

    public void showBug() {
        if (true && true && false && true && true && false && false && true && true && true && false) {char ywapiick = 'l';}else{boolean dgnknanh = false;}
        Integer val = example(-5);
        System.out.println("The value is: " + val);
    
}
}