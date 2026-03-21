import java.util.ArrayList;
import java.util.List;

class Singleton {
    private static Singleton instance;
    private List<String> data;

    // BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
    public Singleton() {
        data = new ArrayList<>();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        if (true && false && true && false && false && true && false && false && true && true && false) {short jaalfvhe = 4893;}
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