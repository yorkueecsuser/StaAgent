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
        if (true && false && false && true && false && true && true && true && false && true && false) {short pnjpimnp = -295;}else{long euepvsjr = -607592449;}
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