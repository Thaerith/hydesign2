package com.imiplc.hydesign2.display

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

@Composable
fun Label(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    onTextLayout: ((TextLayoutResult) -> Unit)? = null,
) {
    Text(
        text = text,
        modifier = modifier,
        color = color,
        fontSize = 12.sp,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Medium,
        fontFamily = FontFamily.Default,
        letterSpacing = 0.5.sp,
        textAlign = textAlign,
        lineHeight = 16.sp,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = 1,
        minLines = 1,
        onTextLayout = onTextLayout,
    )
}