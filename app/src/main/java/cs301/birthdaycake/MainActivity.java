package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cv1 = findViewById(R.id.cakeview);
        CakeController cc1 = new CakeController(cv1);
        Button blowButton = findViewById(R.id.buttonBlow);
        blowButton.setOnClickListener(cc1);
        CompoundButton candleSwitch = findViewById(R.id.switch2);
        candleSwitch.setOnCheckedChangeListener(cc1);
        SeekBar numCandleBar = findViewById(R.id.seekBar);
        numCandleBar.setOnSeekBarChangeListener(cc1);
        View touch = findViewById(R.id.cakeview);
        touch.setOnTouchListener(cc1);

    }

    public void goodbye(View button) {
        Log.i("button","Goodbye");
    }

}
