package countdown.app

import android.util.Log.d
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.my_row.view.*

class MyAdapter(private val friends: List<DataModel>, private val friendClicked: () ->Unit) :
        RecyclerView.Adapter<MyAdapter.ViewHolder>(){


    class ViewHolder (val view: View) : RecyclerView.ViewHolder(view)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_row,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val friend = friends[position]
        holder.view.textView.text = "${friend.firstName} ${friend.lastName} ${friend.email}"
        holder.view.image.setImageDrawable(holder.view.context.getDrawable(friend.friendPhoto))
        holder.view.setOnClickListener{
            d("daniel","clicked")
            friendClicked.invoke()
        }
    }

    override fun getItemCount() = friends.size


}