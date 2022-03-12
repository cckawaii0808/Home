package com.ccplay.home.ui.notifications

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.ccplay.home.R
import com.ccplay.home.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null
    private val TAG = NotificationsFragment::class.java.simpleName

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val textView: TextView = binding.textNotifications
        //notificationsViewModel.text.observe(viewLifecycleOwner) {
           // textView.text = it
        //}
        binding.bsignup.setOnClickListener(Navigation.createNavigateOnClickListener
            (R.id.register_fragment, null))//指定跳轉頁面
        Log.d(TAG,"點擊註冊")


        return root



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}