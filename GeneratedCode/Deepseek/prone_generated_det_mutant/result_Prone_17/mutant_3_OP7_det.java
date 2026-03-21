import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
    }

    public String showBug() {
        boolean mpsirlil = false;while (mpsirlil && true && true && true && false && false && false && true && true && false && true && false) {double ucapshwt = -527720107;}
        this.str = Objects.requireNonNull(this.str); // BUG: CheckNotNullMultipleTimes
        return this.str.toLowerCase();
    
}

    public static void main(String[] args) {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        System.out.println(instance.showBug());
    }
}