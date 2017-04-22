package DemoNopeCommercePOM;

/**
 * Created by Dell on 09/04/2017.
 */
public class RetryLogic<T> {

    /**
     * Generic retry logic. Delegate must throw the specified exception type to trigger the retry logic.
     */
        public static interface Delegate<T>
        {
            T call() throws Exception;
        }

        private int maxAttempts;
        private int retryWaitSeconds;
        @SuppressWarnings("rawtypes")
        private Class retryExceptionType;

        public RetryLogic(int maxAttempts, int retryWaitSeconds, @SuppressWarnings("rawtypes") Class retryExceptionType)
        {
            this.maxAttempts = maxAttempts;
            this.retryWaitSeconds = retryWaitSeconds;
            this.retryExceptionType = retryExceptionType;
        }

        public T getResult(Delegate<T> caller) throws Exception {
            T result = null;
            int remainingAttempts = maxAttempts;
            do {
                try {
                    result = caller.call();
                } catch (Exception e){
                    if (e.getClass().equals(retryExceptionType))
                    {
                        if (--remainingAttempts == 0)
                        {
                            throw new Exception("Retries exausted.");
                        }
                        else
                        {
                            try {
                                Thread.sleep((1000*retryWaitSeconds));
                            } catch (InterruptedException ie) {
                            }
                        }
                    }
                    else
                    {
                        throw e;
                    }
                }
            } while  (result == null && remainingAttempts > 0);
            return result;
        }
}

