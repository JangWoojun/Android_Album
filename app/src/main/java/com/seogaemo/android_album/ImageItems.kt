package com.seogaemo.android_album

import android.net.Uri

sealed class ImageItems {
    data class Image(
        val uri: Uri,
    ) : ImageItems()
}