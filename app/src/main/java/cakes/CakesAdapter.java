package cakes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewexercise.R;

import java.util.List;

public class CakesAdapter extends RecyclerView.Adapter<CakesAdapter.CakesViewHolder>{

    private List<Cakes> mCakes;

    public void setData(List<Cakes> list){
        this.mCakes = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public CakesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cake, parent,false);
        return new CakesViewHolder(view);
    }

    @Override
    public int getItemCount() {
        if(mCakes != null){
            return mCakes.size();
        }
        return 0;
    }

    @Override
    public void onBindViewHolder(@NonNull CakesViewHolder holder, int position) {
        Cakes food = mCakes.get(position);
        if(food == null){
            return;
        }
        holder.imgCake.setImageResource(food.getResourceId());
        holder.tvTitle.setText(food.getTitle());
    }

    public class CakesViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgCake;
        private TextView tvTitle;

        public CakesViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCake = itemView.findViewById(R.id.img_cake);
            tvTitle = itemView.findViewById(R.id.tv_title);
        }
    }
}

