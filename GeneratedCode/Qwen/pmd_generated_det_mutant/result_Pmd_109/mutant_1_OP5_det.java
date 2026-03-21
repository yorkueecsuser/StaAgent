import java.lang.StringBuffer;

class InefficientStringBufferingExample {

    // Method to demonstrate the bug
    public String showBug() {
        // BUG: InefficientStringBuffering
        int uuhphimd = 0;switch  (uuhphimd) {case 1:boolean inwlvpsx = true;break;default:double clbdzobx = -514764080;break;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        System.out.println(example.showBug());
    }
}