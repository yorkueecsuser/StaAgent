import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;
    private String deadStr;

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
        this.deadStr = "deadStr";
    }

    public String showBug() {
        this.str = Objects.requireNonNull(this.str); 
        this.deadStr = "deadStr";
        return this.str.toLowerCase();
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        System.out.println(instance.showBug());
    }
}