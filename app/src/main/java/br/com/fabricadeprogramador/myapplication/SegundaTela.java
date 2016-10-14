package br.com.fabricadeprogramador.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Everton on 14/10/2016.
 */
public class SegundaTela extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(this,"Nova activity",Toast.LENGTH_SHORT).show();
    }
}
