package utils;

/*Class in charge of generating the order code*/
public class OrderNumberGenerator{
    private static OrderNumberGenerator instance;
    private int counter = 0;
    // in the constructor nothing is put, because we are not saving anything
    // it is in charge of generating the number and already
    private OrderNumberGenerator(){}
    public static synchronized OrderNumberGenerator getInstance() {
        if ( instance == null){
            instance = new OrderNumberGenerator();
        }
        return instance;
    }
    // This gives the new next order number
    public synchronized String generateOrderNumber() {
        counter++;
        return String. format("PED-%04d", counter); // EXAMPLE: PED-0001
    }
}
