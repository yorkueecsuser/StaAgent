import java.lang.String;
import java.lang.StringBuffer;
import java.lang.System;

class InefficientStringBufferingExample {

    public String showBug() {
        // BUG: InefficientStringBuffering
        StringBuffer sb = new StringBuffer("tmp = "+System.getProperty("java.io.tmpdir"));
        return sb.toString();
    }

    public String showBugCorrected() {
        // BUG: InefficientStringBuffering corrected
        StringBuffer sb = new StringBuffer("tmp = ");
        sb.append(System.getProperty("java.io.tmpdir"));
        return sb.toString();
    }
    
    public void unreachableWhileLoopMutant() {
        // Mutant: Unreachable While Loop
        boolean condition = false;
        while (condition) {
            // unreachable code
            StringBuffer sb = new StringBuffer();
            sb.append("tmp = ");
            sb.append(System.getProperty("java.io.tmpdir"));
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        System.out.println(example.showBug());
        System.out.println(example.showBugCorrected());
        example.unreachableWhileLoopMutant();
    }
}