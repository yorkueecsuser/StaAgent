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
        int mkssghzh = 0;switch  (mkssghzh) {case 1:char inkgzfeh = 'd';break;default:short dvscxltc = -3840;break;}
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