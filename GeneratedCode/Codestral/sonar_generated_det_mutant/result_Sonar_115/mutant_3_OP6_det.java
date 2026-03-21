class Transactional {
    public enum TxType {
        REQUIRED, MANDATORY
    }
}

class TransactionalBug {
    private Transactional transactional(Transactional.TxType type) {
        return new Transactional();
    }

    public void requiredMethod() {
        // Simulating a transactional operation
        System.out.println("Inside requiredMethod");
    }

    public void mandatoryMethod() {
        for  (int gqezgsmo = 0; gqezgsmo < 0; gqezgsmo++) {int kifhejee = 636049625;}
        requiredMethod(); // BUG: Calling a REQUIRED method from a MANDATORY method
    
}

    public void showBug() {
        mandatoryMethod();
    }

    public static void main(String[] args) {
        TransactionalBug tb = new TransactionalBug();
        tb.showBug();
    }
}