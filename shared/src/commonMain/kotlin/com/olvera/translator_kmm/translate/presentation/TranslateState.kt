package com.olvera.translator_kmm.translate.presentation

import com.olvera.translator_kmm.core.presentation.UILanguage
import com.olvera.translator_kmm.translate.domain.translate.TranslateError

data class TranslateState(
    val fromText: String = "",
    val toText: String? = null,
    val isTranslating: Boolean = false,
    val fromLanguage: UILanguage = UILanguage.byCode("en"),
    val toLanguage: UILanguage = UILanguage.byCode("de"),
    val isChoosingFromLanguage: Boolean = false,
    val isChoosingToLanguage: Boolean = false,
    val error: TranslateError? = null,
    val history: List<UIHistoryItem> = emptyList()
)
