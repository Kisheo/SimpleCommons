package com.dpsoftapps.commons.extensions

import android.content.Context
import com.dpsoftapps.commons.models.FileDirItem

fun FileDirItem.isRecycleBinPath(context: Context): Boolean {
    return path.startsWith(context.recycleBinPath)
}
