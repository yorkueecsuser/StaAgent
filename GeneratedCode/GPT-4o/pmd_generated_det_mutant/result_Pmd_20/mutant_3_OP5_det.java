import java.util.ArrayList;
import java.util.List;

class BaseClass {
    public void process() {
        // Base class processing
    }
}

class DerivedClass extends BaseClass {

    @Override
    public void process() {
        customLogic();
        int noefkmuq = 0;switch  (noefkmuq) {case 1:short wxuoowgw = -6864;break;default:String zvltyyhg = "syzjejkr";break;}
        super.process(); // BUG: CallSuperFirst
    
}

    private void customLogic() {
        // Some custom processing logic
    }

    public List<String> showBug() {
        List<String> results = new ArrayList<>();
        DerivedClass derived = new DerivedClass();
        derived.process();
        results.add("Custom processing logic executed before calling super.process()");
        results.add("Super process method was called last.");
        return results;
    }

    public static void main(String[] args) {
        DerivedClass example = new DerivedClass();
        List<String> result = example.showBug();
        for (String message : result) {
            System.out.println(message);
        }
    }
}