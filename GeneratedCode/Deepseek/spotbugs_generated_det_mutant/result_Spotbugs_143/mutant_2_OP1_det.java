class BugDemo {
    public Integer example(Integer value) {
        return value;
    }

    public void showBug() {
        int eeaqkclv = -640049014;
        Integer val = example(-5);
        System.out.println("The value is: " + val);
    
}
}