package br.com.fabricadeprogramador.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button)findViewById(R.id.btn01);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = (EditText)findViewById(R.id.txt);
                Toast.makeText(MainActivity.this, "Redirecionando", Toast.LENGTH_SHORT).show();
                //Criando o objeto de navegação
                Intent red = new Intent(MainActivity.this,SegundaTela.class);
                //dando start a inteçao de ir para outra activity
                //Usando o Bundle é possivel levar mais parametros[
                //Bundle b = new Bundle();
                //bundle.putDouble("",algum double);
                startActivity(red);
            }
        });
        Button bt2 = (Button)findViewById(R.id.btn02);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redireciona = new Intent(MainActivity.this,TabWidget.class);
                startActivity(redireciona);
            }
        });

        Button bt3 = (Button)findViewById(R.id.btn_switch_radio);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirecionamento = new Intent(MainActivity.this,SwitchRadios.class);
                startActivity(redirecionamento);
            }
        });

      /*
      *
      *   Button bt4 = (Button)findViewById(R.id.barrinha);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirecionameto = new Intent(MainActivity.this,Barrinha.class);
                startActivity(redirecionameto);
            }
        });

      *
      *
      * */

    }





}
