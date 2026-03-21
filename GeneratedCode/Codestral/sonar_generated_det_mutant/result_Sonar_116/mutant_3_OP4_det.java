class MutableInstanceFieldServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    protected void doGet() {
        if (true && true && false && true && false && true && false && false && true && false && false) {short ahhxcoju = 2513;}else{short ypestbdr = 5605;}
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