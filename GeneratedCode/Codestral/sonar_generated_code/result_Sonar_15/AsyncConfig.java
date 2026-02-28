class AsyncConfig {

    private MyService myService;

    public AsyncConfig() {
        myService = new MyService();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
    @interface PostConstruct {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
    @interface Async {}

    @PostConstruct // This annotation is not directly related to javax.annotation package and can be implemented using a custom annotation.
    @Async // Bug: Use of the "@Async" annotation on methods declared within a "@Configuration" class in Spring Boot
    public void init() {
        myService.performTask();
    }

    public void showBug() {
        init();
    }
}

class MyService {
    public void performTask() {
        // Simulating a time-consuming task
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task performed");
    }
}