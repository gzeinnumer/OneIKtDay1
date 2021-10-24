package com.gzeinnumer.oneiktday1.fr.level1

import android.os.Bundle
import android.view.View
import android.viewbinding.library.fragment.viewBinding
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.gzeinnumer.oneiktday1.R
import com.gzeinnumer.oneiktday1.databinding.FragmentChooseRecipientBinding

class ChooseRecipientFragment : Fragment(R.layout.fragment_choose_recipient) {

    private val binding: FragmentChooseRecipientBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        initOnClick()
    }

    lateinit var navController: NavController

    private fun initView() {
        navController = Navigation.findNavController(binding.root)
    }

    private fun initOnClick() {
        binding.btnNext.setOnClickListener {
            val bundle = bundleOf("name" to binding.edName.text.toString())
            navController.navigate(R.id.action_chooseRecipientFragment_to_specifyAmountFragment, bundle)
        }
        binding.btnCancel.setOnClickListener {
            activity?.onBackPressed()
        }
    }
}