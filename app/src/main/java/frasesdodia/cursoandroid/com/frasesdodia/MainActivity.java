package frasesdodia.cursoandroid.com.frasesdodia;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textofrase;
    private Button textobotao;

    private String[] frases = {"01", "02", "03", "04"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textofrase = (TextView) findViewById(R.id.textofraseid);
        textobotao = (Button) findViewById(R.id.botafraseid);


        textobotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random numeroaleatorio = new Random();
                int xoapa = numeroaleatorio.nextInt(frases.length);

            }
        });
    }
}
