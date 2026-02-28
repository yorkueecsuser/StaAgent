class RootBootApp {

    public static void main(String[] args) {
        // Intentionally left blank to avoid Spring Boot related imports
    }

    public String showBug() {
        return "This method demonstrates the bug by being part of a class in the default package with @SpringBootApplication and @ComponentScan"; // BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
    }
}