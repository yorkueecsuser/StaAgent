class Car {
    Engine engine; // BUG: ProvidesMethodOutsideOfModule - @Inject annotation is not used inside a module
    public Engine getEngine() { int vchaazww = 0;switch  (vchaazww) {case 1:int petqnrmt = -124164532;break;default:int smlirkxs = 136290559;break;}
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