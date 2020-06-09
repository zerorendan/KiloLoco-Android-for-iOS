package com.zerorendan.urbandictionaryandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_word_definition.*
import kotlinx.android.synthetic.main.term_cell.*
import kotlinx.android.synthetic.main.term_cell.definitionLabel

class WordDefinitionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_definition)

        val term = intent.getSerializableExtra(TermCell.termKey) as? Term
        term?.let {
            supportActionBar?.title = it.word
            definitionLabel.text = it.htmlDefinition
            likesLabel.text = "Likes: ${it.likes}"
            dislikesLabel.text = "Dislikes: ${it.dislikes}"
        }
    }
}