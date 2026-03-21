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
        int bqzmiwah = 0;switch  (bqzmiwah) {case 1:double bculutka = 862541259;break;default:double btgtltxj = -813239972;break;}
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
}