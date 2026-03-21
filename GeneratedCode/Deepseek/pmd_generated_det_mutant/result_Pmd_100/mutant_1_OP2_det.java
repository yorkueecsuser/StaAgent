import java.util.StringJoiner;

class BugExample {
public String showBug() {
    StringBuilder sb = new StringBuilder();
    sb = new StringBuilder();
    sb.append('a');
    return sb.toString();
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}