import java.util.ArrayList;
import java.util.List;

class SingletonClassReturningNewInstance {
    private static SingletonClassReturningNewInstance instance;
    private List<String> data;

    private SingletonClassReturningNewInstance() {
        data = new ArrayList<>();
    }

    public static SingletonClassReturningNewInstance getInstance() {
        // BUG: SingletonClassReturningNewInstance
        if (instance == null) {
            instance = new SingletonClassReturningNewInstance();
        }
        return instance;
    }

    public void addData(String d) {
        this.data.add(d);
    }

    public List<String> getData() {
        return data;
    }

    public static void main(String[] args) {
        SingletonClassReturningNewInstance.getInstance().addData("first");
        SingletonClassReturningNewInstance.getInstance().addData("second");
        SingletonClassReturningNewInstance.getInstance().addData("third");

        List<String> d = SingletonClassReturningNewInstance.getInstance().getData();
        System.out.println(d);

        SingletonClassReturningNewInstance.getInstance().addData("fourth");
        SingletonClassReturningNewInstance.getInstance().addData("fifth");
        SingletonClassReturningNewInstance.getInstance().addData("sixth");

        d = SingletonClassReturningNewInstance.getInstance().getData();
        System.out.println(d);
    }
}