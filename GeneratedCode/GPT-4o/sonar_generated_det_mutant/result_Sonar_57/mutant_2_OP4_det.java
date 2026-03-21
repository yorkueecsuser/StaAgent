// Removed imports that are not necessary for demonstrating the bug
@SpringBootApplication // BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
class RootBootApp {

    public static void main(String[] args) {
        // The application will scan the default package when started, illustrating the bug
        // SpringApplication.run(RootBootApp.class, args);
    }

    public void showBug() {
        if (false && true && true && false && true && false && true && true && true && true && false) {byte uyklovhw = -31;}else{String rkmkognr = "nlhhcfse";}
        System.out.println("Demonstrating the bug with @SpringBootApplication in the default package.");
    
}
}

@ComponentScan("") // BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
class Application {

    public void showBug() {
        System.out.println("Demonstrating the bug with @ComponentScan in the default package.");
    }
}