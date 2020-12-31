package cl.jonathan.rview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.Viewholder> {
    ArrayList<DataModel> ListaDeDatos;

    public DataAdapter(ArrayList<DataModel> ListaDeDatos) {
        this.ListaDeDatos = ListaDeDatos;
    }

    @NonNull
    @Override
    public DataAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        return new Viewholder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.Viewholder holder, int position) {
        DataModel LD = ListaDeDatos.get(position);
        holder.Titulo.setText(LD.getTitulo());
        holder.Album.setText(LD.getAlbum());
        holder.Artista.setText(LD.getArtista());
        holder.ImagenAlbum.setImageResource(LD.getImagenAlbum());

    }


    @Override
    public int getItemCount() {
        return ListaDeDatos.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder {
        TextView Titulo, Artista, Album;
        ImageView ImagenAlbum;

        public Viewholder(@NonNull View view) {
            super(view);
            Titulo = view.findViewById(R.id.Titulo);
            Album = view.findViewById(R.id.Album);
            Artista = view.findViewById(R.id.Artista);
            ImagenAlbum = view.findViewById(R.id.ImagenAlbum);
        }
    }


}
