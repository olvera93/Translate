package com.olvera.translator_kmm.translate.presentation

import com.olvera.translator_kmm.core.presentation.UILanguage

data class UIHistoryItem(
    val id: Long,
    val fromText: String,
    val toText: String,
    val fromLanguage: UILanguage,
    val toLanguage: UILanguage
)
