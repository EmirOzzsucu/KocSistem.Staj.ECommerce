package com.example.olxkotlinn


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.olxkotlinn.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showChatsFragment()

        binding.bottomNv.setOnItemSelectedListener { item ->
            when (item.itemID) {
                R.id.menu_home -> {
                    showChatsFragment()
                    true
                }

                R.id.menu_chats -> {
                    showChatsFragment()
                    true
                }

                R.id.menu_my_ads -> {
                    showMyAdsFragment()
                    true
                }

                R.id.menu_account -> {
                    showAccountFragment()
                    true
                }

                else -> {
                    false
                }
            }

        }
    }

    private fun showHomeFragment() {

        binding.toolbarTitleTv.text = "Home"
        val fragment = HomeFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentFl.id.fragment, "HomeFragment")
        fragmentTransaction.commit()

    }

    private fun showChatsFragment() {

        binding.toolbarTitleTv.text = "Chats"
        val fragment = ChatsFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentFl.id.fragment, "ChatsFragment")

    }

    private fun showMyAdsFragment() {

        binding.toolbarTitleTv.text = "My Ads"
        val fragment = ChatsFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentFl.id.fragment, "MyAdsFragment")

    }

    private fun showAccountFragment() {

        binding.toolbarTitleTv.text = "Account"
        val fragment = AccountFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentFl.id.fragment, "AccountFragment")


    }
}
