package com.olvera.translator_kmm.core.presentation

import com.olvera.translator_kmm.core.domain.language.Language

actual class UILanguage(
    actual val language: Language,
    val imageName: String
) {
    actual companion object {
        actual fun byCode(langCode: String): UILanguage {
            return allLanguages.find { it.language.langCode == langCode }
                ?: throw IllegalArgumentException("Invalid or supported language code")
        }

        actual val allLanguages: List<UILanguage>
            get() = Language.values().map { language ->
                UILanguage(
                    language = language,
                    imageName = language.langName.lowercase()
                )
            }
    }
}