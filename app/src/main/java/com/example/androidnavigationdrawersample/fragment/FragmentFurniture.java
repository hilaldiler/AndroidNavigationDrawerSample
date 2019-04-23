package com.example.androidnavigationdrawersample.fragment;

import android.app.Fragment;
import android.os.Bundle;
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

public class FragmentFurniture extends Fragment {
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_furniture, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recylerview_furniture);

        ProductAdapter productAdapter = new ProductAdapter(getData(), getActivity());
        recyclerView.setAdapter(productAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        return view;
    }

    public List<Product> getData() {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, R.drawable.library, "House Line Sole Kitaplık - Beyaz / Ceviz",
                99,""));
        products.add(new Product(2,R.drawable.unit, "House Line Dekoraktif Tv Ünitesi - Beyaz / Ceviz",
                219,""));
        products.add(new Product(3, R.drawable.desk, "House Line Katlanır Kırma Masa ve Sandalye Takımı - Gri",
                329, ""));
        products.add(new Product(4, R.drawable.seat, "Sigma Tasarım Asya 2'li Koltuk - Kırmızı",
                269, ""));

        return products;
    }

}
