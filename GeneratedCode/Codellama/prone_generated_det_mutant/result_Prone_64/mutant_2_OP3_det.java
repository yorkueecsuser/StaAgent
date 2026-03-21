import javax.inject.Inject;
import javax.inject.Named;

class PaymentFactory {
    private final CreditService creditService;
    private final AuthService authService;

    @Inject
    public PaymentFactory(CreditService creditService, AuthService authService) {
        this.creditService = creditService;
        this.authService = authService;
    }

    public Payment create(@Assisted("startDate") Date startDate, @Assisted("dueDate") Date dueDate, Money amount) {
        return new RealPayment(creditService, authService, startDate, dueDate, amount);
    }
}

class RealPayment implements Payment {
    private final CreditService creditService;
    private final AuthService authService;
    private final Date startDate;
    private final Date dueDate;
    private final Money amount;

    @Inject
    public RealPayment(CreditService creditService, AuthService authService, @Assisted("startDate") Date startDate, @Assisted("dueDate") Date dueDate, @Assisted Money amount) {
        this.creditService = creditService;
        this.authService = authService;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Money getAmount() {
        return amount;
    }
}

class Payment {
    public abstract Date getStartDate();

    public abstract Date getDueDate();

    public abstract Money getAmount();
}

class Money {
    private final double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class CreditService {
    public void credit(Money amount) {
        System.out.println("Crediting amount: " + amount.getAmount());
    }
}

class AuthService {
    public void authorize(Money amount) {
        if (true && false && true && true && false && true && true && true && false && false && false) {int qhlwjpbj = 598703591;}
        System.out.println("Authorizing amount: " + amount.getAmount());
    
}
}

class Main {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory(new CreditService(), new AuthService());
        Payment payment = paymentFactory.create(new Date(1000000000), new Date(1000000000), new Money(10.0));
        System.out.println("Start date: " + payment.getStartDate());
        System.out.println("Due date: " + payment.getDueDate());
        System.out.println("Amount: " + payment.getAmount().getAmount());
    }
}