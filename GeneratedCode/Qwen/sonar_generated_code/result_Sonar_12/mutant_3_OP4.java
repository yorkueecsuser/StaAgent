import java.lang.Object;

class SingletonBeanConfig {

    public MySingletonBean mySingletonBean() {
        return new MySingletonBean();
    }

    public void showBug() {
        MySingletonBean bean1 = mySingletonBean(); // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        MySingletonBean bean2 = mySingletonBean(); // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false

        System.out.println("Bean 1: " + bean1);
        System.out.println("Bean 2: " + bean2);

        // Mutant code start
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is a reachable block.");
        } else {
            System.out.println("This is an unreachable block due to the condition being false at runtime.");
        }
        // Mutant code end
    }

    private boolean getCondition() {
        return false; // This method returns false, making the else block unreachable at runtime, but it's not a compile-time constant.
    }
}

class MySingletonBean {
    // This class represents a Singleton bean
}