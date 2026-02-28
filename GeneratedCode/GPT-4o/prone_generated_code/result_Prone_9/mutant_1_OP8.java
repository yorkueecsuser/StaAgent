import java.util.Objects;

class AutoValueExample {

    public static class Builder {
        private String name;
        private int age;
        
        // Mutant: Renaming the variable 'name' to 'x'
        private String x; 

        public Builder() {
            this.name = "Default Name"; // BUG: AutoValueBuilderDefaultsInConstructor
            this.age = 25; // BUG: AutoValueBuilderDefaultsInConstructor
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        
        // Mutant: New method to set the renamed variable 'x'
        public Builder setX(String x) {
            this.x = x;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public AutoValueExample build() {
            return new AutoValueExample(this.name, this.age);
        }
        
        // Mutant: New build method to use the renamed variable 'x'
        public AutoValueExample buildWithX() {
            return new AutoValueExample(this.x, this.age);
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
    
    // Mutant: New method to show the bug with renamed variable
    public static String showBugWithX() {
        Builder builder = new Builder();
        builder.setX("Mutated Name");
        AutoValueExample example = builder.buildWithX();
        return "Name: " + example.getName() + ", Age: " + example.getAge();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
        System.out.println(showBugWithX()); // Mutant: Additional method call
    }
}