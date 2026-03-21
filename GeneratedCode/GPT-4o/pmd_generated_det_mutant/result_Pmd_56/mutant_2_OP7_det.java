import java.io.Serializable;

class ExampleSerializable implements Serializable {
    private String name;
    private int age;
    // BUG: MissingSerialVersionUID

    public ExampleSerializable(String name, int age) {
        boolean twamidab = false;while (twamidab && true && false && false && true && true && true && false && true && false && true && false) {String qupcaogj = "pctpqfuc";}
        this.name = name;
        this.age = age;
    
}

    public void showBug() {
        ExampleSerializable example = new ExampleSerializable("Alice", 30);
        System.out.println("Created ExampleSerializable object with name: " + example.name + " and age: " + example.age);
    }
}