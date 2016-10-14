package br.com.fabricadeprogramador.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;

/**
 * Created by Everton on 14/10/2016.
 */
public class Barrinha extends Activity {
    protected static final int TIMER_RUNTIME = 1000;
    protected boolean mbActivite;
    protected ProgressBar progres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_bar);

        progres = (ProgressBar) findViewById(R.id.barrinha);

        final Thread timerThread = new Thread() {
            @Override
            public void run() {
                mbActivite = true;
                try {
                    int waited = 0;
                    while (mbActivite && (waited < TIMER_RUNTIME)) {
                        sleep(200);
                        if (mbActivite) {
                            waited += 200;
                            updateProgress(waited);
                        }
                    }
                } catch (InterruptedException e) {

                } finally {
                    onContinue();
                }
            }
        };
        timerThread.start();
    }

    public void updateProgress(final int timePassed) {
        if (null != progres) {
            final int progress = progres.getMax() * timePassed / TIMER_RUNTIME;
            progres.setProgress(progress);
        }

    }

    public void onContinue() {

    }
}

