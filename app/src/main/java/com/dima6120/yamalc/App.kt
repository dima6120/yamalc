package com.dima6120.yamalc

import android.app.Application
import com.dima6120.core.CoreComponentProviderFactory
import com.dima6120.core_api.AppWithApplicationComponent
import com.dima6120.core_api.ApplicationComponentProvider
import com.dima6120.yamalc.di.ApplicationComponent
import com.dima6120.yamalc.di.DaggerApplicationComponent

class App: Application(), AppWithApplicationComponent {

    private var applicationComponent: ApplicationComponent? = null

    override fun getApplicationComponentProvider(): ApplicationComponentProvider =
        applicationComponent
            ?: DaggerApplicationComponent.factory()
                .createApplicationComponent(
                    context = this,
                    coreComponentProvider = CoreComponentProviderFactory.createCoreComponentProvider(this)
                )
                .also { applicationComponent = it }
}