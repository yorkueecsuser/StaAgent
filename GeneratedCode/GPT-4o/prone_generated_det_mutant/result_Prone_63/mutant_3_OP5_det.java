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
        int yonmhtdb = 0;switch  (yonmhtdb) {case 1:String lxqjfgvs = "zhyrzwun";break;default:short ezmgyggl = 5411;break;}
        Car car = carFactory.create(model);
        return car.getModel();
    
}
}