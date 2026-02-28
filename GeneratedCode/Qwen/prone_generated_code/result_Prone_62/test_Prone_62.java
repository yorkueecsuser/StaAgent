import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    @Test(expected = AssertionError.class)
    public void testDepositWithoutLock() {
        Account account = new Account();
        account.showBug(); // TRIGGER BUG: GuardedBy
    }
}

class TransactionTest {

    @Test(expected = AssertionError.class)
    public void testLambdaWithoutLock() {
        Transaction transaction = new Transaction();
        transaction.showBug1(); // TRIGGER BUG: GuardedBy
    }
}

class NamesTest {

    @Test(expected = AssertionError.class)
    public void testAddNameWithoutLock() {
        Names names = new Names();
        names.showBug2("John"); // TRIGGER BUG: GuardedBy
    }
}