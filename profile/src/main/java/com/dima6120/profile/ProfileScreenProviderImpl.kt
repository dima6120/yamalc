package com.dima6120.profile

import androidx.lifecycle.Lifecycle
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.dima6120.profile.ui.ProfileScreen
import com.dima6120.profile_api.ProfileScreenProvider
import com.dima6120.profile_api.ProfileRoute
import javax.inject.Inject

class ProfileScreenProviderImpl @Inject constructor(): ProfileScreenProvider {

    override fun provideDestination(
        lifecycle: Lifecycle?,
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController
    ) {
        navGraphBuilder.composable<ProfileRoute> {
            ProfileScreen(
                id = it.id,
                lifecycle = lifecycle ?: it.lifecycle,
                route = it.toRoute(),
                navController = navController
            )
        }
    }
}