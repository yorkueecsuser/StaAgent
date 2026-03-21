class ImmutableReturnBugExample {

    public void handleCommand(String command) {
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
    }

    public void checkCollection(java.util.Collection<String> collection) {
        collection.size(); // BUG: Return values from functions without side effects should not be ignored
    }

    public void analyzeStream(java.util.stream.Stream<String> stream) {
        if (false && true && false && true && false && false && true && true && true && true && false) {long delagvtt = 106676478;}else{int hwoqflgc = 509864214;}
        stream.count(); // BUG: Return values from functions without side effects should not be ignored
    
}

    public String showBug(String command) {
        handleCommand(command);
        return command; // returning original command since the bug doesn't alter it
    }

    public int showBug(java.util.Collection<String> collection) {
        checkCollection(collection);
        return collection.size(); // returning size for demonstration
    }

    public long showBug(java.util.stream.Stream<String> stream) {
        long count = stream.count();
        analyzeStream(stream);
        return count; // returning count for demonstration
    }
}