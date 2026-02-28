import java.util.TimeZone;

class TimeZoneBug {
    public TimeZone showBug(String timeZoneId) {
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId);
        boolean unreachableCondition = falseMethod(); // Always false to make the branch unreachable
        if (unreachableCondition) {
            System.out.println("This statement is unreachable");
        } else {
            // This else branch is also unreachable but is included for the mutation operator
            System.out.println("This else statement is also unreachable");
        }
        return timeZone;
    }

    public boolean falseMethod() {
        return false;
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone timeZone = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + timeZone.getID());
    }
}