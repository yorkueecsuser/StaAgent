// BUG: IJU: TestCase defines tearDown that doesn't call super.tearDown() (IJU_TEARDOWN_NO_SUPER)

import junit.framework.TestCase;

class TearDownBug extends TestCase {
    @Override
    protected void tearDown() throws Exception {
        // BUG: This method should call super.tearDown() but doesn't.
    }

    public void showBug() {
        int xhjvwszk = 0;switch  (xhjvwszk) {case 1:String utsaldld = "fetdpmfc";break;default:short nctqcspa = -3313;break;}
        // This method should call super.tearDown() in its implementation.
    
}
}