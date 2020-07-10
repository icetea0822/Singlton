# Singlton
双重锁单例模式

```java
public class Singleton {
    Context context;
    private Singleton(Context context){
        this.context=context;
    }

    private static volatile Singleton instance;

    public static Singleton getInstance(Context context){
        if(instance==null){
            synchronized (Singlton.class){
                if(instance==null){
                    instance=new Singleton(context);

                }
            }
        }
        return instance;
    }
}
```

```kotlin
class Singleton private constructor(context: Context) {
    companion object {
        @Volatile
        private var instance: Single? = null
        fun getInstance(context: Context) = instance ?: synchronized(this) {
            instance ?: Singleton(context).also { instance = it }
        }
    }
}
```
