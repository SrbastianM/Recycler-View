package com.srbastian.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class personAdapter(
    var imageList: ArrayList<Int>,
    var nameList: ArrayList<String>,
    var detailList: ArrayList<String>,
    var context: Context) : RecyclerView.Adapter<personAdapter.personeViewHolder>() {
    class personeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var textViewNamePersone : TextView = itemView.findViewById(R.id.tv_name)
        var textViewDetails : TextView = itemView.findViewById(R.id.tv_description)
        var imageViewComponent : CircleImageView = itemView.findViewById(R.id.imageView)
        var cardView : CardView = itemView.findViewById(R.id.cardViewComponent)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): personeViewHolder {
        val view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_desing,parent, false)

        return personeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return nameList.size
    }

    override fun onBindViewHolder(holder: personeViewHolder, position: Int) {
        holder.textViewNamePersone.text = nameList.get(position)
        holder.textViewDetails.text = detailList.get(position)
        holder.imageViewComponent.setImageResource(imageList.get(position))
        holder.cardView.setOnClickListener {
            Toast.makeText(context, "Did you hear before about ${nameList.get(position)}", Toast.LENGTH_LONG).show()
        }
    }
}