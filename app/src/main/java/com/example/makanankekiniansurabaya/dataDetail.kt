package com.example.makanankekiniansurabaya

import android.content.Intent
import android.graphics.Paint.UNDERLINE_TEXT_FLAG
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.daftar_detail.*


class dataDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTitle("Deskripsi Makanan")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.daftar_detail)


        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {

            var gambarmkn = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var namamkn = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskmkn = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var ketmkn = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)

            gambarmakanan.setImageResource(gambarmkn)
            namamakanan.text = namamkn
            deskripsimakanan.text = deskmkn
            ketmakanan.text = ketmkn

        }
    }
}