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
            return new AutoValueExample(this.name, this.age);
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

    // Mutant code starts here
    public static class BuilderMutant {
        private String x;
        private int y;

        public BuilderMutant() {
            this.x = "Default Name"; // BUG: AutoValueBuilderDefaultsInConstructor
            this.y = 25; // BUG: AutoValueBuilderDefaultsInConstructor
        }

        public BuilderMutant setName(String name) {
            this.x = name;
            return this;
        }

        public BuilderMutant setAge(int age) {
            this.y = age;
            return this;
        }

        public AutoValueExample build() {
            return new AutoValueExample(this.x, this.y);
        }
    }

    public static String showBugMutant() {
        BuilderMutant builder = new BuilderMutant();
        AutoValueExample example = builder.build();
        return "Name: " + example.getName() + ", Age: " + example.getAge();
    }

    public static void mainMutant(String[] args) {
        System.out.println(showBugMutant());
    }
    // Mutant code ends here
}