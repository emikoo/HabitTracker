package com.teenteen.habittracker.adapters

import android.graphics.drawable.AnimatedVectorDrawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.teenteen.habittracker.R
import com.teenteen.habittracker.data.model.Habit

open class ChildAdapter(var dataSet: List<Habit.Day>, val listener: OnItemSelected): RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {


    inner class ChildViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.title_child)
        val number: TextView = itemView.findViewById(R.id.subtitle_child)
        val card: CardView = itemView.findViewById(R.id.card)
    }

    override fun onCreateViewHolder(parent: ViewGroup , viewType: Int) = ChildViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_child, parent,
            false
        )
    )

    override fun onBindViewHolder(holder: ChildViewHolder , position: Int) {
        val item = dataSet[position]
        holder.name.text = item.name
        holder.number.text = item.number.toString()
        holder.itemView.setOnClickListener {
            listener.onItemSelected(item, dataSet)
        }
        if (item.isSelected == 0) {
            holder.name.setTextColor(holder.itemView.resources.getColor(R.color.orange))
            holder.number.setTextColor(holder.itemView.resources.getColor(R.color.orange))
            holder.number.visibility = View.VISIBLE
            holder.image.visibility = View.GONE
            holder.card.setCardBackgroundColor(holder.itemView.resources.getColor(R.color.white))
        } else {
            Log.d("sfsadfsdfs", item.isSelected.toString())
            holder.name.setTextColor(holder.itemView.resources.getColor(R.color.white))
            holder.number.visibility = View.GONE
            holder.image.visibility = View.VISIBLE
            holder.card.setCardBackgroundColor(holder.itemView.resources.getColor(R.color.orange))
        }
    }

    override fun getItemCount() = dataSet.size

    interface OnItemSelected{
        fun onItemSelected(item: Habit.Day, list: List<Habit.Day>)
    }
}