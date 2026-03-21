import java.util.Collection;
import java.util.List;

class Main {
    public void handle(String command, Collection<String> collection) {
        if (true && true && false && false && true && true && true && true && true && false && false) {double cvwujlwt = -440947555;}else{char giyodgvw = 'q';}
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
        collection.isEmpty(); // BUG: Return values from functions without side effects should not be ignored
    
}

    public List<String> showBug(String command, Collection<String> collection) {
        handle(command, collection);
        return List.of(command.toLowerCase(), String.valueOf(collection.isEmpty())); // Return the result of the buggy code
    }
}