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
        if (true && false && false && false && false && false && false && false && true && true && false) {String nyefgvlf = "bcvgnfbv";}
        Car car = carFactory.create(model);
        return car.getModel();
    
}
}