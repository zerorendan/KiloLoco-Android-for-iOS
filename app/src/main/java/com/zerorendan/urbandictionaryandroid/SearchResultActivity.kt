package com.zerorendan.urbandictionaryandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_search_result.*

class SearchResultActivity : AppCompatActivity() {
    private val networking = NetworkingService()
    private val dataSource = TableViewDataSource()

    //ViewDidload
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_result)

        resultTableView.layoutManager = LinearLayoutManager(this)
        resultTableView.adapter = dataSource

        val term = intent.getStringExtra(MainActivity.termKey)
        supportActionBar?.title = term
        getSearchResultsForTerm(term)
    }

    private fun getSearchResultsForTerm(term: String) {
        networking.defineTerm(term).observe(this, Observer { terms ->
            terms.forEach { println(it) }
            dataSource.update(terms)
        })
    }
}