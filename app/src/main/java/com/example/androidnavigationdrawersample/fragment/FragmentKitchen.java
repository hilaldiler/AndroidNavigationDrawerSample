package com.example.androidnavigationdrawersample.fragment;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidnavigationdrawersample.R;
import com.example.androidnavigationdrawersample.adapter.ProductAdapter;
import com.example.androidnavigationdrawersample.model.Product;

import java.util.ArrayList;
import java.util.List;

public class FragmentKitchen extends Fragment {

    RecyclerView recyclerView;

    public FragmentKitchen() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kitchen, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recylerview_kitchen);

        ProductAdapter productAdapter = new ProductAdapter(getData(), getActivity());
        recyclerView.setAdapter(productAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        return view;
    }

    public List<Product> getData() {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, R.drawable.bardak, "Lav NEC346 6'lı Cam Meşrubat Bardağı Seti",
                15,""));
        products.add(new Product(2,R.drawable.canak, "Erdem 6 Adet Luxor Yemek Çatalı",
                29,""));
        products.add(new Product(3, R.drawable.tabak, "Keramika 18393 Kera Art Versay 24 Parça Yemek Takımı",
                299, ""));
        products.add(new Product(4, R.drawable.ceyiz, "Pierre Cardin 6 Kişilk Papillon Günlük Yemek Takımı",
                549, ""));

        return products;
    }

}

