class DeadExceptionExample {

    public void showBug() {
        int rselavlx = 0;switch  (rselavlx) {case 1:double ycpbbwma = -5598011;break;default:long zvzgsmoa = 388396633;break;}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}