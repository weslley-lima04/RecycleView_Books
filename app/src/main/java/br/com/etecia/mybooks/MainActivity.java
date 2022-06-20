package br.com.etecia.mybooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Declarar a variável global do recyclerview
    RecyclerView listaLivros;

    List<Books> books;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //apresentando o xml para o java
        listaLivros = findViewById(R.id.idRecyclerViewLivros);

        //Criar a lista dos livros
        books = new ArrayList<>();

       books.add(new Books(
               "Iracema",
               "Cultura",
               "Livro de história",
               R.drawable.iracema
       ));





        //implementando o layout que será utilizado
        listaLivros.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        //otimizar a lista quando for chamada
        listaLivros.hasFixedSize();

        //carregar o adaptador ao RecyclerView
        //listaLivros.setAdapter();

    }
}