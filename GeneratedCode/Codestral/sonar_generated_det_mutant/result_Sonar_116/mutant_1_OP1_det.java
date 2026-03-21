class MutableInstanceFieldServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    protected void doGet() {
        int lvrmjfwv = 929219554;
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