package com.daffzzaqihaq.islamicdevelopmentnetwork

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.daffzzaqihaq.islamicdevelopmentnetwork.R.id.layoutWebView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO Menyeting agar javascript dapat digunakan di aplikasi kita
        layoutWebView.settings.javaScriptEnabled
        //TODO Menampung alamat website
        layoutWebView.loadUrl("https://idn.sch.id/")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_web_view,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean = when (item?.itemId){

        R.id.webProfil -> {
            layoutWebView.loadUrl("https://idn.sch.id/profil/")
            true
        }

        R.id.webDaftar -> {
            layoutWebView.loadUrl("https://idn.sch.id/daftar/")
            true
        }

        R.id.webTarget -> {
            layoutWebView.loadUrl("https://idn.sch.id/program/")
            true
        }

        R.id.webPrestasi -> {
            layoutWebView.loadUrl("https://idn.sch.id/prestasi/")
            true
        }

        R.id.webGaleri -> {
            layoutWebView.loadUrl("https://idn.sch.id/galeri/")
            true
        }

        R.id.webKontak -> {
            layoutWebView.loadUrl("https://idn.sch.id/kontak/")
            true
        }

        R.id.webInfo -> {
            layoutWebView.loadUrl("https://idn.sch.id/category/info-sekolah/")
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }

    }
}
