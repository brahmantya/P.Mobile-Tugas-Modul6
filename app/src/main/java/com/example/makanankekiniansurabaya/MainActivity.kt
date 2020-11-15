package com.example.makanankekiniansurabaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTitle("Makanan Kekinian Surabaya")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createdataupn()
        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.setHasFixedSize(true)
        rv_list.adapter = dataMadapter(data,{ makananItem : data_makanan -> makananItemClicked(makananItem) })

    }
    private fun makananItemClicked(makananItem : data_makanan){
        val showDetailActivityIntent = Intent (this, dataDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, makananItem.gambarM)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, makananItem.namaM)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, makananItem.deskM)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, makananItem.deskdetail)
        startActivity(showDetailActivityIntent)
    }
    private fun createdataupn() : List<data_makanan>{
        val rvlist = ArrayList<data_makanan>()
        rvlist.add(data_makanan(R.drawable.donat,
            "Donut Indomie",
            "Donat indomie, yang terbuat dari campuran mie instan, bumbu, dan telur.\n"+
                    "Mula-mula mie dimasak seperti biasa, kemudian diberi bumbu, tambahan isi seperti sosis, kornet, atau keju, lalu ditambah telur.\n"+
                    "Cetak dengan cetakan donat, lalu kukus hingga matang. Setelah dingin, lumuri donat dengan adonan tepung terigu dan panir\n"+
                    "Goreng dengan minyak panas hingga kuning keemasan.\n"+
                    "\n" +
                    "Lokasi: ",
            "Roti Bakar 543\n"+
                    "Jalan Dukuh Kupang XXV 1 No. 8-9 Surabaya")
        )
        rvlist.add(data_makanan(R.drawable.hotang,
            "Hotang",
            "Hotang (Hot dog kentang) terbuat dari sosis ayam atau sapi yang ditusuk menggunakan tusukan sate,\n"+
                    "kemudian dicelup ke dalam adonan tepung dan dibalur dengan potongan kentang beku,\n"+
                    "baru digoreng menggunakan minyak panas. \n"+
                    "\n" +
                    "Lokasi: ",
            "Monster Hottang Surabaya\n"+
                    "Jl. Ketintang No. 91, Wonokromo, Surabaya\n")
        )
        rvlist.add(data_makanan(R.drawable.keripik,
            "Keripik salted egg",
            "Aceh fish skin salted egg. Tekstur kulit ikan yang renyah mirip keripik berpadu dengan bumbu telur asin yang kering.\n"+
                    "Saat digigit kulit ikan begitu renyah karena teksturnya cenderung tipis.\n"+
                    "Paduan rasa gurih dan manis yang seimbang membalut kulit ikan goreng.\n" +
                    "\n" +
                    "Lokasi: ",
            "Ais Salted Egg\n"+
                    "Jl.Tenggilis Mejoyo,Surabaya\n")
        )
        rvlist.add(data_makanan(R.drawable.boci,
            "Baso Aci",
            "baso aci adalah salah satu kuliner khas Garut yang sampai saat ini masih digandrungi oleh banyak kalangan.\n" +
                    "Kuliner ini terbuat dari tepung kanji atau yang biasa orang sunda sebut aci. \n" +
                    "isian baso aci asal Garut ini gak jauh berbeda antara satu dengan yang lainnya. Di antaranya ada bakso daging, bakso aci, cuanci, tahu goreng, ceker, dan sukro cikur.\n" +
                    "Selain itu ada pula bahan tambahan lain berupa bumbu bubuk, sambal, dan potongan jeruk\n" +
                    "\n" +
                    "Lokasi: ",
            "Baso Aci Akang\n"+
                    "Jl. Dharmahusada No.115,Surabaya")

        )

        rvlist.add(data_makanan(R.drawable.ubi,
            "Bola-bola ubi",
            "Kuliner Bobobi ini memiliki bentuk bulat seperti bola, sekilas terlihat seperti tahu bulat.\n" +
                    "Ubi-ubi ini digoreng dadakan saat dibeli sehingga lezat dinikmati saat masih panas.” \n" +
                    "Tekstur di dalamnya padat yang terbuat campuran ubi dan tepung terigu.\n" +
                    "\n" +
                    "Lokasi: ",
            "Bola Ubi Kaleci\n"+
                      "Jl. Manyar Kertoarjo V No. 39, Manyar, Surabaya")

        )
        rvlist.add(data_makanan(R.drawable.telur,
            "Telur gulung",
            "Telur gulung adalah variasi dari telur goreng yang di mana sebuah telur akan digoreng\n"+
                    "dan kemudian digulung menggunakan sebuah tusukan yang biasanya di buat dari kayu pohon Bambu.\n" +
                    "\n" +
                    "Lokasi: ",
            "Telur gulung surabaya\n"+
                    "Jl. Dukuh Kupang XXV No.46,Surabaya")

        )
        rvlist.add(data_makanan(R.drawable.pisang,
            "Pisang nugget",
            "Pisang nugget merupakan pisang yang dibalut dengan telur, tepung terigu dan tepung panir/tepung roti.\n" +
                    "Pisang goreng biasanya hanya menggunakan tepung terigu yang dicampur dengan telur.\n" +
                    "\n" +
                    " Lokasi: ",
            "Pisang Nugget Surabaya\n"+
                    "Jl. Balongsari Tama Bar. IV, Balongsari,Surabaya")
        )

        return rvlist



    }
}
