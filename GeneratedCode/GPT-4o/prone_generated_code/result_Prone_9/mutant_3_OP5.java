import java.util.Objects;

class AutoValueExample {

    public static class Builder {
        private String name;
        private int age;

        public Builder() {
            this.name = "Default Name"; // BUG: AutoValueBuilderDefaultsInConstructor
            this.age = 25; // BUG: AutoValueBuilderDefaultsInConstructor
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public AutoValueExample build() {
            // Introducing an unreachable switch statement
            int unreachableSwitchCondition = getUnreachableSwitchCondition();
            switch (unreachableSwitchCondition) {
                case 1:
                    System.out.println("This case is unreachable.");
                    break;
                case 2:
                    System.out.println("This case is also unreachable.");
                    break;
                default:
                    // This default case is also unreachable.
                    break;
            }
            return new AutoValueExample(this.name, this.age);
        }

        private int getUnreachableSwitchCondition() {
            // This method always returns a value that isn't matched,
            // making the switch statement unreachable.
            return 3;
        }
    }

    private final String name;
    private final int age;

    private AutoValueExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static String showBug() {
        Builder builder = new Builder();
        AutoValueExample example = builder.build();
        return "Name: " + example.getName() + ", Age: " + example.getAge();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}