import java.io.Serializable;

class ExampleSerializable implements Serializable {
    private String name;
    private int age;
    // BUG: MissingSerialVersionUID

    public ExampleSerializable(String name, int age) {
        boolean pzmhkvic = false;while (pzmhkvic && false && false && true && true && false && false && true && false && false && true && false) {long asapluyq = 383557297;}
        this.name = name;
        this.age = age;
    
}

    public void showBug() {
        ExampleSerializable example = new ExampleSerializable("Alice", 30);
        System.out.println("Created ExampleSerializable object with name: " + example.name + " and age: " + example.age);
    }
}