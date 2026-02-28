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
    // Inserting unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 1:
        // This case is unreachable because getUnreachableCondition() never returns 1
        System.out.println("This is unreachable");
        break;
      default:
        // Default case to ensure switch is not empty
        break;
    }
  }

  private int getUnreachableCondition() {
    // This method always returns 0, making the switch statement unreachable
    return 0;
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
    // Inserting unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition? 1 : 0) {
      case 1:
        // This case is unreachable because getUnreachableCondition() never returns true
        System.out.println("This is unreachable");
        break;
      default:
        // Default case to ensure switch is not empty
        break;
    }
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}