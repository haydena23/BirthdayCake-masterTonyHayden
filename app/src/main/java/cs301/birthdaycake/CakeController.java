package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, SurfaceView.OnTouchListener, View.OnTouchListener {


    private CakeView cakeView1;
    private CakeModel cakeModel1;

    public CakeController(CakeView cakeViewRef) {
        cakeView1 = cakeViewRef;
        cakeModel1 = cakeView1.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        Log.d("hello","debug");
        if(cakeModel1.candleLit == true) {
            cakeModel1.candleLit = false;
        }
        else {
            cakeModel1.candleLit = true;
        }
        cakeView1.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        cakeModel1.hasCandles = b;
        cakeView1.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        cakeModel1.numCandles = progress;
        cakeView1.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        cakeModel1.xLocation = (int) motionEvent.getX();
        cakeModel1.yLocation = (int) motionEvent.getY();
        cakeView1.invalidate();


        Log.d("view", "On Touch");

        cakeModel1.hasBalloon = true;
        cakeModel1.left = (float)motionEvent.getX();
        cakeModel1.bottom = (float)motionEvent.getY();

        this.cakeView1.invalidate();
        return false;
    }
}
