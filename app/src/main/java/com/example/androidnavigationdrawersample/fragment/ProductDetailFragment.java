package com.example.androidnavigationdrawersample.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidnavigationdrawersample.R;

public class ProductDetailFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detail_product, container, false);
        ImageView imageProduct=view.findViewById(R.id.imageProduct);
        TextView txtPrice=view.findViewById(R.id.productPrice);
        TextView product = view.findViewById(R.id.product);

        imageProduct.setImageResource(getArguments().getInt("image"));
  //      getActivity().setTitle(getArguments().getString("name"));
        product.setText(getArguments().getString("name"));
        txtPrice.setText(getArguments().getString("price"));
        return view;
    }
}
