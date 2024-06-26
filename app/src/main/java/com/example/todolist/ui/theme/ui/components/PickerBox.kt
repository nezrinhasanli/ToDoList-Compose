package com.example.todolist.ui.theme.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun PickerBox(
    onClick:() -> Unit,
    value: String = "",
    label: String
){
    val shape = RoundedCornerShape(12.dp)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colorScheme.background,
                shape = shape
            )
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.outlineVariant,
                shape = shape
            )
            .clip(shape = shape)
            .clickable { onClick() }
    ) {
        Row {
            Text(
                text = value.ifBlank { label },
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f)
                ,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
            )

            Icon(
                imageVector = Icons.Filled.DateRange,
                contentDescription = "",
                modifier = Modifier.padding(16.dp)
                )

        }
    }
}