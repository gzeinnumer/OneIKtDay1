package com.gzeinnumer.oneiktday1.fr.level3

import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.viewbinding.library.fragment.viewBinding
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.gzeinnumer.est.SpannableBuilder
import com.gzeinnumer.oneiktday1.R
import com.gzeinnumer.oneiktday1.databinding.FragmentConfirmationBinding
import com.gzeinnumer.oneiktday1.model.Money

class ConfirmationFragment : Fragment(R.layout.fragment_confirmation) {

    private val binding: FragmentConfirmationBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    lateinit var navController: NavController
    lateinit var name: String
    lateinit var money: Money

    private fun initView() {
        navController = Navigation.findNavController(binding.root)

        name = arguments?.getString("name") ?: "no Name"
        money = arguments?.getParcelable("amount")!!

        val confirmationMessage = "You have sent ${money.amount} to $name"
        binding.tvMsg.text = confirmationMessage

        val colorRed = ContextCompat.getColor(requireContext(), R.color.red_500)
        val colorPrimary = ContextCompat.getColor(requireContext(), R.color.purple_500)
        val msg: CharSequence = SpannableBuilder(context)
            .text(Typeface.NORMAL, "You have sent ")
            .textColor(Typeface.BOLD,"${money.amount}", colorRed)
            .text(Typeface.NORMAL, " to ")
            .textColor(Typeface.BOLD, name, colorPrimary)
            .build()
        binding.tvMsg.text = msg
    }
}