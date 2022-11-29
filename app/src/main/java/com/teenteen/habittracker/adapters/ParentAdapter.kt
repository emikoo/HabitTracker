package com.teenteen.habittracker.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.teenteen.habittracker.R
import com.teenteen.habittracker.data.model.Habit
import com.teenteen.habittracker.data.model.defaultDayList

open class ParentAdapter(private val dataSet: ArrayList<Habit>): RecyclerView.Adapter<ParentAdapter.ParentViewHolder>(), ChildAdapter.OnItemSelected {

    lateinit var adapter: ChildAdapter

    inner class ParentViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val name: TextView = itemView.findViewById(R.id.title_parent)
        val description: TextView = itemView.findViewById(R.id.subtitle_parent)
        val recycler_view: RecyclerView = itemView.findViewById(R.id.child_recycler_view)
        val start: TextView = itemView.findViewById(R.id.start_date)
        val end: TextView = itemView.findViewById(R.id.end_date)
    }

    override fun onCreateViewHolder(parent: ViewGroup , viewType: Int) = ParentViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_parent, parent,
            false
        )
    )

    override fun onBindViewHolder(holder: ParentViewHolder , position: Int) {
        val item = dataSet[position]
        val from = "from: "
        val to = "to: "
        holder.name.text = item.name
        holder.start.text = from + item.startDay
        holder.end.text = to + item.endDay
        holder.description.text = item.goal
        adapter = ChildAdapter(item.amount, this)
        holder.recycler_view.adapter = adapter
    }

    override fun getItemCount() = dataSet.size

    override fun onItemSelected(item: Habit.Day, list: List<Habit.Day>) {
        Log.d("GHJKL:KJHGF", "${item.isSelected}")
        for (i in list) {
            if (item.isSelected == 1) item.isSelected = 2
        }
        if (item.isSelected == 0) item.isSelected = 1
        else item.isSelected = 0

        adapter.notifyDataSetChanged()
        notifyDataSetChanged()
    }
}