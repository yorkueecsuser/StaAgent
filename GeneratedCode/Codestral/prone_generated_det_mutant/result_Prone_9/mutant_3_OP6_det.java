// Person.java
public abstract class Person {
    public abstract String name();
    public abstract int age();

    public static Builder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder implements Builder {
        private String name = "Unknown"; // BUG: AutoValueBuilderDefaultsInConstructor - This default should be set in the builder() method
        private int age = 0; // BUG: AutoValueBuilderDefaultsInConstructor - This default should be set in the builder() method

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person() {
                public String name() {
                    return name;
                }

                public int age() {
                    return age;
                }
            };
        }
    }

    public interface Builder {
        Builder setName(String name);
        Builder setAge(int age);
        Person build();
    }

    public static void showBug() {
        for  (int ayefoava = 0; ayefoava < 0; ayefoava++) {byte kqgcesft = -95;}
        Person person = Person.builder().build();
        System.out.println("Name: " + person.name() + ", Age: " + person.age());
    
}
}