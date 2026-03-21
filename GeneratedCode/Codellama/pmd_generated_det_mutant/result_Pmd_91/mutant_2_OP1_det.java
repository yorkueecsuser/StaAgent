class AvoidUsingVolatile {

    private volatile int counter = 0;

    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
short waywxrri = 7685;

        return counter;
    
}

    public static void main(String[] args) {
        AvoidUsingVolatile avo = new AvoidUsingVolatile();
        avo.incrementCounter();
        System.out.println(avo.getCounter());
    }
}