package edu.uksw.fti.pam.pam_activityintent.ui.screns

import android.Manifest
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState
import edu.uksw.fti.pam.pam_activityintent.R
import edu.uksw.fti.pam.pam_activityintent.ui.theme.PAM_ActivityIntentTheme

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun PermissionScreen() {
    val permissionsState = rememberMultiplePermissionsState(
        permissions = listOf(
            Manifest.permission.CAMERA,
            Manifest.permission.RECORD_AUDIO,
        )
    )

    val lifecycleOwner = LocalLifecycleOwner.current
    DisposableEffect(
        key1 = lifecycleOwner,
        effect = {
            val observer = LifecycleEventObserver { _, event ->
                if (event == Lifecycle.Event.ON_START) {
                    permissionsState.launchMultiplePermissionRequest()
                }
            }
            lifecycleOwner.lifecycle.addObserver(observer)

            onDispose {
                lifecycleOwner.lifecycle.removeObserver(observer)
            }
        }
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        permissionsState.permissions.forEach { perm ->
            when (perm.permission) {
                Manifest.permission.CAMERA -> {
                    when {
                        perm.hasPermission -> {
                            Text(
                                text = stringResource(R.string.label_allowcamera),
                                textAlign = TextAlign.Center
                            )
                        }
                        perm.shouldShowRationale -> {
                            Text(
                                text = stringResource(R.string.label_accesscamera),
                                textAlign = TextAlign.Center
                            )
                        }
                        perm.isPermanentlyDenied() -> {
                            Text(
                                text = stringResource(R.string.label_denycamera),
                            textAlign = TextAlign.Center
                            )
                        }
                    }
                }
                Manifest.permission.RECORD_AUDIO -> {
                    when {
                        perm.hasPermission -> {
                            Text(
                                text = stringResource(R.string.label_allowmic),
                                textAlign = TextAlign.Center
                            )
                        }
                        perm.shouldShowRationale -> {
                            Text(
                                text = stringResource(R.string.label_accessmic),
                                textAlign = TextAlign.Center
                            )
                        }
                        perm.isPermanentlyDenied() -> {
                            Text(
                                text = stringResource(R.string.label_denymic),
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PermissionPreview() {
    PAM_ActivityIntentTheme {
        PermissionScreen()
    }
}