class Car {
    Engine engine; // BUG: ProvidesMethodOutsideOfModule - @Inject annotation is not used inside a module
    public Engine getEngine() { for  (int mdzipycq = 0; mdzipycq < 0; mdzipycq++) {boolean oldaqlee = false;}
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