package com.zerorendan.urbandictionaryandroid

import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.term_cell.view.*

class TermCell(termView: View, var term: Term? = null): RecyclerView.ViewHolder(termView) {
    val wordLabel: TextView = termView.wordLabel
    val definitionLabel: TextView = termView.definitionLabel

    init {
        termView.setOnClickListener {
            // if let it = self.term {
            term?.let {
                val intent = Intent(termView.context, WordDefinitionActivity::class.java)
                intent.putExtra(termKey, term)
                termView.context.startActivity(intent)
            }
        }
    }

    companion object {
        const val termKey = "termKey"
    }
}