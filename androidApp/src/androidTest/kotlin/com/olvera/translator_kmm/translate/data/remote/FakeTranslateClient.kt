package com.olvera.translator_kmm.translate.data.remote

import com.olvera.translator_kmm.core.domain.language.Language
import com.olvera.translator_kmm.translate.domain.translate.TranslateClient

class FakeTranslateClient : TranslateClient {


    var translatedText = "text translation"
    override suspend fun translate(
        fromLanguage: Language,
        fromText: String,
        toLanguage: Language
    ): String {
        return translatedText
    }
}