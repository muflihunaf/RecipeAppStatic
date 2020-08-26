package com.muflihundev.recipeapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.muflihundev.recipeapp.R;
import com.muflihundev.recipeapp.adapter.AdapterResep;
import com.muflihundev.recipeapp.model.DataResep;
import com.muflihundev.recipeapp.model.ModelResep;
import com.muflihundev.recipeapp.ui.detail.DetailActivity;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    RecyclerView rvResep;
    private ArrayList<ModelResep> list = new ArrayList<>();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        rvResep = root.findViewById(R.id.rv_resep);
        rvResep.setLayoutManager(new GridLayoutManager(getActivity(),2));
        list.addAll(DataResep.getListResep());
        AdapterResep adapterResep = new AdapterResep(list);

        rvResep.setAdapter(adapterResep);
        adapterResep.notifyDataSetChanged();

        adapterResep.setOnitemClickCallback(new AdapterResep.OnItemClickCallback(){

            @Override
            public void onItemClicked(ModelResep data) {
                Intent kirimdata = new Intent(getActivity(), DetailActivity.class);
                kirimdata.putExtra("NamaResep",data.getNamaResep());
                kirimdata.putExtra("Gambar",data.getGambarResep());
                kirimdata.putExtra("Detail",data.getDetailResep());
                startActivity(kirimdata);

            }
        });

        return root;
    }
}