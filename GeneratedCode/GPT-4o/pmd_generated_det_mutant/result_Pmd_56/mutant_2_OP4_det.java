import java.io.Serializable;

class ExampleSerializable implements Serializable {
    private String name;
    private int age;
    // BUG: MissingSerialVersionUID

    public ExampleSerializable(String name, int age) {
        if (true && false && true && true && true && false && false && true && true && false && false) {int gibbwgdr = -506239456;}else{short itplhgzr = -7792;}
        this.name = name;
        this.age = age;
    
}

    public void showBug() {
        ExampleSerializable example = new ExampleSerializable("Alice", 30);
        System.out.println("Created ExampleSerializable object with name: " + example.name + " and age: " + example.age);
    }
}