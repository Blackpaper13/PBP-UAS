package com.calvindo.aldi.sutanto.tubes.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.calvindo.aldi.sutanto.tubes.Database.DatabaseClient;
import com.calvindo.aldi.sutanto.tubes.KostOnMAP;
import com.calvindo.aldi.sutanto.tubes.databinding.CardviewBinding;
import com.calvindo.aldi.sutanto.tubes.models.Kost;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    List<Kost> mData;
    private Context mContext;

    public RecyclerViewAdapter(Context context, List<Kost> mData) {
        this.mContext = context;
        this.mData = mData;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        CardviewBinding cardviewBinding = CardviewBinding.inflate(layoutInflater, parent, false);

//        SharedPreferences sharedPreferences = mContext.getSharedPreferences("pref", Context.MODE_PRIVATE);

        return new MyViewHolder(cardviewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Kost kost = mData.get(position);
        holder.cardviewBinding.setKost(kost);
        holder.cardviewBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        String nama,kota,alamat,latitude,longitude,hp,image;
        int status, id;
        double cost;
        CardviewBinding cardviewBinding;

        public MyViewHolder(@NonNull CardviewBinding cardviewBinding) {

            super(cardviewBinding.getRoot());
            this.cardviewBinding = cardviewBinding;

            cardviewBinding.btnFav.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d(TAG,"onClick: " + mData.get(getAdapterPosition()) );

                    id = mData.get(getAdapterPosition()).getId();

                    if (mData.get(getAdapterPosition()).getStatus() == 0){
                        mData.get(getAdapterPosition()).setStatus(1);
                        status = mData.get(getAdapterPosition()).getStatus();
                        update(id,1);
                        Toast toast = Toast.makeText(view.getContext(), "Successfully added to favorite", Toast.LENGTH_SHORT);
                        toast.show();
                    }else {
                        mData.get(getAdapterPosition()).setStatus(0);
                        status = mData.get(getAdapterPosition()).getStatus();
                        update(id,0);
                        Toast toast = Toast.makeText(view.getContext(), "Successfully removed to favorite", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            });

            cardviewBinding.btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    latitude = mData.get(getAdapterPosition()).getLatitude();
                    longitude = mData.get(getAdapterPosition()).getLongitude();
                    Intent intent = new Intent(view.getContext(), KostOnMAP.class);
                    intent.putExtra("LONGITUDE", longitude);
                    intent.putExtra("LATITUDE", latitude);
                    view.getContext().startActivity(intent);
                }
            });
        }

        public void update(final int id, final int status){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Kost kost = DatabaseClient.getInstance(mContext)
                            .getDatabase().kostDAO().findkostbyid(id);

                    kost.setStatus(status);

                    DatabaseClient.getInstance(mContext).getDatabase()
                            .kostDAO().update(kost);
                }
            }).start();
        }
    }
}
