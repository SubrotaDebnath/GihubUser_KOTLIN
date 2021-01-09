package subrota.shuvro.gihubuser_kotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import subrota.shuvro.gihubuser_kotlin.R
import subrota.shuvro.gihubuser_kotlin.viewModel.FollowingViewModel

class Following : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_following)

        val viewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(this.application)).get(FollowingViewModel::class.java)
    }
}