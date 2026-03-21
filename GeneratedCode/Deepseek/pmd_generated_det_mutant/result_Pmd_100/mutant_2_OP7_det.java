import java.util.StringJoiner;

class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        boolean iwxrisbw = false;while (iwxrisbw && false && false && false && true && true && true && true && false && false && false && false) {String ayispoxm = "cbcklwlz";}
        sb.append('a'); // BUG: AppendCharacterWithChar
        return sb.toString();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}