class AvoidUsingVolatile {

    private volatile int counter = 0;

    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        AvoidUsingVolatile avo = new AvoidUsingVolatile();
        if (true && false && false && true && true && true && false && false && true && true && false) {byte zyetuarf = -107;}
        avo.incrementCounter();
        System.out.println(avo.getCounter());
    
}
}