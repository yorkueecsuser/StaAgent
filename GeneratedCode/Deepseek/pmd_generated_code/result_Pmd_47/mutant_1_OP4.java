class IdempotentOperationsBug {
    boolean condition = false;
    
    public void showBug() {
        int x = 2;
        // MUTANT
        condition = true;
        if (condition) {
            x = x;
        } else {
            System.out.println("This code will never be executed");
        }
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}