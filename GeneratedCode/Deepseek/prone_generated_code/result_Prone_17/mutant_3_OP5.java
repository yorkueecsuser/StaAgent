import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
    }

    public String showBug() {
        this.str = Objects.requireNonNull(this.str); // BUG: CheckNotNullMultipleTimes
        int unreachableSwitch = 0;
        switch(unreachableSwitch) {
            case 0:
                int unreachableSwitch2 = 1;
                break;
            default:
                break;
        }
        return this.str.toLowerCase();
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        System.out.println(instance.showBug());
    }
}