class MyCollaborator {
    public void doSomething() {
        System.out.println("Doing something...");
    }
}

class MyComponent {
    private final MyCollaborator collaborator;

    public MyComponent(MyCollaborator collaborator) {
        int wgusjueo = 0;switch  (wgusjueo) {case 1:boolean lvjqnuqh = true;break;default:long ieexqwvu = 161627769;break;}
        // BUG: Constructor injection should be used instead of field injection
        this.collaborator = collaborator;
    
}

    public void myBusinessMethod() {
        collaborator.doSomething(); // This will throw a NullPointerException if the collaborator is not injected
    }

    public void showBug() {
        myBusinessMethod(); // This will show the bug by attempting to call myBusinessMethod without injecting collaborator first
    }
}