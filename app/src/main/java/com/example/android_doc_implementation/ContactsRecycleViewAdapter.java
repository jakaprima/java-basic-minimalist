package com.example.android_doc_implementation;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ContactsRecycleViewAdapter extends RecyclerView.Adapter<ContactsRecycleViewAdapter.ViewHolder> {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private Context context;


    public ContactsRecycleViewAdapter(Context context) {
        System.out.println("1");
        this.context = context;
    }

    // generate method by right click generate -> implement method
    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        System.out.println("2");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        System.out.println("onBindViewHolder"+ holder.gambarProfile);
        holder.textName.setText(contacts.get(position).getName());
        holder.textEmail.setText(contacts.get(position).getEmail());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            // ga bisa passing mainActivity disini maka harus buat private Context context;
            @Override
            public void onClick(View view) {
                Toast.makeText(context, contacts.get(position).getName() + "selected", Toast.LENGTH_SHORT).show();
            }
        });
        Glide.with(context)
                .asBitmap()
                .load(contacts.get(position).getImageUrl())
                .into(holder.gambarProfile);
    }

    @Override
    public int getItemCount() {
        System.out.println("4");
        //        return 0;
        return contacts.size();
    }

    // klik kanan generate setter setelah create contact di line 15
    public void setContacts(ArrayList<Contact> contacts) {
        System.out.println("5");
        this.contacts = contacts;

        // untuk set kalo ada perubahan misal data contactnya dari api contact sudah terupdate
        // notify adapter data sudah berubah
        notifyDataSetChanged();
    }

    // constructor buat sendiri
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textName, textEmail;
        private ImageView gambarProfile;
        // untuk bisa clickable
        //        private RelativeLayout parent;
        // ganti karena didepan diganti ke cardView
        private CardView parent;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.textName);
            textEmail = itemView.findViewById(R.id.textEmail);
            gambarProfile = itemView.findViewById(R.id.gambarProfile);
            //setelah set ini maka bisa di akses di onBindViewHolder
            parent = itemView.findViewById(R.id.parent);
            System.out.println("6");
        }
    }
}
