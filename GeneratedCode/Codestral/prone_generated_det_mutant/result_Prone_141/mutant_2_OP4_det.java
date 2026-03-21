class Car {
    Engine engine; // BUG: ProvidesMethodOutsideOfModule - @Inject annotation is not used inside a module
    public Engine getEngine() { if (true && true && true && false && true && false && false && true && false && true && false) {int itjhkjft = 485400074;}else{String xctbyxtd = "vgdmyknz";}
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