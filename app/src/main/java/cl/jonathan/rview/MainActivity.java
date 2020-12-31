package cl.jonathan.rview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView RecyclerLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerLista = (RecyclerView) findViewById(R.id.RecyclerLista);
        ArrayList<DataModel> ListItem = new ArrayList<>();
        RecyclerLista.setLayoutManager(new LinearLayoutManager(this));
        RecyclerLista.setAdapter(new DataAdapter(ListItem));
        char letra = 'a';
        for (int i = 0; i < 30; i++) {
            DataModel row = new DataModel();
            row.setAlbum("Album " + letra);
            row.setArtista("Artista" + "AA" + letra);
            row.setTitulo("Titulo" + "CC" + letra);
            row.setImagenAlbum(R.drawable.a);
            ListItem.add(row);
            letra++;

        }

    }
}