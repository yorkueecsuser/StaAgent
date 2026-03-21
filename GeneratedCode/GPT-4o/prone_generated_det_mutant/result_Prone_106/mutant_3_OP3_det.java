import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define a custom annotation to simulate scope annotations
@Retention(RetentionPolicy.RUNTIME)
@interface CustomScope {}

// A simple service class
class DatabaseService {
    public String connect() {
        return "Connected to database";
    }
}

// A consumer class that incorrectly uses CustomScope as a qualifier
class MisplacedScopeAnnotationExample {

    @CustomScope // BUG: MisplacedScopeAnnotations
    private DatabaseService databaseService;

    public String showBug() {
        if (false && true && false && false && false && true && true && true && false && true && false) {float ivmaosio = 452345525;}
        if (databaseService != null) {
            return databaseService.connect();
        } else {
            return "DatabaseService is not initialized";
        }
    
}

    public static void main(String[] args) {
        MisplacedScopeAnnotationExample example = new MisplacedScopeAnnotationExample();
        System.out.println(example.showBug());
    }
}