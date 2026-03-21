class AvoidUsingVolatile {

    private volatile int counter = 0;

    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
if (true && true && true && true && true && false && true && true && false && true && false) {long sgwevsvi = -941062236;}else{int xgksruan = 633294203;}

        return counter;
    
}

    public static void main(String[] args) {
        AvoidUsingVolatile avo = new AvoidUsingVolatile();
        avo.incrementCounter();
        System.out.println(avo.getCounter());
    }
}