import java.util.ArrayList;
import java.util.List;

class Singleton {
    private static Singleton instance;
    private List<String> data;

    public Singleton() {
        data = new ArrayList<>();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void addData(String data) {
        this.data.add(data);
    }

    public List<String> getData() {
        return data;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = new Singleton();

        s1.addData("Hello");
        s2.addData("World");

        System.out.println(s1.getData());
        System.out.println(s2.getData());
    }
}

// Unreachable if-else statement mutant
class SingletonMutant {
    private static SingletonMutant instance;
    private List<String> data;

    public SingletonMutant() {
        data = new ArrayList<>();
    }

    public static SingletonMutant getInstance() {
        if (instance == null) {
            instance = new SingletonMutant();
        }
        return instance;
    }

    public void addData(String data) {
        this.data.add(data);
    }

    public List<String> getData() {
        return data;
    }

    public static void main(String[] args) {
        SingletonMutant s1 = SingletonMutant.getInstance();
        SingletonMutant s2 = new SingletonMutant();

        s1.addData("Hello");
        s2.addData("World");

        System.out.println(s1.getData());
        System.out.println(s2.getData());
    }
}