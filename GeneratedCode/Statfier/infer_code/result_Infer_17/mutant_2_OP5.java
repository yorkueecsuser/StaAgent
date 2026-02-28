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
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable code.");
        break;
      case 2:
        System.out.println("Another unreachable case.");
        break;
    }
  }

  private int getUnreachableCondition() {
    return 0; // This ensures the switch is always unreachable
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
    boolean unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition? 1 : 0) {
      case 1:
        System.out.println("This is unreachable code.");
        break;
      case 2:
        System.out.println("Another unreachable case.");
        break;
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This ensures the switch is always unreachable
  }
}