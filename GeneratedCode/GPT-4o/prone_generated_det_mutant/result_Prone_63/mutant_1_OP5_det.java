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
        int fcoybvcg = 0;switch  (fcoybvcg) {case 1:long uesosghl = -813638020;break;default:int vseqrerr = 496551480;break;}
        Car car = carFactory.create(model);
        return car.getModel();
    
}
}