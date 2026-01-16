package com.imiplc.hydesign2.layout

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.Card as MaterialCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Card(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit,
) {
    MaterialCard(
        modifier = modifier,
        content = content,
    )
}