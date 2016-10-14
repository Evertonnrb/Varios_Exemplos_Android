package br.com.fabricadeprogramador.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by Everton on 14/10/2016.
 */
public class SwitchRadios extends Activity {
    //instanciando os botao da view
    private RadioGroup radio_group;
    private RadioButton radioButton;
    private TextView textView;
    private Switch controleswitch;
    private Layout fundoTela;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch_radio);

        radio_group = (RadioGroup)findViewById(R.id.radio_group);
        textView = (TextView)findViewById(R.id.textView);
        controleswitch = (Switch)findViewById(R.id.switch1);

        controleswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    controleswitch.setText("Ligado");

                else
                    controleswitch.setText("Deslidado");
            }
        });
        radio_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton:
                        textView.setText("Primeira opção");
                        break;
                    case R.id.radioButton2:
                        textView.setText("Segundo opção");
                        break;
                    case R.id.radioButton3:
                        textView.setText("Terceira opção");
                        break;
                }
            }
        });
    }
}
