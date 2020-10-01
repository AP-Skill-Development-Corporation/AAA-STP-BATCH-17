package com.example.roomdata;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder>
{
   Context ctx;

   List<Students_Entity> list;

    public StudentAdapter(Context ctx, List<Students_Entity> list) {
        this.ctx = ctx;
        this.list = list;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return new StudentViewHolder(LayoutInflater.from(ctx).inflate(R.layout.row_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position)
    {

        holder.rollno.setText(list.get(position).getRollno());
        holder.name.setText(list.get(position).getName());

        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.studentDataBase.studentDAO().deleteData(list.get(position));
                Toast.makeText(ctx, "sucessfully deleted "+holder.name.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder
    {

        TextView edit,name,rollno,delete;


        public StudentViewHolder(@NonNull View itemView)
        {
            super(itemView);
            edit=itemView.findViewById(R.id.edit);
            name=itemView.findViewById(R.id.nam);
            rollno=itemView.findViewById(R.id.rollnam);
            delete=itemView.findViewById(R.id.delete);

            edit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String n=name.getText().toString();
                    String r=rollno.getText().toString();
                    Intent intent=new Intent(ctx,UpDateActivity.class);
                    intent.putExtra("name",n);
                    intent.putExtra("rollno",r);
                    ctx.startActivity(intent);

                }
            });

        }
    }
}
