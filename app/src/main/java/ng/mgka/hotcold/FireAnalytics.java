package ng.mgka.hotcold;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by mgkan on 2016-08-15.
 */
public class FireAnalytics extends Application {
  private Tracker mTracker;

  synchronized public Tracker getDefaultTracker() {
    if(mTracker == null){
      com.firebase.client.Firebase.setAndroidContext(this);
      GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
      mTracker = analytics.newTracker("UA-82522214-1");
    }
    return mTracker;
  }
}
