package com.example.mybaseapp.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mybaseapp.databinding.RowItemSampleBinding
import com.example.mybaseapp.network.models.SampleModel

class SampleListAdapter (private val listener: OnItemClickListener): ListAdapter<SampleModel, SampleListAdapter.SampleViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        val binding = RowItemSampleBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return SampleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }

    inner class SampleViewHolder(private val binding: RowItemSampleBinding): RecyclerView.ViewHolder(binding.root) {
        init {
            binding.apply {
                root.setOnClickListener {
                    val position = adapterPosition
                    if(position != RecyclerView.NO_POSITION){
                        val sampleModel = getItem(position)
                        listener.onItemClick(sampleModel)
                    }
                }
            }
        }

        fun bind(sampleModel: SampleModel){
            binding.apply {
                
            }
        }
    }

    interface OnItemClickListener{
        fun onItemClick(sampleModel: SampleModel)
    }


    class DiffCallback : DiffUtil.ItemCallback<SampleModel>(){
        override fun areItemsTheSame(oldItem: SampleModel, newItem: SampleModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: SampleModel, newItem: SampleModel): Boolean {
            return oldItem == newItem
        }

    }
}