package com.exercise.ministockbitapp.ui.watchlist

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.exercise.ministockbitapp.databinding.FragmentWatchlistBinding
import com.exercise.ministockbitapp.external.adapter.WatchlistAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class WatchlistFragment : Fragment() {
    private val watchlistViewModel : WatchlistViewModel by viewModel()
    lateinit var binding : FragmentWatchlistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        watchlistViewModel.loadWatchlist()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWatchlistBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val watchlistAdapter = WatchlistAdapter()
        watchlistViewModel.watchlist.observe(viewLifecycleOwner, Observer {
            watchlistAdapter.setWatchlist(it)
        })
        binding.rvWatchlist.apply {
            adapter = watchlistAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }
}