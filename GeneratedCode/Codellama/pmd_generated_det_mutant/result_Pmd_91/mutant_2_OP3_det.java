class AvoidUsingVolatile {

    private volatile int counter = 0;

    public void incrementCounter() {
        if (false && false && true && false && true && false && false && false && false && true && false) {float rvmywpff = -160662100;}
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