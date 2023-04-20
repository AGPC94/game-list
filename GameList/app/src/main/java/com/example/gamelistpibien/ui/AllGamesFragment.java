package com.example.gamelistpibien.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gamelistpibien.R;

import java.util.ArrayList;
import java.util.List;

public class AllGamesFragment extends Fragment {

    String data;
    RecyclerView rvGames;
    List<Integer> images;
    GameListAdapter adapter;

    public AllGamesFragment(String my_title) {
        this.data = my_title;
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_all_games, container, false);

        //TextView tv = root.findViewById(R.id.tvData);
        //tv.setText(data);

        rvGames = root.findViewById(R.id.rvGames);

        images = new ArrayList<>();

        images.add(R.drawable.ic_baseline_videogame_asset_24);
        images.add(R.drawable.ic_baseline_videogame_asset_24);
        images.add(R.drawable.ic_baseline_videogame_asset_24);
        images.add(R.drawable.ic_baseline_videogame_asset_24);
        images.add(R.drawable.ic_baseline_videogame_asset_24);

        adapter = new GameListAdapter(getContext(), images);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3, GridLayoutManager.VERTICAL, false);
        rvGames.setLayoutManager(gridLayoutManager);
        rvGames.setAdapter(adapter);












        return root;
    }


}