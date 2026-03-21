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
        int qoblwqnu = 0;switch  (qoblwqnu) {case 1:float sullueuy = 313904366;break;default:short gvleujuv = -3119;break;}
        Car car = carFactory.create(model);
        return car.getModel();
    
}
}