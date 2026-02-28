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
}

// Insert Unreachable if-else statement mutant 
// Mutant 1: Inserting unreachable if-else branch into the main method
if(false){
    SingletonClassReturningNewInstance.getInstance().addData("mutant");
    SingletonClassReturningNewInstance.getInstance().addData("mutant");
} else {
    SingletonClassReturningNewInstance.getInstance().addData("mutant");
    SingletonClassReturningNewInstance.getInstance().addData("mutant");
}

// Insert Unreachable if-else statement mutant 
// Mutant 2: Inserting unreachable if-else branch into the getInstance method
if(false){
    return new SingletonClassReturningNewInstance();
} else {
    return instance;
}