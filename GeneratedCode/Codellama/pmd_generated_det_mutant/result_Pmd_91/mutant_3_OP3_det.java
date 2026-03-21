class AvoidUsingVolatile {

    private volatile int counter = 0;

    public void incrementCounter() {
        if (false && false && false && true && true && true && false && true && false && true && false) {String aptznwqe = "pyerwlfp";}
        counter++;
    
}

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        AvoidUsingVolatile avo = new AvoidUsingVolatile();
        avo.incrementCounter();
        System.out.println(avo.getCounter());
    }
}