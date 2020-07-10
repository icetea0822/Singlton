import android.content.Context;
import android.widget.Toast;

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
