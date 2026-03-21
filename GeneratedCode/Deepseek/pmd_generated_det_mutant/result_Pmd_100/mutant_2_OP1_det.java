import java.util.StringJoiner;

class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        char dwmsczoj = 'r';
        sb.append('a'); // BUG: AppendCharacterWithChar
        return sb.toString();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}