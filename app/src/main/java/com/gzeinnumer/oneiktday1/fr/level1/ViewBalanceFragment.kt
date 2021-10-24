package com.gzeinnumer.oneiktday1.fr.level1

import android.os.Bundle
import android.view.View
import android.viewbinding.library.fragment.viewBinding
import androidx.fragment.app.Fragment
import com.gzeinnumer.oneiktday1.R
import com.gzeinnumer.oneiktday1.databinding.FragmentViewBalanceBinding

class ViewBalanceFragment : Fragment(R.layout.fragment_view_balance) {

    private val binding: FragmentViewBalanceBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}