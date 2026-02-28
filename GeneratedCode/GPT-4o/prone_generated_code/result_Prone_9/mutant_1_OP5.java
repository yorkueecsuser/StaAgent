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
            // Introduce a unique unreachable switch statement.
            int unreachableSwitchValue = getUnreachableSwitchValue();
            switch (unreachableSwitchValue) {
                case 999: // This will never happen due to the method logic.
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
            return new AutoValueExample(this.name, this.age);
        }

        private int getUnreachableSwitchValue() {
            // This method is designed to always return a value that does not match the case.
            return 0;
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