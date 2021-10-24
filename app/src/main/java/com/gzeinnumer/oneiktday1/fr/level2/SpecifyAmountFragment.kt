package com.gzeinnumer.oneiktday1.fr.level2

import android.os.Bundle
import android.view.View
import android.viewbinding.library.fragment.viewBinding
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.gzeinnumer.oneiktday1.R
import com.gzeinnumer.oneiktday1.databinding.FragmentSpecifyAmountBinding
import com.gzeinnumer.oneiktday1.model.Money
import java.math.BigDecimal

class SpecifyAmountFragment : Fragment(R.layout.fragment_specify_amount) {

    private val binding: FragmentSpecifyAmountBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        initOnClick()
    }

    lateinit var navController: NavController
    lateinit var name: String

    private fun initView() {
        navController = Navigation.findNavController(binding.root)

        name = arguments?.getString("name") ?: "no Name"
        binding.tvRecipient.text = name
    }

    private fun initOnClick() {
        binding.btnSend.setOnClickListener {
            val amount = Money(BigDecimal(binding.edAmount.text.toString()))
            val bundle = bundleOf("name" to name, "amount" to amount)
            navController.navigate(R.id.action_specifyAmountFragment_to_confirmationFragment, bundle)
        }
        binding.btnCancel.setOnClickListener {
            activity?.onBackPressed()
        }
    }
}