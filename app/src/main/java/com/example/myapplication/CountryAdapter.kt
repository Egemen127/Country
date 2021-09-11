package com.example.myapplication


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView


class CountryAdapter( val CountryList: List<Country>): RecyclerView.Adapter<CountryAdapter.CountryViewHolder>()
{

    inner class CountryViewHolder(val view: View) : RecyclerView.ViewHolder(view)
    {
        val button: Button = view.findViewById(R.id.button_item)
    }
    override fun getItemCount(): Int {
        return  CountryList.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_view, parent, false)


        return CountryViewHolder(layout)
    }
    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {

        holder.button.text = CountryList[position].countryName()
        holder.button.setOnClickListener {val context = holder.view.context
            val intent = Intent(context, DetailActivity::class.java)

            intent.putExtra("id", CountryList[position].countryName())
            intent.putExtra("pop", CountryList[position].population())
            intent.putExtra("area", CountryList[position].landArea())
            intent.putExtra("index", position)
            context.startActivity(intent)
        }
    }







}

