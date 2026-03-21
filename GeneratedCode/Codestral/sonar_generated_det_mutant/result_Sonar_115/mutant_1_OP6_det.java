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
        for  (int zxuhzvin = 0; zxuhzvin < 0; zxuhzvin++) {float lhufgocy = -65519348;}
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