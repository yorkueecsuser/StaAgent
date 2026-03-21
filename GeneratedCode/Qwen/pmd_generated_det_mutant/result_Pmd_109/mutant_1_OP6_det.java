import java.lang.StringBuffer;

class InefficientStringBufferingExample {

    // Method to demonstrate the bug
    public String showBug() {
        // BUG: InefficientStringBuffering
        for  (int gohsphfg = 0; gohsphfg < 0; gohsphfg++) {long zhbzpjwp = -915039176;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        System.out.println(example.showBug());
    }
}