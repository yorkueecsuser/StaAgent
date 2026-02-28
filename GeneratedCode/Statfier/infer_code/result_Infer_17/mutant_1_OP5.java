import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

class ServiceOnUIThread extends Service {
  private final IBinder mBinder = null;

  @Override
  public IBinder onBind(Intent intent) {
    transactBad();
    return mBinder;
  }

  void transactBad() {
    try {
      mBinder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to ensure switch is not empty and reachable
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class IntentServiceNotOnUIThread extends IntentService {
  private final IBinder mBinder = null;

  public IntentServiceNotOnUIThread() {
    super("Intent service");
  }

  @Override
  public void onHandleIntent(Intent intent) {
    transactOk();
  }

  void transactOk() {
    try {
      mBinder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to ensure switch is not empty and reachable
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}