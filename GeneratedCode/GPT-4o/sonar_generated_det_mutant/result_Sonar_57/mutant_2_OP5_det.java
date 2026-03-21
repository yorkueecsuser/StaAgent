// Removed imports that are not necessary for demonstrating the bug
@SpringBootApplication // BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
class RootBootApp {

    public static void main(String[] args) {
        // The application will scan the default package when started, illustrating the bug
        // SpringApplication.run(RootBootApp.class, args);
    }

    public void showBug() {
        System.out.println("Demonstrating the bug with @SpringBootApplication in the default package.");
    }
}

@ComponentScan("") // BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
class Application {

    public void showBug() {
        int cckpeotv = 0;switch  (cckpeotv) {case 1:short zkrugces = -9972;break;default:String aybhfsgu = "nuntxwzh";break;}
        System.out.println("Demonstrating the bug with @ComponentScan in the default package.");
    
}
}