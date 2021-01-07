package com.example.testfragment
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import com.example.testfragment.fragments.BlankFragment
import com.example.testfragment.fragments.ConsolesFragment
import com.example.testfragment.fragments.GamesFragment
import com.example.testfragment.fragments.HomeFragment as

class MainActivity : AppCompatActivity(), View.OnClickListener{
    private lateinit var buttonHome : Button
    private lateinit var buttonConsole : Button
    private lateinit var buttonGames : Button
    private lateinit var homeFragment : HomeFragment
    private lateinit var gamesFragment : GamesFragment
    private lateinit var consoleFragment : ConsolesFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonHome = findViewById(R.id.button_home)
        buttonHome.setOnClickListener(this)
        buttonConsole = findViewById(R.id.button_consoles)
        buttonConsole.setOnClickListener(this)
        buttonGames = findViewById(R.id.button_games)
        buttonGames.setOnClickListener(this)
        homeFragment = HomeFragment()
        gamesFragment = GamesFragment()
        consoleFragment = ConsolesFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, homeFragment).commit()
    }
    override fun onClick(v: View) {
        when(v.id) {
            R.id.button_home -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, homeFragment).commit()
            }
            R.id.button_consoles -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, consoleFragment).commit()
            }
            R.id.button_games -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame, gamesFragment).commit()
            }
        }
    }

    override fun onCreateView(){ onNavigationItemSelected(item: MenuItem): Boolean{
        when (item.itemId) -> {

            R.id.menu_home

        }

    }
        return true
    }

}