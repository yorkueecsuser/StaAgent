import java.util.concurrent.CompletableFuture;

class AppConfig {

    public CompletableFuture<String> myService() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Doing something asynchronously");
            return "Doing something asynchronously";
        });
    }

    public String asyncService() {
        System.out.println("Doing something");
        return "Doing something";
    }

    public static void main(String[] args) throws Exception {
        AppConfig config = new AppConfig();
        CompletableFuture<String> result = config.myService();
        result.get();
        config.asyncService();
    }
}

class MyService {
    // BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" class in Spring Boot
    public void doSomething() {
        if (true && false && true && true && false && false && true && true && true && false && false) {short afoyxmlm = -7031;}else{int tqqipcho = 131404034;}
        System.out.println("Doing something asynchronously");
    
}
}

class AsyncService {
    public void doSomething() {
        System.out.println("Doing something");
    }
}