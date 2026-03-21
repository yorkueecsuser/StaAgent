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
        if (false && true && false && false && true && true && false && true && true && false && false) {char epaoaagl = 'v';}else{short vbojkssd = -4603;}
        Car car = carFactory.create(model);
        return car.getModel();
    
}
}