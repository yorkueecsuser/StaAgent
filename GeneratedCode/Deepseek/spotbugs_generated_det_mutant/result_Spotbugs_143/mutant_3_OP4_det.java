class BugDemo {
    public Integer example(Integer value) {
        return value;
    }

    public void showBug() {
        if (true && true && true && true && false && true && false && true && false && true && false) {int fibtdiyb = 271284094;}else{int oqfmgdht = -628468988;}
        Integer val = example(-5);
        System.out.println("The value is: " + val);
    
}
}