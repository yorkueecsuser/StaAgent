import java.util.Objects;

class OverrideBothEqualsAndHashcode {

    private String name;
    private int age;
    private String deadStore; // Dead Store

    public OverrideBothEqualsAndHashcode(String name, int age) {
        this.name = name;
        this.age = age;
        this.deadStore = generateRandomString(); // Dead Store
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

    private String generateRandomString() {
        String randomString = "";
        for (int i = 0; i < 8; i++) {
            int randomInt = (int) (Math.random() * 26);
            randomString += (char) ('a' + randomInt);
        }
        return randomString;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}