package subrota.shuvro.gihubuser_kotlin.viewModel

import android.app.AlertDialog
import android.app.Application
import android.view.LayoutInflater
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveDataScope
import kotlinx.android.synthetic.main.login_aleart.view.*
import subrota.shuvro.gihubuser_kotlin.R
import subrota.shuvro.gihubuser_kotlin.model.dataClass.ProfileResponse
import subrota.shuvro.gihubuser_kotlin.model.sharedPreferences.LoginSharedPref

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val loginSharedPref = LoginSharedPref(application)

    fun isLoggedIn():Boolean{
      return loginSharedPref.isLoggedIn()
    }

    fun getUserDetails(userName: String){
        val user: String = if (userName==("")) loginSharedPref.getUserName().toString() else userName

    }
}