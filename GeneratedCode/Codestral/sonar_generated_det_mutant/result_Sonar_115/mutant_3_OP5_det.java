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
        int vodwypqt = 0;switch  (vodwypqt) {case 1:int vuhttuiz = -163418663;break;default:byte pziwklwf = -96;break;}
        // Simulating a transactional operation
        System.out.println("Inside requiredMethod");
    
}

    public void mandatoryMethod() {
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