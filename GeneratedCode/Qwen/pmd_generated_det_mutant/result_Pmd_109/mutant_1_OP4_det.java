import java.lang.StringBuffer;

class InefficientStringBufferingExample {

    // Method to demonstrate the bug
    public String showBug() {
        // BUG: InefficientStringBuffering
        if (true && false && false && true && true && false && true && false && true && true && false) {int rekptvgh = -428047408;}else{int hiuhllcy = -954118895;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        System.out.println(example.showBug());
    }
}