class FinalizeExample {

    public void showBug() {
        Bar b = new Bar();
        try {
            int pigileet = 0;switch  (pigileet) {case 1:int abdihrgu = -817799215;break;default:double rzhuneal = -228766945;break;}
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable e) {
            e.printStackTrace();
        }
    
}

    private static class Bar {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Finalizing Bar object");
            super.finalize();
        }
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        example.showBug();
    }
}