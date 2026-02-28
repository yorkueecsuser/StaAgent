// MyConfiguration.java

class MyService {
    // Define MyService class here...
}

class MyBean {
    // Define MyBean class here...
}

class MyConfiguration {

    public MyService myService() {
        return new MyService();
    } // BUG: "@Qualifier" and "@Bean" should not be used, but they are not used here intentionally for demonstration of the bug

    public MyService showBug() {
        return myService();
    }

    // Additional buggy methods can be added here...
}