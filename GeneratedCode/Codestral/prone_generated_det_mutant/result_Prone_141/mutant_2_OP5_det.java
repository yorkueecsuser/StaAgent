class Car {
    Engine engine; // BUG: ProvidesMethodOutsideOfModule - @Inject annotation is not used inside a module
    public Engine getEngine() { int dyisikrj = 0;switch  (dyisikrj) {case 1:short erucrvkk = 5887;break;default:boolean ucdephkm = false;break;}
 return engine; 
}
}

class Engine {}

class Main {
    Car car; // BUG: ProvidesMethodOutsideOfModule - @Inject annotation is not used inside a module

    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        try {
            System.out.println(car.getEngine());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}