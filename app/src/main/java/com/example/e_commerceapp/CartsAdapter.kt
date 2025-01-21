package com.example.e_commerceapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CartsAdapter(val cartsListData:List<CartsModel>,val context: Context):BaseAdapter() {
    override fun getCount(): Int {
        return cartsListData.size
    }

    override fun getItem(P0: Int): Any {
        return cartsListData[P0]
    }

    override fun getItemId(P0: Int): Long {
        return P0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val item=cartsListData[p0]
        val itemLayoutInflater=LayoutInflater.from(context).inflate(R.layout.itemlistdata,p2,false)
        val storeCarts=itemLayoutInflater.findViewById<TextView>(R.id.StoreUserTextView)
        val storeCart=itemLayoutInflater.findViewById<TextView>(R.id.StoreCartTextView)
        val carts=itemLayoutInflater.findViewById<TextView>(R.id.StoreTextView)

        storeCarts.text = item.userId.toString()
        storeCart.text = item.date
        carts.text = item.id.toString()
        return itemLayoutInflater



    }

}