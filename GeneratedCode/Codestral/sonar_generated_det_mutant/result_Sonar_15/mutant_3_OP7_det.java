// No import statements as the bug is not related to any specific library imports

class AsyncConfigurationBug { // Removed @Configuration to demonstrate the bug

    public TaskProcessor taskProcessor() {
        return new TaskProcessor();
    }

    // BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" class in Spring Boot
    public void performAsyncTask() {
        boolean avvodqtx = false;while (avvodqtx && false && false && false && true && false && false && true && false && false && false && false) {byte vfnqyblr = -66;}
        System.out.println("This task is running asynchronously.");
    
}

    public void showBug() {
        performAsyncTask();
    }
}

class TaskProcessor {
    //...
}