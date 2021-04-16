package com.bulatov.bulatov_lesson_6


import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.NavHostFragment
import com.bulatov.bulatov_lesson_6.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    companion object {
        const val FRAGMENT_FIRST = "Item One"
        const val FRAGMENT_SECOND = "Item Two"
        const val FRAGMENT_THIRD = "Item Three"
    }

    lateinit var mainActivity: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivity.root)
        val toolbar = mainActivity.mainToolbar
        setSupportActionBar(toolbar)
        val bottomNavigationView = mainActivity.navView
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment?
        val navController = navHostFragment!!.navController
        toolbar.setOnMenuItemClickListener {
            Toast.makeText(this, it.title, Toast.LENGTH_SHORT).show()
            true
        }
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_fragmentFirst -> {
                    FRAGMENT_FIRST.setVisibleMenuGroup(toolbar)
                    navController.navigate(R.id.navigation_fragmentFirst)
                    true
                }
                R.id.navigation_fragmentSecond -> {
                    FRAGMENT_SECOND.setVisibleMenuGroup(toolbar)
                    navController.navigate(R.id.navigation_fragmentSecond)
                    true
                }
                R.id.navigation_fragmentThird -> {
                    FRAGMENT_THIRD.setVisibleMenuGroup(toolbar)
                    navController.navigate(R.id.navigation_fragmentThird)
                    true
                }
                else -> false
            }
        }
    }

    private fun String.setVisibleMenuGroup(toolbar: Toolbar) {
        when (this) {
            FRAGMENT_FIRST -> {
                toolbar.title = this
                toolbar.menu.setGroupVisible(R.id.fragment_first_menu, true)
                toolbar.menu.setGroupVisible(R.id.fragment_second_menu, false)
            }
            FRAGMENT_SECOND -> {
                toolbar.title = this
                toolbar.menu.setGroupVisible(R.id.fragment_first_menu, false)
                toolbar.menu.setGroupVisible(R.id.fragment_second_menu, true)
            }
            FRAGMENT_THIRD -> {
                toolbar.title = this
                toolbar.menu.setGroupVisible(R.id.fragment_first_menu, false)
                toolbar.menu.setGroupVisible(R.id.fragment_second_menu, false)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
}