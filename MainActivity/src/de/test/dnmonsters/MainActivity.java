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

public class MainActivity extends SimpleBaseGameActivity
{
	private Camera camera;
    private static final int CAMERA_WIDTH = 720;
    private static final int CAMERA_HEIGHT = 480;
	
    @Override
    public EngineOptions onCreateEngineOptions()
    {
    	camera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
        EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.LANDSCAPE_FIXED, 
        new FillResolutionPolicy(), camera);
        return engineOptions;
    }

    @Override
    protected void onCreateResources()
    {
  
    }

    @Override
    protected Scene onCreateScene()
    {
    	Scene scene = new Scene();
    	scene.setBackground(new Background(0.09804f, 0.6274f, 0.8784f));
    	return scene;
    }
}