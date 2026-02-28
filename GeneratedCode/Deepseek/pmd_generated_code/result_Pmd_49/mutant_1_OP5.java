class InstantiationToGetClass {
    public Class showBug() {
        Class c = new String().getClass();
        boolean unreachable = false;
        switch(new String()) { // unreachable switch statement
            case "unreachable":
                unreachable = true;
                break;
        }
        if (unreachable == false) { /* code */ }
        return c;
    }
}