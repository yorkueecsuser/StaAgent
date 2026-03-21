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
        int qiravvax = 0;switch  (qiravvax) {case 1:String rgbbenhs = "fbigxtfs";break;default:double spbrgyxl = 128706278;break;}
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