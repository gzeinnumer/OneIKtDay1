package com.gzeinnumer.oneiktday1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    //todo 39
//    private val binding: ActivityMainBinding by viewBinding()
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todo 37 komen this
//        setSupportActionBar(binding.toolbar)
//
//        val host : NavHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment? ?: return
//
//        val navController = host.navController
//
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//
//        binding.navView.setupWithNavController(navController)
//
//        navController.addOnDestinationChangedListener { _, destination, _ ->
//            val dest: String = try {
//                resources.getResourceName(destination.id)
//            } catch (e: Resources.NotFoundException) {
//                destination.id.toString()
//            }
//
//            Toast.makeText(this@MainActivity, "Navigated to $dest",Toast.LENGTH_SHORT).show()
//        }
//
//        setupActionBarWithNavController(navController, appBarConfiguration)
        //end todo 37

        //end todo 38
        setSupportActionBar(findViewById(R.id.toolbar))
        val navController = findNavController(R.id.fragmentContainerView)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.mainFragment,
                R.id.viewTransactionFragment,
                R.id.chooseRecipientFragment,
                R.id.viewBalanceFragment
            )
        )

        setupActionBarWithNavController(navController, appBarConfiguration)

        findViewById<BottomNavigationView>(R.id.nav_view).setupWithNavController(navController)
        //todo 38
    }
}