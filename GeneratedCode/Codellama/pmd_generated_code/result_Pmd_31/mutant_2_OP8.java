import java.util.*;

class ConstructorCallsOverridableMethod {

    private List<String> list = new ArrayList<>();
    private String name;
    private int age;

    public ConstructorCallsOverridableMethod(String name, int age) {
        this.name = name;
        this.age = age;
        // BUG: ConstructorCallsOverridableMethod
        list.add(getName());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ConstructorCallsOverridableMethod obj = new ConstructorCallsOverridableMethod("John", 25);
        System.out.println(obj.list);
    }
}

// Mutant 1: Renamed 'list' to'myList'
import java.util.*;

class ConstructorCallsOverridableMethod {

    private List<String> myList = new ArrayList<>();
    private String name;
    private int age;

    public ConstructorCallsOverridableMethod(String name, int age) {
        this.name = name;
        this.age = age;
        // BUG: ConstructorCallsOverridableMethod
        myList.add(getName());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ConstructorCallsOverridableMethod obj = new ConstructorCallsOverridableMethod("John", 25);
        System.out.println(obj.myList);
    }
}

// Mutant 2: Renamed 'name' to'myName'
import java.util.*;

class ConstructorCallsOverridableMethod {

    private List<String> list = new ArrayList<>();
    private String myName;
    private int age;

    public ConstructorCallsOverridableMethod(String myName, int age) {
        this.myName = myName;
        this.age = age;
        // BUG: ConstructorCallsOverridableMethod
        list.add(getMyName());
    }

    public String getMyName() {
        return myName;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ConstructorCallsOverridableMethod obj = new ConstructorCallsOverridableMethod("John", 25);
        System.out.println(obj.list);
    }
}

// Mutant 3: Renamed 'age' to'myAge'
import java.util.*;

class ConstructorCallsOverridableMethod {

    private List<String> list = new ArrayList<>();
    private String name;
    private int myAge;

    public ConstructorCallsOverridableMethod(String name, int myAge) {
        this.name = name;
        this.myAge = myAge;
        // BUG: ConstructorCallsOverridableMethod
        list.add(getName());
    }

    public String getName() {
        return name;
    }

    public int getMyAge() {
        return myAge;
    }

    public static void main(String[] args) {
        ConstructorCallsOverridableMethod obj = new ConstructorCallsOverridableMethod("John", 25);
        System.out.println(obj.list);
    }
}