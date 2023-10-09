package com.example.task.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task.Model.user
import com.example.task.R
import java.lang.reflect.Array


class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

 private val userList = ArrayList<user>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
        return  MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return  userList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = userList[position]

        holder.Fname.text = currentitem.Name
        holder.email.text = currentitem.Email
        holder.phone.text = currentitem.Phone
        holder.location.text = currentitem.Location
    }

    fun updateUserList(userList : List<user>){
        this.userList.clear()
        this.userList.addAll(userList)
        notifyDataSetChanged()

    }

    class  MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var Fname : TextView = itemView.findViewById(R.id.tv_name1)
        var email : TextView = itemView.findViewById(R.id.tv_Email1)
        var location : TextView = itemView.findViewById(R.id.tv_Location1)
        var phone: TextView = itemView.findViewById(R.id.tv_Phone1)

    }

}