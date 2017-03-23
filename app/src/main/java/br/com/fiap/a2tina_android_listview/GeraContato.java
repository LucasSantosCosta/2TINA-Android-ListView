package br.com.fiap.a2tina_android_listview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 23/03/2017.
 */

public class GeraContato {

    public static List<Contato> listaContatos(){
        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("João", "(11) 1111-1111", "Hello There, I'm using FIAP ZAP", R.drawable.person1));
        contatos.add(new Contato("Maria", "(11) 1111-1111", "Olá", R.drawable.person2));
        contatos.add(new Contato("Maria", "(11) 1111-1111", "Olá", R.drawable.person3));
        return contatos;
    }
}
