import org.springframework.transaction.annotation.Transactional;

class TransactionalBug {

    @Transactional
    public void innerTransactionalMethod() {
        // Do some transactional work
    }

    public void callingMethod() {
        innerTransactionalMethod();
    }

    public void showBug() {
        callingMethod();
    }
}