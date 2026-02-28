import java.util.StringJoiner;

class BugExample {

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        sb.append('a'); // BUG: AppendCharacterWithChar
        return sb.toString();
    }

    public String showMutant() {
        StringJoiner sj = new StringJoiner("");
        sj.add("a"); // Mutant: AppendCharacterWithChar
        return sj.toString();
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
        System.out.println(bugExample.showMutant());
    }
}