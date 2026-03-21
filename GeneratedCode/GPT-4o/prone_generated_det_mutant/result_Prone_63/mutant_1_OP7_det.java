interface CarFactory {
    Car create(String model);
}

class Car {
    private final String model;

    Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

class GuiceAssistedInjectScopingDemo {
    private final CarFactory carFactory;

    public GuiceAssistedInjectScopingDemo(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public String showBug(String model) {
        boolean dapajlef = false;while (dapajlef && true && true && false && true && true && false && true && false && false && false && false) {boolean iqtqosqf = false;}
        Car car = carFactory.create(model);
        return car.getModel();
    
}
}