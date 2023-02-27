package com.example.jetpackcompose.presentation.part_twenty_three

import android.Manifest
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.style.TextAlign
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun PartTwentyThreeScreen() {
    val permissionsState = rememberMultiplePermissionsState(
        permissions = listOf(
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.CAMERA
        )
    )

    val lifeCycleOwner = LocalLifecycleOwner.current

    DisposableEffect(
        key1 = lifeCycleOwner,
        effect = {
            val observer = LifecycleEventObserver { _, event ->
                if (event == Lifecycle.Event.ON_START) {
                    permissionsState.launchMultiplePermissionRequest()
                }
            }
            lifeCycleOwner.lifecycle.addObserver(observer)

            onDispose {
                lifeCycleOwner.lifecycle.removeObserver(observer)
            }
        }
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        permissionsState.permissions.forEach {
            when(it.permission) {
                Manifest.permission.CAMERA -> {
                    when {
                        it.shouldShowRationale -> {
                            Text("Camera permission requested to access the camera", textAlign = TextAlign.Center)
                        }
                        it.hasPermission -> {
                            Text("Camera permission granted", textAlign = TextAlign.Center)
                        }
                        !it.hasPermission && !it.shouldShowRationale -> {
                            Text("Camera permission denied definitely, " +
                                    "You can granted back in the settings", textAlign = TextAlign.Center)
                        }
                    }
                }

                Manifest.permission.RECORD_AUDIO -> {
                    when {
                        it.shouldShowRationale -> {
                            Text("Record audio permission requested to access the camera", textAlign = TextAlign.Center)
                        }
                        it.hasPermission -> {
                            Text("Record audio permission granted", textAlign = TextAlign.Center)
                        }
                        !it.hasPermission && !it.shouldShowRationale -> {
                            Text("Record audio permission denied definitely, " +
                                    "You can granted back in the settings", textAlign = TextAlign.Center)
                        }
                    }
                }
            }
        }
    }
}


