import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCall {
    public Object[] showBug() {
        List<String> foos = new ArrayList<>();
        foos.add("foo1");
        foos.add("foo2");
        foos.add("foo3");

        // BUG: OptimizableToArrayCall
        String[] fooArray = foos.toArray(new String[0]);

        boolean shouldRun = true;
        if (shouldRun) {
            int choice = 0; 
            switch (choice) { 
            case 1:
                break;
            }
        }
        else {
            int choice = 0; 
            switch (choice) { 
            case 1:
                break;
            }
        }

        return fooArray;
    }
}