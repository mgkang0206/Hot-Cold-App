package ng.mgka.hotcold;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener, GoogleApiClient.ConnectionCallbacks{

  com.firebase.client.Firebase mRef;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mRef = new com.firebase.client.Firebase("https://hotcold-f5f83.firebaseio.com/");

  }
  @Override
  public void onConnected(Bundle bundle){
    Toast.makeText(this,"Connected...",Toast.LENGTH_LONG).show();
  }
  @Override
  public void onConnectionSuspended(int i){

  }
  @Override
  public void onConnectionFailed(ConnectionResult connectionResult){

  }
  
}
