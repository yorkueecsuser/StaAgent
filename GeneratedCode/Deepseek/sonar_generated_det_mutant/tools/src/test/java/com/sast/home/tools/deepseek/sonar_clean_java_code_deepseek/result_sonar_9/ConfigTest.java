import org.junit.Test;
import static org.junit.Assert.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ConfigTest {

    private Config config = new Config();

    // TRIGGER BUG: Beans in "@Configuration" class should have different names
    @Test
    public void testShowBug() {
        config.showBug();
    }

    // Config class
    @Configuration
    public class Config {

        @Bean
        public A a() {
            return new A();
        }

        @Bean
        public B b() {
            return new B();
        }

        @Bean
        public C anotherA() { // FIXED: Beans in "@Configuration" public class should have different names
            return new C();
        }

        public class A {}

        public class B {}

        public class C {}

        public A showBug() {
            return anotherA();
        }
    }
}