package br.com.fabricadeprogramador.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Everton on 14/10/2016.
 */
public class TabWidget extends Activity{
    //Criando uma variavel global
    private  TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setando a view
        setContentView(R.layout.tab_widget);
        Toast.makeText(TabWidget.this,"Exemplo Tab Widget",Toast.LENGTH_SHORT).show();
        //Limpando o texto do TextWiew
        TextView tx = (TextView)findViewById(R.id.resultado);
        tx.setText("");

        Button btFor = (Button) findViewById(R.id.btnfor);
        btFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
   }
    public void clickFor(View v){
        tx.setText("");
        //Setando uma cor inicial
        tx.setBackgroundColor(Color.RED);
        for(int i=0;i<=10;i++){
            //Convertendo uma string para int
            String x = Integer.toString(i);
            //armazenando
            tx.append("Para 0 a "+x+ " \n");
            //dando um refresh e desenhando o x
            tx.refreshDrawableState();
        }
    }
}
