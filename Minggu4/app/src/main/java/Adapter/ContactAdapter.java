package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minggu4.R;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView {
    ArrayList<String> rvData;
    public ContactAdapter(ArrayList<String> Data) {
        rvData = Data;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtPengirim;
        public TextView txtLastChat;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtPengirim = itemView.findViewById(R.id.pengirim);
            txtLastChat = itemView.findViewById(R.id.lastchat);
        }
    }
    public RecyclerView.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_contact,parent, attachToRoot: false)
        ViewHolder holder = = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position){
        final String Pengirim = rvData.get(position);
        holder.txtPengirim.setText(rvData.get(position));
        holder.txtLastChat.setText("Data ke "+rvData.get(position));
    }
}

