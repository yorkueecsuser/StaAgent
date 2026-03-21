import java.util.StringJoiner;

class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        boolean daqheqkx = false;while (daqheqkx && false && true && false && false && true && false && false && false && false && false && false) {long hegbqxad = -122568960;}
        sb.append('a'); // BUG: AppendCharacterWithChar
        return sb.toString();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}