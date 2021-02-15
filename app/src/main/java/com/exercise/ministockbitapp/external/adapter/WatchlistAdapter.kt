package com.exercise.ministockbitapp.external.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.exercise.ministockbitapp.data.model.Coin
import com.exercise.ministockbitapp.databinding.LayoutCryptoItemBinding

class WatchlistAdapter : RecyclerView.Adapter<WatchlistAdapter.ViewHolder>() {

    private val watchlist: MutableList<Coin> = mutableListOf()

    inner class ViewHolder(private val binding: LayoutCryptoItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(coin: Coin) {
            binding.coin = coin
            if (coin.isPriceUp)
                binding.tvPercentage.setTextColor(binding.root.context.getColor(android.R.color.holo_green_dark))
            else
                binding.tvPercentage.setTextColor(binding.root.context.getColor(android.R.color.holo_red_dark))
        }
    }

    fun setWatchlist(currentWatchlist: List<Coin>) {
        watchlist.addAll(currentWatchlist)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutCryptoItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount(): Int {
        return watchlist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(watchlist[position])
    }

}