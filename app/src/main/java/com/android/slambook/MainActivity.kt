package com.android.slambook

import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.ScrollView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.android.slambook.R.id.sv
import com.android.slambook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var animation: AnimationDrawable


    private lateinit var mRV: RecyclerView
    private lateinit var addEdt: EditText
    private lateinit var addBtn: Button
    private lateinit var mList: ArrayList<String>
    private lateinit var mRVAdapter:  MCRVAdapter
    private val zordiac = arrayOf("Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces")

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val svs = binding.sv
        animation = svs.background as AnimationDrawable
        animation.setEnterFadeDuration(2500)
        animation.setExitFadeDuration(5000)
        animation.start()

        val slambook = binding.slambook.text
        Log.d("Slam book", "1: $slambook")

        val full = binding.full.text
        Log.d("Slam book", "1: $full")
        val name = binding.name
        val names = name.text.clear()
        Log.d("Slam book", "1: $names")

        val nick = binding.nickname.text
        Log.d("Slam book", "1: $nick")
        val name1 = binding.nick
        val names1 = name1.text.clear()
        Log.d("Slam book", "1: $names1")

        val age = binding.age.text
        Log.d("Slam book", "1: $age")
        val ag = binding.a
        val ae = ag.text.clear()
        Log.d("Slam book", "1: $ae")

        val gender = binding.gender.text
        Log.d("Slam book", "1: $gender")
        val fe = findViewById<RadioButton>(R.id.female)
        val m = findViewById<RadioButton>(R.id.male)

        val favs = binding.favs.text
        Log.d("Slam book", "1: $favs")

        val movie = binding.movie.text
        Log.d("Slam book", "1: $movie")
        val movies = binding.movies
        val mv = movies.text.clear()
        Log.d("Slam book", "1: $mv")

        val song = binding.song.text
        Log.d("Slam book", "1: $song")
        val s = binding.songs
        val sg = s.text.clear()
        Log.d("Slam book", "1: $sg")

        val book = binding.book.text
        Log.d("Slam book", "1: $book")
        val bk = binding.a
        val books = bk.text.clear()
        Log.d("Slam book", "1: $books")


        // Manga and comicsu
        mRV = findViewById(R.id.idRVItems)
        addEdt = findViewById(R.id.comic)
        addBtn = findViewById(R.id.add1)
        mList = ArrayList()
        // on below line we are adding our list to our adapter.
        mRVAdapter = MCRVAdapter(mList = mList)
        mRV.adapter = mRVAdapter
        addBtn.setOnClickListener {
            // on below line we are calling add item method.
            addItem(addEdt.text.toString())
        }
        mRVAdapter.notifyDataSetChanged()

        //Zodiac
        val zc = binding.zordiac.text
        Log.d("Slam book", "1: $zc")
        val zSpinner = findViewById<Spinner>(R.id.spinner)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, zordiac)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        zSpinner.adapter = adapter

        zSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selected = zSpinner.selectedItem.toString()
                Toast.makeText(this@MainActivity, "You've selected $selected", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        val op = binding.opinion.text
        Log.d("Slam book", "1: $op")

        val describe = binding.describe.text
        Log.d("Slam book", "1: $describe")
        val three = binding.yourself
        val words = three.text.clear()
        Log.d("Slam book", "1: $words")

        val make = binding.make.text
        Log.d("Slam book", "1: $make")
        val you = binding.smile
        val smile = you.text.clear()
        Log.d("Slam book", "1: $smile")

        val awesome = binding.supers.text
        Log.d("Slam book", "1: $awesome")
        val supers = binding.power
        val power = supers.text.clear()
        Log.d("Slam book", "1: $power")

        val funny = binding.funny.text
        Log.d("Slam book", "1: $funny")
        val way = binding.way
        val laugh = way.text.clear()
        Log.d("Slam book", "1: $laugh")

        val fn = binding.finish.text
        Log.d("Slam book", "1: $fn")

        val willing = binding.willing.text
        Log.d("Slam book", "1: $willing")
        val to = binding.to
        val dos = to.text.clear()
        Log.d("Slam book", "1: $dos")

        val ifs = binding.world.text
        Log.d("Slam book", "1: $ifs")
        val world = binding.end
        val ends = world.text.clear()
        Log.d("Slam book", "1: $ends")

        val submit = findViewById<Button>(R.id.button)

    }

    // on below line we are creating a
    // new function to add item.
    @SuppressLint("NotifyDataSetChanged")
    private fun addItem(item: String) {
        // on below line we are checking
        // if item is empty or not.
        if (item.isNotEmpty()) {
            // on below line we are
            // adding item to our list
            mList.plusAssign(item)
            // on below line we are notifying
            // adapter that data has updated.
            mRVAdapter.notifyDataSetChanged()
        }
    }
}


class MCRVAdapter(
    // on below line we are passing variables
    // as course list and context
    private var mList: ArrayList<String>,
) : RecyclerView.Adapter<MCRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        // this method is use to inflate the layout file
        // which we have created for our recycler view.
        // on below line we are inflating our layout file.
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.mv_rv_item,
            parent, false
        )
        // at last we are returning our view holder
        // class with our item View File.
        return ViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // on below line we are setting text to our text view.
        holder.lngTV.text = mList[position]
    }
    override fun getItemCount(): Int {
        // on below line we are
        // returning the size of list.
        return mList.size
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // on below line we are initializing our text view.
        val lngTV: TextView = itemView.findViewById(R.id.idTVMvName)
    }
}