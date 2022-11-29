package com.teenteen.habittracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.teenteen.habittracker.adapters.ParentAdapter
import com.teenteen.habittracker.data.model.defaultArray

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ParentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
        setupFAB()
    }

    private fun setupRecyclerView() {
        val parentRecyclerView: RecyclerView = findViewById(R.id.parent_recycler_view)
        adapter = ParentAdapter(defaultArray)
        parentRecyclerView.adapter = adapter
    }

    private fun setupFAB() {
        val fab: ExtendedFloatingActionButton = findViewById(R.id.fab)
    }
}