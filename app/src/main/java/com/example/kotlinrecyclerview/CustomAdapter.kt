package com.example.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(val userList:ArrayList<User>):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    var removedPosition : Int ? = null



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }
    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        lateinit var textViewName: TextView

        fun bindItems(user: User) {
             textViewName = itemView.findViewById(R.id.textViewUsername) as TextView
            var textViewAddress =itemView.findViewById(R.id.textViewAddress) as TextView
            textViewName.text = user.name
            textViewAddress.text = user.address

        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(userList[position])
        //RAJ remove
  /*      holder.textViewName.setOnClickListener {
            userList.removeAt(position)
            removedPosition = position
            notifyDataSetChanged()
        }*/
    }
   /* fun removeItem(position: Int) {*/
   /*     userList.removeAt(position)*/
   /*     // notify the item removed by position*/
   /*     // to perform recycler view delete animations*/
   /*     // NOTE: don't call notifyDataSetChanged()*/
   /*     notifyItemRemoved(position)*/
   /* }*/




}

