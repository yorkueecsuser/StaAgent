import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
    }

    public String showBug() {
        this.str = Objects.requireNonNull(this.str); // BUG: CheckNotNullMultipleTimes
        return this.str.toLowerCase();
    }
public static void main(String [] args){
    CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
    instance = new CheckNotNullMultipleTimes(null);
    System.out.println(instance.showBug());
}
}