package com.n8ebel.hellolicenses

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        displayLicenseInfo()
    }

    private fun displayLicenseInfo() {
        startActivity(Intent(this, OssLicensesMenuActivity::class.java))
    }

}
