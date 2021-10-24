package com.gzeinnumer.oneiktday1.fr

import android.os.Bundle
import android.view.View
import android.viewbinding.library.fragment.viewBinding
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.gzeinnumer.oneiktday1.R
import com.gzeinnumer.oneiktday1.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private val binding: FragmentMainBinding by viewBinding()

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
        binding.btnViewTranscation.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToViewTransactionFragment()
            navController.navigate(action)
        }
        binding.btnSendMoney.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToChooseRecipientFragment()
            navController.navigate(action)
        }
        binding.btnViewBalance.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToViewBalanceFragment()
            navController.navigate(action)
        }
    }

}