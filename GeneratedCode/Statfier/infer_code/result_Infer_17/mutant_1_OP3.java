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
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in ServiceOnUIThread.");
    }
    return mBinder;
  }

  void transactBad() {
    try {
      mBinder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  // Method to provide a dynamic condition
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
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in IntentServiceNotOnUIThread.");
    }
  }

  void transactOk() {
    try {
      mBinder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}