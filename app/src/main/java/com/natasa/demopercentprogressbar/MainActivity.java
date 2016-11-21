package com.natasa.demopercentprogressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.SeekBar;

import com.natasa.progresspercent.CircularProgress;
import com.natasa.progresspercent.LineProgress;
import com.natasa.progresspercent.OnProgressTrackListener;


public class MainActivity extends AppCompatActivity {

    private CircularProgress circularProgress;
    private LineProgress lineProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final SeekBar seekBar = (SeekBar) findViewById(R.id.seekbar);
        initProgressBars();
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                circularProgress.setProgress(progress);
                lineProgress.setProgress(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    private void initProgressBars() {
        circularProgress = (CircularProgress) findViewById(R.id.circular);
        lineProgress = (LineProgress) findViewById(R.id.line);
        lineProgress.setRoundEdge(true);
        lineProgress.setShadow(true);
        circularProgress.setTypeface("Roboto-Regular.ttf");

        //methods that can be used for both progress views
        //circularProgress.setTypeface("Roboto-Regular.ttf");
        // lineProgress.setBackgroundColor(Color.LTGRAY);
        // lineProgress.setProgressColor(Color.GREEN);
        // lineProgress.setTextColor(Color.BLACK);
        // circularProgress.setTextSize(30);
        // circularProgress.setBackgroundStrokeWidth(10);
        // circularProgress.setProgressStrokeWidth(15);
        //circularProgress.setRoundEdge(true);
        //circularProgress.setShadow(true);
        circularProgress.setOnProgressTrackListener(new OnProgressTrackListener() {
            @Override
            public void onProgressFinish() {
            }

            @Override
            public void onProgressUpdate(int progress) {
            }
        });
    }
}
