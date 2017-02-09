package com.ridho.qalbi.listfilm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    private String [] filmtitles = {"The thor" , "harry Pottret", "Insektifora",
//    "League of Legends", "DJ Masmellow", "Listanik", "Captain Tsubasa", "Doctor Gila",
//    "X-Men Apolobulan", "Piggy Island", "Larvangers", "Final Fantasi XY"};
//
    private ArrayList<Movie> movies = new ArrayList<>();

    private void initMovies(){
        movies.add(new Movie("The Thor", "Film Tentang Superhero Thor yang menyerang bumi", 7.5, 2009));
        movies.add(new Movie("Harry Potret", "Film yang menceritakan photo gapher penyihir", 5, 2005));
        movies.add(new Movie("Insektifora", "Film yang menceritakan si manusia serangga", 8, 2012));
        movies.add(new Movie("League of legends", "Film yang menceritakan peperangan di Land of Warior", 11.3, 2016));
        movies.add(new Movie("Dragon Volowers", "Film yang menceritakan seorang alayer mencari folowers", 3.1, 2017));
        movies.add(new Movie("Listenik", "Film yang mennceritakan tutorial berhijab", 8.2, 2009));
        movies.add(new Movie("Captain Tshubasa", "Film yang menceritakan perjuangan sepakbola", 7.5, 2003));
        movies.add(new Movie("Doctor de vario", "Film yang menceritakan asalmula motor Vario", 5.5, 2005));
        movies.add(new Movie("X-Men Apolobulan", "Film yang menceritakan pertarungan X-Men di bulan", 7.2, 2020));
        movies.add(new Movie("Piggy Island", "Film yang menceritakan keceharian pulau Piggy", 12, 2020));
        movies.add(new Movie("Lavangers", "Film yang menceritakan pasukan superhero Larvager melawan alien", 7.5, 2009));
        movies.add(new Movie("Newbie Fantasi XW", "Film yang menceritakan pemain baru yang noob", 6.5, 2009));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMovies();
        ArrayAdapter<Movie>adapter = new ArrayAdapter<Movie>(this, android.R.layout.simple_list_item_1,movies);
        ListView listView = (ListView) findViewById(R.id.list_film);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Movie selectedMovie = movies.get(position);
                Intent intent = new Intent(getBaseContext(), DetailActivity.class);
                intent.putExtra("com.ridho.qalbi.listfilm", selectedMovie);
                startActivity(intent);
            }
        });
    }
}
