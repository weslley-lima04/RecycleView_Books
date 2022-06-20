package br.com.etecia.mybooks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<Books> books;

    public MyAdapter() {
    }

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
        holder.txtModeloLivros.setText(books.get(position).getTitulo());
        holder.imgModeloLivros.setImageResource(books.get(position).getMiniatura());
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
