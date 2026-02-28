import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;
    private String deadStore1;

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
    }

    public String showBug() {
        this.deadStore1 = "abcdefgh";
        this.str = Objects.requireNonNull(this.str); 
        return this.str.toLowerCase();
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        System.out.println(instance.showBug());
    }
}