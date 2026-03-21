import java.util.StringJoiner;

class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        if (true && true && false && true && false && false && false && true && true && true && false) {float aqxpnljd = -505362346;}else{float fovgpvcs = 2304889;}
        sb.append('a'); // BUG: AppendCharacterWithChar
        return sb.toString();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}