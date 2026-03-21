class Car {
    Engine engine; // BUG: ProvidesMethodOutsideOfModule - @Inject annotation is not used inside a module
    public Engine getEngine() { for  (int tjdfmhtr = 0; tjdfmhtr < 0; tjdfmhtr++) {byte ypolbkid = 73;}
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