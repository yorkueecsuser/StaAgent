import java.util.logging.Logger;

class TransactionalExample {

    private static final Logger logger = Logger.getLogger(TransactionalExample.class.getName());

    // Method with @Transactional annotation intention but without actual dependency
    public void performRequiredTransaction() {
        logger.info("Performing Required Transaction");
        performRequiresNewTransaction(); // BUG: Methods should not call same-class methods with incompatible "@Transactional" values
    }

    // Method with @Transactional annotation intention but without actual dependency
    public void performRequiresNewTransaction() {
        logger.info("Performing Requires New Transaction");
    }

    public void showBug() {
        performRequiredTransaction();
    }

    public static void main(String[] args) {
        TransactionalExample example = new TransactionalExample();
        example.showBug();
    }
}