import java.util.concurrent.Callable;

public class CallableExmp {
    public static void main(String[] args) {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                // Perform some computation
                Thread.sleep(2000);
                return "Return some result";
            }
        };
        Callable<String> callable1 = () -> {
            // Perform some computation
            Thread.sleep(2000);
            return "Return some result";
        };

    }
}
