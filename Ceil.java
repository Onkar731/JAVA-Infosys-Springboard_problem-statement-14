public class Ceil {
    public static long ceil(double number) {
        long ceilNumber = 0;

        // if the number has fractional part, return the next whole number
        if((number - (int)number) > 0) {
            ceilNumber = (int)(number + 1);
        } else {
            ceilNumber = (int)number;
        }

        return ceilNumber;
    }
}
