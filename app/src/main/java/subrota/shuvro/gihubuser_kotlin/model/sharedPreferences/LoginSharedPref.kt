package subrota.shuvro.gihubuser_kotlin.model.sharedPreferences

import android.content.Context

class LoginSharedPref (context: Context){
    private val userName:String = "UserName"
    private val isLoggedIn:String = "status"

    private val preference=context.getSharedPreferences("login", Context.MODE_PRIVATE)
    private val editor=preference.edit()

    fun setIsLogIn(isLogged:Boolean){
        editor.putBoolean(isLoggedIn,isLogged)
        editor.commit()
    }

    fun isLoggedIn():Boolean
    {
        return preference.getBoolean(isLoggedIn, false)
    }

    fun setUserName(name:String)
    {
        editor.putString(userName,name)
        editor.commit()
    }

    fun getUserName():String?
    {
        return preference.getString(userName, "")
    }

}