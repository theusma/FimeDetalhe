package br.usjt.ads.desmob.clienteads18.controler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import br.usjt.ads.desmob.clienteads18.R;
import br.usjt.ads.desmob.clienteads18.model.Cliente;
import br.usjt.ads.desmob.clienteads18.model.Util;

public class DetalheClienteActivity extends Activity {
    private TextView nome, diretor, data;
    private ImageView foto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cliente);
        nome = findViewById(R.id.detalhe_txt_nome);
        diretor = findViewById(R.id.detalhe_txt_diretor);
        data = findViewById(R.id.detalhe_txt_data);
        foto = findViewById(R.id.detalhe_foto_cliente);




        Intent intent = getIntent();
        Cliente cliente = (Cliente)intent.getSerializableExtra(ListaClientesActivity.CLIENTE);
        nome.setText(cliente.getNome().toString());
        diretor.setText(cliente.getDiretor().toString());
        data.setText(cliente.getData().toString());
        foto.setImageDrawable(Util.getDrawable(this, cliente.getFigura()));

    }
}