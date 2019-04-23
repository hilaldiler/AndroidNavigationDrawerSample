package com.example.androidnavigationdrawersample.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidnavigationdrawersample.MainActivity;
import com.example.androidnavigationdrawersample.R;
import com.example.androidnavigationdrawersample.fragment.ProductDetailFragment;
import com.example.androidnavigationdrawersample.model.Product;

import java.util.List;
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {

    public List<Product>  productList;
    LayoutInflater inflater;
    Context context;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageProduct;
        public TextView txtProductName;
        public TextView txtPrice;
        public TextView txtDelivery;


        public MyViewHolder(View v) {
            super(v);
            imageProduct =  itemView.findViewById(R.id.productImage);
            txtProductName =  itemView.findViewById(R.id.productName);
            txtPrice =  itemView.findViewById(R.id.productPrice);
            txtDelivery = itemView.findViewById(R.id.productDelivery);
        }
    }

    public ProductAdapter(List<Product> _productList, Context _context) {
        productList = _productList;
        context = _context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public ProductAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.product, parent, false);
        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductAdapter.MyViewHolder holder, final int position) {

        holder.imageProduct.setImageResource(productList.get(position).getProductImage());
        holder.txtProductName.setText(productList.get(position).getProductName());
        holder.txtPrice.setText(String.valueOf(productList.get(position).getProductPrice()));
        holder.txtDelivery.setText(productList.get(position).getProductDelivery());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProductDetailFragment productDetailFragment = new ProductDetailFragment();
                Bundle args = new Bundle();
                args.putInt("image", productList.get(position).getProductImage());
                args.putString("name", productList.get(position).getProductName());
                args.putString("price", String.valueOf(productList.get(position).getProductPrice()) + " TL");
                args.putString("delivery", String.valueOf(productList.get(position).getProductDelivery()) + " Hızlı ve Ücretsiz Kargo");

                productDetailFragment.setArguments(args);

                ((MainActivity) holder.itemView.getContext()).getFragmentManager().beginTransaction()
                        .replace(R.id.frame_layout, productDetailFragment).commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
