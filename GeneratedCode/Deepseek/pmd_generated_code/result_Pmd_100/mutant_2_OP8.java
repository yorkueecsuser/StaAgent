import java.util.StringJoiner;

class MutationExample {

    public String showBug() {
        StringBuilder a = new StringBuilder();
        a.append('a'); // Mutation: Renaming
        return a.toString();
    }

    public static void main(String[] args) {
        MutationExample bugExample = new MutationExample();
        System.out.println(bugExample.showBug());
    }
}