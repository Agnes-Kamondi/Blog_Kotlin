package com.agnes.blogreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlogAdapter(var blogList : List<Blog>):
    RecyclerView.Adapter<BlogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.blog_list_view,parent,false)
        return BlogViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return blogList.size
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        val blog = blogList[position]
        holder.tvTitle.text = blog.title
        holder.tvAuthorName.text = blog.authorName
        holder.tvSummary.text = blog.summary
        holder.tvPublishingDate.text = blog.publishingDate
    }
}
class BlogViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val tvAuthorName = itemView.findViewById<TextView>(R.id.tvAuthorName)
    val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    val tvPublishingDate = itemView.findViewById<TextView>(R.id.tvPublishingDate)
    val tvSummary= itemView.findViewById<TextView>(R.id.tvSummary)
}