package com.olvera.translator_kmm.core.presentation

import com.olvera.translator_kmm.core.domain.language.Language

expect class UILanguage {

    val language: Language

    companion object {
        fun byCode(langCode: String): UILanguage
        val allLanguages: List<UILanguage>
    }
}