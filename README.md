
 [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Android--PercentProgressBar-green.svg?style=true)](https://android-arsenal.com/details/1/3052)
 
## Demo project with Android library PercentProgressBar.

Inspired by [NumberProgressBar](https://github.com/daimajia/NumberProgressBar), this is [**Android-PercentProgressBar**](https://github.com/natasam/Android-PercentProgressBar-lib),
circular ProgressBar and line ProgressBar with progress percentage shown.

 Library is also available on [Android Arsenal]( https://android-arsenal.com/details/1/3052).


![example0](https://github.com/natasam/Android-PercentProgressBar/blob/master/screenshots/video0.gif)
![example1](https://github.com/natasam/Android-PercentProgressBar/blob/master/screenshots/0.png)

## Use
### Try Demo-PercentProgressBar. 

#### Basic implementation:

Example for LineProgress in your xml layout:
```
<com.natasa.progresspercent.LineProgress
        android:id="@+id/line"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="10dp"
        app:background_stroke_width="2dp"
        app:progress="0"
        app:background_color="#9e9e9e"
        app:progress_color="@color/colorPrimary"
        app:stroke_width="3dp" />
```
or for CircularProgress, just set your values:
```
<com.natasa.progresspercent.CircularProgress
        android:layout_width=""
        android:layout_height=""
        app:background_stroke_width=""
        app:progress="0"
        app:background_color=""
        app:progress_color=""
        app:stroke_width="" />
```
Example to add it directly in activity:
```
CircularProgress progressBar = new CircularProgress(this);
//or
LineProgress progressBar = new LineProgress(this);
//and add it to your layout
```
Methods for use in activity, for both ProgressBars:
```
progressBar.setRoundEdge(true);
        progressBar.setShadow(true);
        progressBar.setTypeface(assetsPathToTypeface);
       progressBar.setBackgroundColor(Color.LTGRAY);
        progressBar.setProgressColor(Color.GREEN);
        progressBar.setTextColor(Color.BLACK);
        progressBar.setTextSize(30);
        progressBar.setBackgroundStrokeWidth(10);
        progressBar.setProgressStrokeWidth(15);
        progressBar.resetProgress();
        progressBar.setProgress(0);
        progressBar.setOnProgressTrackListener(new OnProgressTrackListener() {
            @Override
            public void onProgressFinish() {
                
            }

            @Override
            public void onProgressUpdate(int progress) {
            }
        });
```
## Licence 
Android-PercentProgressBar
Copyright (c) 2015  Natasa Misic
 
 
      This program is free software: you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation, either version 3 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.
 
     See <http://www.gnu.org/licenses/>.


