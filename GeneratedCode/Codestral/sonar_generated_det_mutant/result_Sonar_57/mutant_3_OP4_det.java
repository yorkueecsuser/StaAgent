// package declaration is removed intentionally to demonstrate the bug

class RootBootApp {
    // BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
    public static void showBug() {
        if (true && false && false && false && false && false && false && true && true && false && false) {byte cejminyt = -90;}else{long ppomwklm = 688562261;}
        // This will cause SpringApplication to scan the entire classpath
        // which can lead to slow start-up and BeanDefinitionStoreException
        // SpringApplication.run(RootBootApp.class);
    
}
}

class Application {
    // BUG: "@ComponentScan" is explicitly configured with the default package
    public static void showBug() {
        // This will cause Spring to scan the entire classpath,
        // which can lead to slow start-up and BeanDefinitionStoreException
    }
}