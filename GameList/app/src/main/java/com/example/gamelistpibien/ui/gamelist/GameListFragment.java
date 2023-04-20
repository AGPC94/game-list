package com.example.gamelistpibien.ui.gamelist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.gamelistpibien.ui.AllGamesFragment;
import com.example.gamelistpibien.databinding.FragmentGamelistBinding;

public class GameListFragment extends Fragment {

    GameListViewModel gameListViewModel;
    FragmentGamelistBinding binding;
    String[] data = {"ALL", "PLANNING", "PLAYING",  "COMPLETED", "PAUSED", "DROPEED"};

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {

        gameListViewModel = new ViewModelProvider(this).get(GameListViewModel.class);

        binding = FragmentGamelistBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.vpList.setAdapter(new Adapter(this));

        return root;
    }

    class Adapter extends FragmentStateAdapter {
        public Adapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        public Adapter(@NonNull Fragment fragment) {
            super(fragment);
        }

        public Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return new AllGamesFragment(data[position]);
        }

        @Override
        public int getItemCount() {
            return data.length;
        }
    }
}