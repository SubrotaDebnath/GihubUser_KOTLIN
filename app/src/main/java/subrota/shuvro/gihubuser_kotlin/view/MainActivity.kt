package subrota.shuvro.gihubuser_kotlin.view

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ProgressBar
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login_aleart.view.*
import subrota.shuvro.gihubuser_kotlin.R
import subrota.shuvro.gihubuser_kotlin.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profile.visibility

        val mainViewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(this.application)).get(MainViewModel::class.java)
        var userName:String = ""

        if (!mainViewModel.isLoggedIn()){
            val builder = AlertDialog.Builder(this)
            val root = LayoutInflater.from(this).inflate(R.layout.login_aleart, null)
            val alertDialog = builder.create()
            root.loginGoBtn.setOnClickListener {
                userName = root.usernameET.text.toString().trim()
                if (userName!=null && userName !=("")){
                    alertDialog.dismiss()

                }else{
                    root.usernameET.error = "Empty User Name"
                }
            }
            alertDialog.setView(root)
            alertDialog.setCancelable(false)
            //builder.show()
            alertDialog.show()
        }

        mainViewModel.getUserDetails(userName)

    }
}