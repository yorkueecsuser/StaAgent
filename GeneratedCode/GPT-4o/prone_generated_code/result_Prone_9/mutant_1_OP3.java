import java.util.Objects;

class AutoValueExample {

    public static class Builder {
        private String name;
        private int age;

        public Builder() {
            this.name = "Default Name"; // BUG: AutoValueBuilderDefaultsInConstructor
            this.age = 25; // BUG: AutoValueBuilderDefaultsInConstructor
            insertUnreachableIf(); // Call the method to include the unreachable if statement
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
            return new AutoValueExample(this.name, this.age);
        }

        private void insertUnreachableIf() {
            boolean condition = getFalseCondition();
            if (condition) {
                System.out.println("This will never be printed.");
            }
        }

        private boolean getFalseCondition() {
            return false; // This method always returns false
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