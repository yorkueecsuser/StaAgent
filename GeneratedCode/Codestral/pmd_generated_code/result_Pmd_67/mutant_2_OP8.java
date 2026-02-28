import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    // BUG: ReturnEmptyCollectionRatherThanNull
    public List<String> getNames() {
        List<String> nms = null; // Renamed variable 'names' to 'nms'

        // Simulating some condition where no names are available
        boolean noNamesAvailable = true;

        if (noNamesAvailable) {
            return nms;
        } else {
            nms = new ArrayList<>();
            // Add names to the list
            //...
            return nms;
        }
    }

    public void showBug() {
        List<String> nms = getNames(); // Renamed variable 'names' to 'nms'
        if (nms!= null) {
            System.out.println("Number of names: " + nms.size());
        } else {
            System.out.println("Names list is null!");
        }
    }
}