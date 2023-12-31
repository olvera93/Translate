package com.olvera.translator_kmm.translate.presentation

import com.olvera.translator_kmm.core.presentation.UILanguage

sealed class TranslateEvent {
    data class ChooseFromLanguage(val language: UILanguage) : TranslateEvent()
    data class ChooseToLanguage(val language: UILanguage) : TranslateEvent()
    object StopChoosingLanguage : TranslateEvent()
    object SwapLanguage : TranslateEvent()
    data class ChangeTranslationText(val text: String) : TranslateEvent()
    object Translate : TranslateEvent()
    object OpenFromLanguageDropDown : TranslateEvent()
    object OpenToLanguageDropDown : TranslateEvent()
    object CloseTranslation : TranslateEvent()
    data class SelectHistoryItem(val item: UIHistoryItem) : TranslateEvent()
    object EditTranslation : TranslateEvent()
    object RecordAudio : TranslateEvent()
    data class SubmitVoiceResult(val result: String?) : TranslateEvent()
    object OnErrorSeen : TranslateEvent()
}
