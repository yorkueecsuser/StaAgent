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

    // Mutant 1: Unreachable while loop
    public static SingletonClassReturningNewInstance getInstanceMutant1() {
        // BUG: SingletonClassReturningNewInstance
        if (instance == null) {
            instance = new SingletonClassReturningNewInstance();
        }
        while (false) {
            // Unreachable code
            instance = new SingletonClassReturningNewInstance();
        }
        return instance;
    }

    // Mutant 2: Unreachable for loop
    public static SingletonClassReturningNewInstance getInstanceMutant2() {
        // BUG: SingletonClassReturningNewInstance
        if (instance == null) {
            instance = new SingletonClassReturningNewInstance();
        }
        for (int i = 0; false; i++) {
            // Unreachable code
            instance = new SingletonClassReturningNewInstance();
        }
        return instance;
    }
}