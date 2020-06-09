package com.zerorendan.urbandictionaryandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //ViewDidload
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchButton.setOnClickListener {
            navigateToSearchResultsForWord(termTextField.text.toString())
        }
    }

    private fun navigateToSearchResultsForWord(word: String) {
        val intent = Intent(this, SearchResultActivity::class.java)
        intent.putExtra(termKey, word)
        startActivity(intent)
    }

    //static let termKey = "termKey"
    companion object{
        const val termKey = "termKey"
    }
}