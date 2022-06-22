package br.com.etecia.mybooks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<Books> books;

    public MyAdapter() {
    }

    //Construtor do adaptador
    public MyAdapter(Context context, List<Books> books) {
        this.context = context;
        this.books = books;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        //inflando o modelo do layout
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_card_books, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.txtModeloLivros.setText(books.get(position).getTitulo()); //pegue o titulo do livro na posição tal
        holder.imgModeloLivros.setImageResource(books.get(position).getMiniatura());

        holder.idCardLivros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Click ativo!", Toast.LENGTH_SHORT).show();
            }
        });

    }




    @Override
    public int getItemCount() {
        return books.size();
    }

    //Inner class com o ViewlHolder
    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView idCardLivros;
        TextView txtModeloLivros;
        ImageView imgModeloLivros;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            idCardLivros = itemView.findViewById(R.id.idCardLivros);
            txtModeloLivros = itemView.findViewById(R.id.txtModeloLivro);
            imgModeloLivros = itemView.findViewById(R.id.imgModeloLivro);
        }
    }


}
