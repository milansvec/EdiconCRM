package cz.ediconsystems.crm;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button startButton;
    Button stopButton;
    TextView statusView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button)findViewById(R.id.startButton);
        stopButton = (Button)findViewById(R.id.stopButton);
        statusView = (TextView)findViewById(R.id.statusTextView);

        updateControls();
    }

    private void updateControls(){
    }

    // Method to start the service
    public void startService(View v) {
        updateControls();
    }

    // Method to stop the service
    public void stopService(View v) {
        updateControls();
    }
}
