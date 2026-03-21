import java.lang.StringBuffer;

class InefficientStringBufferingExample {

    // Method to demonstrate the bug
    public String showBug() {
        // BUG: InefficientStringBuffering
        if (true && false && true && true && true && false && false && true && false && false && false) {byte fmntdeog = 65;}else{float wtpuhira = -735863846;}
        StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir"));
        return sb.toString();
    
}

    public static void main(String[] args) {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        System.out.println(example.showBug());
    }
}