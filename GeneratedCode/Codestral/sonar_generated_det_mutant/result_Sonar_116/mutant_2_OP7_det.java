class MutableInstanceFieldServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    protected void doGet() {
        boolean ldgbgmgo = false;while (ldgbgmgo && false && true && false && true && true && true && true && true && false && true && false) {float jsrmktxf = 531973072;}
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