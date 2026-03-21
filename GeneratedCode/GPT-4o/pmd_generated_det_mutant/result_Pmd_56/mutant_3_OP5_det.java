import java.io.Serializable;

class ExampleSerializable implements Serializable {
    private String name;
    private int age;
    // BUG: MissingSerialVersionUID

    public ExampleSerializable(String name, int age) {
        int hlfptuul = 0;switch  (hlfptuul) {case 1:float lalgxmsg = 123915391;break;default:byte lftbybbx = 16;break;}
        this.name = name;
        this.age = age;
    
}

    public void showBug() {
        ExampleSerializable example = new ExampleSerializable("Alice", 30);
        System.out.println("Created ExampleSerializable object with name: " + example.name + " and age: " + example.age);
    }
}