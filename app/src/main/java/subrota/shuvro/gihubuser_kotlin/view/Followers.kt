package subrota.shuvro.gihubuser_kotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import subrota.shuvro.gihubuser_kotlin.R
import subrota.shuvro.gihubuser_kotlin.viewModel.FollowersViewModel

class Followers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_followers)

        val followersViewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(this.application)).get(FollowersViewModel::class.java)
    }
}