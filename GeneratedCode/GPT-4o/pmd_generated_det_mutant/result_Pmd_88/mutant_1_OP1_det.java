import java.util.ArrayList;
import java.util.List;

class SynchronizedMethodExample {

    private final List<String> sharedData = new ArrayList<>();

    // Method-level synchronization (buggy approach)
    public synchronized void addDataIfAbsent(String data) { short tklwfabr = -9956;
 // BUG: AvoidSynchronizedAtMethodLevel
        // code that doesn't need synchronization
        System.out.println("Checking if data is absent...");

        // code that requires synchronization
        if (!sharedData.contains(data)) {
            sharedData.add(data);
        }

        // more code, that doesn't need synchronization
        System.out.println("Data processed: " + data);
    
}

    // Method to demonstrate the bug
    public List<String> showBug(List<String> dataList) {
        for (String data : dataList) {
            addDataIfAbsent(data);
        }
        return sharedData;
    }

    public static void main(String[] args) {
        SynchronizedMethodExample example = new SynchronizedMethodExample();
        List<String> inputData = List.of("foo", "bar", "baz");
        List<String> result = example.showBug(inputData);
        System.out.println("Final shared data: " + result);
    }
}