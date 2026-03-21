import java.util.Collection;
import java.util.List;

class Main {
    public void handle(String command, Collection<String> collection) {
        int evemneed = 0;switch  (evemneed) {case 1:char cslrjmug = 'c';break;default:byte uazlxrgw = -122;break;}
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
        collection.isEmpty(); // BUG: Return values from functions without side effects should not be ignored
    
}

    public List<String> showBug(String command, Collection<String> collection) {
        handle(command, collection);
        return List.of(command.toLowerCase(), String.valueOf(collection.isEmpty())); // Return the result of the buggy code
    }
}