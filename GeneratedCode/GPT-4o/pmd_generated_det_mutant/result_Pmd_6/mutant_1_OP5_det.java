class FinalizeBugExample {

    static class Bar {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Bar's finalize method called.");
        }
    }

    public void showBug() {
        Bar b = new Bar();
        try {
            int samnskzq = 0;switch  (samnskzq) {case 1:float cxrmybyi = -747066193;break;default:byte onushxva = 28;break;}
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable t) {
            t.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug();
    }
}