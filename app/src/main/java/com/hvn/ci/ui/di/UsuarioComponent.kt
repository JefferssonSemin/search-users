package com.hvn.ci.ui.di

import com.hvn.ci.data.di.CoreComponent
import com.hvn.ci.ui.UsuarioFragment
import dagger.Component
import dagger.android.support.AndroidSupportInjection
import javax.inject.Singleton

/**
 * Copyright 2019, Kurt Renzo Acosta, All rights reserved.
 *
 * @author Kurt Renzo Acosta
 * @since 08/13/2019
 */

@Singleton
@Component(modules = [AndroidSupportInjection::class, UsuarioModule::class, FragmentModule::class])
interface UsuarioComponent {
    fun inject(usuarioFragment: UsuarioFragment)
}