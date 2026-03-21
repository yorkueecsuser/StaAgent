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
        if (true && false && true && false && false && true && false && false && true && false && false) {int vvvzpwmq = 601280718;}else{float tjqctomw = -814591311;}
        Car car = carFactory.create(model);
        return car.getModel();
    
}
}