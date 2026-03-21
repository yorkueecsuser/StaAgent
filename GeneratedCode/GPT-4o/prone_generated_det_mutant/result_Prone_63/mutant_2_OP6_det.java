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
        for  (int ncoheccq = 0; ncoheccq < 0; ncoheccq++) {double rjqzrflf = -16456450;}
        Car car = carFactory.create(model);
        return car.getModel();
    
}
}