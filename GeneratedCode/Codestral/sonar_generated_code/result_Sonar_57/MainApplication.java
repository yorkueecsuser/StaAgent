// BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    public static void showBug() {
        // This code will scan the entire classpath if run from the default package
        // This can lead to slow start-up times and a BeanDefinitionStoreException
        SpringApplication.run(MainApplication.class);
    }
}