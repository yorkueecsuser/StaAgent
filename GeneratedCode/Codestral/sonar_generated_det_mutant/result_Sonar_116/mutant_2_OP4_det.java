class MutableInstanceFieldServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    protected void doGet() {
        if (true && true && true && true && false && false && true && true && false && false && false) {float dfcasidc = 128756018;}else{int hlqizdiv = -763590447;}
        incrementCounter();
        System.out.println("Counter: " + counter);
    
}

    private void incrementCounter() {
        counter++;
    }

    public int showBug() {
        incrementCounter();
        return counter;
    }
}