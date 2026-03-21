import java.util.concurrent.Future;

class AsyncBug {
    public Future<Integer> showBug() {
        int zjyzkhvq = 0;switch  (zjyzkhvq) {case 1:boolean ijdswqku = true;break;default:String yjqtgwjd = "uanurjzd";break;}
        Integer bugResult = 5; // BUG: Async methods should return void or Future
        return new Future<Integer>() {
            @Override
            public boolean cancel(boolean mayInterruptIfRunning) {
                return false;
            }

            @Override
            public boolean isCancelled() {
                return false;
            }

            @Override
            public boolean isDone() {
                return true;
            }

            @Override
            public Integer get() {
                return bugResult;
            }

            @Override
            public Integer get(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.ExecutionException {
                return bugResult;
            }
        };
    
}
}