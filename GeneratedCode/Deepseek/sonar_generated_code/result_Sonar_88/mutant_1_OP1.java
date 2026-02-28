import java.util.List;

class BugExample {

    private String mutantString;

    public String[] getStringArray(List<String> strings) {
        mutantString = "mutant"; // Dead Store Mutant
        return (String[]) strings.toArray();
    }

    public String[] getStringArrayCorrect(List<String> strings) {
        return strings.toArray(new String[0]);
    }

    public String[] getPresizedStringArray(List<String> strings) {
        return strings.toArray(new String[strings.size()]);
    }

    public String[] showBug() {
        List<String> strings = List.of("Hello", "World");
        return getStringArray(strings);
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        try {
            String[] output = bugExample.showBug();
            for (String s : output) {
                System.out.println(s);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}