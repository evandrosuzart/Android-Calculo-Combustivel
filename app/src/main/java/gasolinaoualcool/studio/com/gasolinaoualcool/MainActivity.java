package gasolinaoualcool.studio.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText)findViewById(R.id.id_preco_alcool);
        precoGasolina = (EditText) findViewById(R.id.id_preco_gasolina);
        botaoVerificar = (Button) findViewById(R.id.id_botao_verificar);
        textoResultado = (TextView) findViewById(R.id.id_resultado_2);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //receber os valores digitados
                String textoAlcool = precoAlcool.getText().toString();
                String textoGasolina = precoGasolina.getText().toString();
                double valorGasolina ;
                double valorAlcool ;
                double resultado;

                if(textoAlcool.isEmpty()||textoGasolina.isEmpty()){
                    precoGasolina.setText("");
                    precoAlcool.setText("");
                }else{
                    valorGasolina = Double.parseDouble(textoGasolina);
                    valorAlcool = Double.parseDouble(textoAlcool);
                    resultado = valorAlcool/valorGasolina;

                    if(resultado>=0.7){
                        textoResultado.setText("É melhor abastecer com Gasolina");
                    }else{
                        textoResultado.setText("É melhor abastecer com Álcool");
                    }
                }


            }
        });

    }
}
