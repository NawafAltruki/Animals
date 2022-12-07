package com.example.animals.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.animals.R
import com.example.animals.model.Animal

// TODO [1] Implement Adapter Class
class AnimalAdapter(private val context: Context,
                  private val dataset : List<Animal>)
    : RecyclerView.Adapter<AnimalAdapter.ViewHolder>() { // End of BookAdapter

    // TODO [3] Implement Adapter override methods
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_animal, parent, false)
        return ViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.animalName.text = context.resources.getString(item.name)
        holder.animalType.text = context.resources.getString(item.type)
        holder.animalImage.setImageResource(item.image)

    }

    override fun getItemCount() = dataset.size

    // TODO [2] Implement ViewHolder Class
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        // views in layout file
        val animalName : TextView = view.findViewById(R.id.txtName)
        val animalType : TextView = view.findViewById(R.id.txtType)
        val animalImage : ImageView = view.findViewById(R.id.animalImage)

    } // End ViewHolder

} // End BookAdapter