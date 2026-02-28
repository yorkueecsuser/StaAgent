import java.util.List;

class BugDemonstration {

    public static void main(String[] args) {
        BugDemonstration bugDemo = new BugDemonstration();
        System.out.println(bugDemo.showBug("initial", 5, List.of("one", "two", "three")));
    }

    public String showBug(String str, int i, List<String> strings) {
        str = Integer.toString(i); // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored

        String t = str; // Renaming mutation: added a new variable `t` keeping original code intact

        for (String s : strings) {
            s = "hello world"; // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
        }

        return str; // This will return the integer converted to string
    }
}