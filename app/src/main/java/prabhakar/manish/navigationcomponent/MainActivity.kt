package prabhakar.manish.navigationcomponent

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//1. Add gradle dependency
//val nav_version = "2.8.1"
//implementation("androidx.navigation:navigation-fragment:$nav_version")
//implementation("androidx.navigation:navigation-ui:$nav_version")
//2. create all the fragments you want
//3. create nav_graph
//goto res-android resource directory->navigation->ok
//4.add navhostfragment in activity_main.xml
//5.add all fragments in nav_graph
//6.add startDestination in nav_graph
//7.

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

