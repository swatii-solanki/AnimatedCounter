package com.animatedcounter

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import java.util.UUID

@Composable
fun AnimatedCounter(count: Int) {
    Row {
        val countString = count.toString()
        countString.forEachIndexed { index, char ->
            AnimatedContent(
                targetState = Digit(UUID.randomUUID(), char),
                label = "count",
                transitionSpec = {
                    if (index % 2 == 0) {
                        slideInVertically(
                            tween(
                                700, easing = FastOutSlowInEasing
                            )
                        ) { it } togetherWith slideOutVertically(
                            tween(
                                700, easing = FastOutSlowInEasing
                            )
                        ) { -it }
                    } else {
                        slideInVertically(
                            tween(
                                700, easing = FastOutSlowInEasing
                            )
                        ) { -it } togetherWith slideOutVertically(
                            tween(
                                700, easing = FastOutSlowInEasing
                            )
                        ) { it }
                    }
                }) { targetState ->
                Text(
                    text = "${targetState.char}",
                    fontSize = 100.sp,
                    style = LocalTextStyle.current.copy(fontFeatureSettings = "tnum"),
                )
            }
        }
    }
}

data class Digit(var index: UUID, var char: Char) {
    override fun hashCode(): Int {
        var result = 1
        result = 31 * result + index.hashCode()
        result = 31 * result + char.hashCode()
        return result
    }
}