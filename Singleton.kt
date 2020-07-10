
import android.content.Context
import kotlin.contracts.Returns

class Singleton private constructor(context: Context) {
    companion object {
        @Volatile
        private var instance: Single? = null
        fun getInstance(context: Context) = instance ?: synchronized(this) {
            instance ?: Singleton(context).also { instance = it }
        }
    }
}
