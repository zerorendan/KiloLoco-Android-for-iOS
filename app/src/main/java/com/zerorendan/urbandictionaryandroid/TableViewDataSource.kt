package com.zerorendan.urbandictionaryandroid

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TableViewDataSource: RecyclerView.Adapter<TermCell>() {

    var terms = emptyList<Term>()

    // numberOfRows
    override fun getItemCount(): Int = terms.size

    // dequeueReuseIdentifier
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TermCell {
        val termView = LayoutInflater.from(parent.context).inflate(R.layout.term_cell, parent, false)
        return TermCell(termView)
    }

    // cellForRowAt indexPath
    override fun onBindViewHolder(holder: TermCell, position: Int) {
        val term = terms[position]
        holder.wordLabel.text = term.word
        holder.definitionLabel.text = term.htmlDefinition
        holder.term = term
    }

    //reloadData()
    fun update(terms: List<Term>) {
        this.terms = terms
        notifyDataSetChanged()
    }

}