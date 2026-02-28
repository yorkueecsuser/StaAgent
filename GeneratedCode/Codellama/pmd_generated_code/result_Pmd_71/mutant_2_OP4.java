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

    public void addData(String data) {
        this.data.add(data);
    }

    public List<String> getData() {
        return data;
    }

    public static void main(String[] args) {
        SingletonClassReturningNewInstance.getInstance().addData("first");
        SingletonClassReturningNewInstance.getInstance().addData("second");
        SingletonClassReturningNewInstance.getInstance().addData("third");

        List<String> data = SingletonClassReturningNewInstance.getInstance().getData();
        System.out.println(data);

        SingletonClassReturningNewInstance.getInstance().addData("fourth");
        SingletonClassReturningNewInstance.getInstance().addData("fifth");
        SingletonClassReturningNewInstance.getInstance().addData("sixth");

        data = SingletonClassReturningNewInstance.getInstance().getData();
        System.out.println(data);
    }

    // Mutated code starts
    public static boolean getCondition() {
        return false;
    }

    public void addData(String data, boolean condition) {
        if (condition) {
            this.data.add(data);
        }
    }

    public List<String> getData(boolean condition) {
        if (condition) {
            return data;
        }
        return null;
    }

    public static void main(String[] args, boolean condition) {
        SingletonClassReturningNewInstance.getInstance().addData("first", condition);
        SingletonClassReturningNewInstance.getInstance().addData("second", condition);
        SingletonClassReturningNewInstance.getInstance().addData("third", condition);

        List<String> data = SingletonClassReturningNewInstance.getInstance().getData(condition);
        System.out.println(data);

        SingletonClassReturningNewInstance.getInstance().addData("fourth", condition);
        SingletonClassReturningNewInstance.getInstance().addData("fifth", condition);
        SingletonClassReturningNewInstance.getInstance().addData("sixth", condition);

        data = SingletonClassReturningNewInstance.getInstance().getData(condition);
        System.out.println(data);
    }
    // Mutated code ends
}