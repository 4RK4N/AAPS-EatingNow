package info.nightscout.androidaps.plugins.pump.omnipod.common.ui.wizard.deactivation.fragment.info

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import info.nightscout.androidaps.plugins.pump.omnipod.common.di.OmnipodPluginQualifier
import info.nightscout.androidaps.plugins.pump.omnipod.common.ui.wizard.common.fragment.InfoFragmentBase
import info.nightscout.androidaps.plugins.pump.omnipod.common.ui.wizard.deactivation.viewmodel.info.PodDiscardedViewModel
import javax.inject.Inject

class PodDiscardedFragment : InfoFragmentBase() {

    @Inject
    @OmnipodPluginQualifier
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val vm: PodDiscardedViewModel by viewModels { viewModelFactory }
        this.viewModel = vm
    }

    @IdRes
    override fun getNextPageActionId(): Int? = null

    override fun getIndex(): Int = 3
}