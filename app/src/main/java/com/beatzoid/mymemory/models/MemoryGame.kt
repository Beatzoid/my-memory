package com.beatzoid.mymemory.models

import com.beatzoid.mymemory.utils.DEFAULT_ICONS

class MemoryGame (private val boardSize: BoardSize) {

    val cards: List<MemoryCard>
    val numPairsFounds = 0

    init {
        val chosenImages = DEFAULT_ICONS.shuffled().take(boardSize.getNumPairs())
        val randomizedImages = (chosenImages + chosenImages).shuffled()
        cards = randomizedImages.map { MemoryCard(it) }
    }
}