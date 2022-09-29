package com.pedro_bruno.watertrackerapp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.pedro_bruno.watertrackerapp.R
import com.pedro_bruno.watertrackerapp.ui.theme.BlueDark
import com.pedro_bruno.watertrackerapp.ui.theme.BlueLight
import com.pedro_bruno.watertrackerapp.ui.theme.Roboto

@Composable
fun TopBar(
    title: String = stringResource(R.string.app_name),
    icon: ImageVector? = null,
    navController: NavController = NavController(context = LocalContext.current),
    showArrow: Boolean = false,
    onBackArrowClicked: () -> Unit = {}
) {
    TopAppBar(
        elevation = 0.dp,
        backgroundColor = BlueLight,
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (showArrow && icon != null) {
                    Icon(imageVector = icon, contentDescription = "arrow back",
                        tint = Color.Red.copy(alpha = 0.7f),
                        modifier = Modifier.clickable { onBackArrowClicked.invoke() })
                }
                Spacer(modifier = Modifier.width(40.dp))
                Text(
                    text = title,
                    color = Color.White,
                    fontFamily = Roboto,
                    fontWeight = FontWeight.Light,
                    fontSize = 24.sp
                )
            }
        }
    )
}

@Preview
@Composable
fun TopAppBarPreview() {
    TopBar(icon = Icons.Default.ArrowBack, title = "Water Tracker")
}