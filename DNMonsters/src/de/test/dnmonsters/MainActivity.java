package de.test.dnmonsters;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import org.andengine.engine.options.EngineOptions;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.BaseGameActivity;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
public class GameActivity extends BaseGameActivity
{
	public EngineOptions onCreateEngineOptions()
	{
		return null;
	}
	
	public void onCreateResources(OnCreateResourcesCallback pOnCreateResourcesCallback) throwss IOException
	{
	
	}
	public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback) throws IOException
	{
	
	}
	public void onPopulateScene(Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback) throws IOException
	{
	
	}
}
@Override
public Engine onCreateEngine (EngineOptions pEngineOptions)
{
	return new LimitedFPSEngine(pEngineOptions, 60);
}
private Camera camera;

public EngineOptions onCreateEngineOptions()
{
	camera = new camera(0, 0, 800, 480);
	EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.LANDSCAPE_FIXED, new RationResolutionPolicy(800, 480), this.camera);
	engineOptions.getAudioOptions().setNeesdMusic(true).setNeedsSound(true);
	engineOptions.setWakeLockOptions(WakeLockOptions.SCREEN_ON);
	return engineOptions;
}
