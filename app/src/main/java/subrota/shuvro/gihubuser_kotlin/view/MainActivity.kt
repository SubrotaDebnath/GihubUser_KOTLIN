package subrota.shuvro.gihubuser_kotlin.view

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.login_aleart.view.*
import subrota.shuvro.gihubuser_kotlin.R
import subrota.shuvro.gihubuser_kotlin.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainViewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(this.application)).get(MainViewModel::class.java)

        if (!mainViewModel.isLoggedIn()){
            val builder = AlertDialog.Builder(this)
            val root = LayoutInflater.from(this).inflate(R.layout.login_aleart, null)
            val alertDialog = builder.create()
            root.loginGoBtn.setOnClickListener {
                val userName = root.usernameET.text.toString()
                if (userName!=null && !userName.equals("")){
                    //getUserDetails(userName)
                    alertDialog.dismiss()
                }else{
                    root.usernameET.error = "Empty User Name"
                }
            }
            alertDialog.setView(root)
            alertDialog.setCancelable(false)
            //builder.show()
            alertDialog.show()
        }else{
            mainViewModel.getUserDetails("")
        }

    }
}