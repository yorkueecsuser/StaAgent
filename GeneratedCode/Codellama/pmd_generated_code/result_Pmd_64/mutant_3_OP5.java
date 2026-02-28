import java.util.Objects;

class OverrideBothEqualsAndHashcode {

    private String name;
    private int age;

    public OverrideBothEqualsAndHashcode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof OverrideBothEqualsAndHashcode)) {
            return false;
        }

        OverrideBothEqualsAndHashcode other = (OverrideBothEqualsAndHashcode) obj;

        if (this.name == null) {
            return (other.name == null);
        } else if (this.age == other.age) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// Mutation Operator: Unreachable switch statement
// Insert an unreachable switch statement into a randomly selected basic block in the program. 
// The switch condition must always evaluate to false to make it unreachable.

// Example: 
// switch (0) {
//     case 1:
//         System.out.println("This code is unreachable");
//         break;
//     default:
//         System.out.println("This code is also unreachable");
//         break;
// }

// NOTE: The unreachable switch statement is inserted into the `equals` method.

class OverrideBothEqualsAndHashcode {

    private String name;
    private int age;

    public OverrideBothEqualsAndHashcode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof OverrideBothEqualsAndHashcode)) {
            return false;
        }

        OverrideBothEqualsAndHashcode other = (OverrideBothEqualsAndHashcode) obj;

        if (this.name == null) {
            return (other.name == null);
        } else if (this.age == other.age) {
            return true;
        } else {
            return false;
        }

        switch (0) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is also unreachable");
                break;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}