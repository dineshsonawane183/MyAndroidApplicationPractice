package in.co.squerproducts.myapplicationpractice.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import in.co.squerproducts.myapplicationpractice.R;
import in.co.squerproducts.myapplicationpractice.entity.Movie;

public class KnowledeRecycleViewAdapter extends RecyclerView.Adapter<KnowledeRecycleViewAdapter.MyViewHolder> {

    List<Movie> movies;

    public KnowledeRecycleViewAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View ViewHolder = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_list_row, viewGroup, false);
        return new MyViewHolder(ViewHolder);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Movie movie = movies.get(i);
        myViewHolder.title.setText(movie.getTitle());
        myViewHolder.genre.setText(movie.getGenre());
        myViewHolder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.movieName);
            year = itemView.findViewById(R.id.year);
            genre = itemView.findViewById(R.id.genereName);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),movies.get(getAdapterPosition()).getTitle(),Toast.LENGTH_SHORT).show();
                    Log.d("RecyclerView", "onClick：" + getAdapterPosition());
                }
            });
        }

    }
}
