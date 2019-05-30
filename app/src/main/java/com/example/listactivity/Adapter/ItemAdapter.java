package com.example.listactivity.Adapter;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.listactivity.R;
import com.example.listactivity.model.Item;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {


    List<Item> list;
    Context context;


    public ItemAdapter(List<Item> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());

        View view = layoutInflater.inflate(R.layout.item, viewGroup, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int i) {
        itemViewHolder.title.setText(list.get(i).getTitle());
        itemViewHolder.description.setText(list.get(i).getDescription());



        Picasso.get().load("https://i.ytimg.com/vi/PGijKuscSkk/hqdefault.jpg")
                .into(itemViewHolder.image);

    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {

        CircleImageView image;
        TextView title,description;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
        }
    }
}
