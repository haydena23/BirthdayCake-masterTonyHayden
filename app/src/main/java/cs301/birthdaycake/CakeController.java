package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

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
}
