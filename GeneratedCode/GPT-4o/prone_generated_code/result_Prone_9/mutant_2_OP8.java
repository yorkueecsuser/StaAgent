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
}

// Mutated code
class AutoValueExampleMutant {

    public static class Builder {
        private String b; // renamed from 'name'
        private int age;

        public Builder() {
            this.b = "Default Name"; // BUG: AutoValueBuilderDefaultsInConstructor
            this.age = 25; // BUG: AutoValueBuilderDefaultsInConstructor
        }

        public Builder setName(String name) {
            this.b = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public AutoValueExampleMutant build() {
            return new AutoValueExampleMutant(this.b, this.age);
        }
    }

    private final String b; // renamed from 'name'
    private final int age;

    private AutoValueExampleMutant(String b, int age) {
        this.b = b;
        this.age = age;
    }

    public String getName() {
        return b; // use renamed variable
    }

    public int getAge() {
        return age;
    }

    public static String showBug() {
        Builder builder = new Builder();
        AutoValueExampleMutant example = builder.build();
        return "Name: " + example.getName() + ", Age: " + example.getAge();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}