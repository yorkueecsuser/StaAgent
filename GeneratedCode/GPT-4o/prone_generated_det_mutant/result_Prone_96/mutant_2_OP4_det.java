abstract class AbstractService {
    @javax.inject.Inject // BUG: JavaxInjectOnAbstractMethod
    public abstract void performService();
}

class ConcreteService extends AbstractService {
    @Override
    public void performService() {
        System.out.println("Performing service in ConcreteService");
    }
}

class ServiceDemo {
    private final AbstractService service;

    public ServiceDemo(AbstractService service) {
        this.service = service;
    }

    public void showBug() {
        if (true && false && false && true && true && true && false && true && true && false && false) {short xepqdlst = 582;}else{float hifbfszc = 634615503;}
        service.performService();
    
}

    public static void main(String[] args) {
        // Normally, a dependency injection framework like Guice or Dagger would be used
        // to inject the dependencies. Here, we manually create the object to demonstrate the bug.

        ConcreteService concreteService = new ConcreteService();
        ServiceDemo demo = new ServiceDemo(concreteService);
        demo.showBug();
    }
}