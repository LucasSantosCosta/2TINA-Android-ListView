package br.com.fiap.a2tina_android_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by logonrm78785 on 23/03/2017.
 */

public class ContatoAdapter extends BaseAdapter{

    private Context context;

    private List<Contato> contatos;

    public ContatoAdapter(Context context, List<Contato> contatos) {
        this.context = context;
        this.contatos = contatos;

    }

    //Quantos itens precisa
    @Override
    public int getCount() {
        return this.contatos.size();
    }

    //Quando precisar pegar um item da lista
    @Override
    public Object getItem(int position) {
        return this.contatos.get(position);
    }

    //id para cada item, será a própria posição
    @Override
    public long getItemId(int position) {
        return 0;
    }


    //retorna a view que renderiza o elemento, a reative layout. Inflar transformar xml em Android View.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        Contato contato = this.contatos.get(position);
        View v = layoutInflater.inflate(R.layout.listview_contatos, null);
        ImageView imgContato = (ImageView) v.findViewById(R.id.imgContato);
        TextView txtNome = (TextView) v.findViewById(R.id.txtNome);
        TextView txtSobre = (TextView) v.findViewById(R.id.txtSobre);

        imgContato.setImageResource(contato.getImagem());
        txtNome.setText(contato.getNome());
        txtSobre.setText(contato.getSobre());


        return v;
    }
}
