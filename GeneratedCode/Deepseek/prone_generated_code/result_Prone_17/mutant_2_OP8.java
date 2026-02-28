import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;
    private String renamedStr; // Mutation: Renamed variable str to renamedStr

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
        this.renamedStr = Objects.requireNonNull(str); // Mutation: Renamed variable str to renamedStr
    }

    public String showBug() {
        this.str = Objects.requireNonNull(this.str); // BUG: CheckNotNullMultipleTimes
        this.renamedStr = Objects.requireNonNull(this.renamedStr); // Mutation: Renamed variable str to renamedStr
        return this.str.toLowerCase();
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        System.out.println(instance.showBug());
    }
}