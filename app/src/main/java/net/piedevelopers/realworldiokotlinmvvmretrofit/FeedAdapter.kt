package com.example.android.rvtutorial



import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.piedevelopers.realworldiokotlinmvvmretrofit.R


class FeedAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

//    // Inflates the item views
//    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
//        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_list_item, parent, false))
//    }
//
//    // Binds each animal in the ArrayList to a view
//    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
////        holder?.tvAnimalType?.text = items.get(position)
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
//    val tvAnimalType = view.tv_animal_type
}