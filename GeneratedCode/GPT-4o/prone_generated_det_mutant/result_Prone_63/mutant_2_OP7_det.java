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
        boolean eacpsyru = false;while (eacpsyru && false && true && false && false && false && false && false && false && true && false && false) {long mpztnlsb = 870701983;}
        Car car = carFactory.create(model);
        return car.getModel();
    
}
}