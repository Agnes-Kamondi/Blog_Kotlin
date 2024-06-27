package com.agnes.blogreader

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlogAdapter(var blogList: List<Blog>) : RecyclerView.Adapter<BlogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.blog_list_view, parent, false)
        return BlogViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return blogList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        val blog = blogList[position]
        holder.tvTitle.text = blog.title
        holder.tvAuthorName.text = blog.authorName
        holder.tvPublishingDate.text = blog.publishingDate

        if (blog.summary.length > 100) {
            holder.tvSummary.text = "${blog.summary.substring(0, 100)}..."
            holder.tvSeeMore.visibility = View.VISIBLE
            holder.tvSeeMore.setOnClickListener {
                if (holder.tvSeeMore.text == "See More") {
                    holder.tvSummary.text = blog.summary
                    holder.tvSeeMore.text = "See Less"
                } else {
                    holder.tvSummary.text = "${blog.summary.substring(0, 100)}..."
                    holder.tvSeeMore.text = "See More"
                }
            }
        } else {
            holder.tvSummary.text = blog.summary
            holder.tvSeeMore.visibility = View.GONE
        }
    }
}

class BlogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvAuthorName = itemView.findViewById<TextView>(R.id.tvAuthorName)
    val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    val tvPublishingDate = itemView.findViewById<TextView>(R.id.tvPublishingDate)
    val tvSummary = itemView.findViewById<TextView>(R.id.tvSummary)
    val tvSeeMore = itemView.findViewById<TextView>(R.id.tvSeeMore)
}
