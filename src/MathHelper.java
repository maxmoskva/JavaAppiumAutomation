import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

public class MathHelper {

    public int simple_int = 1;
    public static int static_int = 2;

    public int calc (int a, int b, char action)
    {
        if (action == '+'){
            return this.plus(a, b);
        } else if (action == '-'){
            return this.minus(a, b);
        } else if (action == '*'){
            return this.multiply(a, b);
        } else if (action == '/'){
            this.divide(a, b);
        } else {
            return this.typeAnError("Wrong " + action);
        }
        return 0;
    }

    private int typeAnError (String error_message){
        System.out.println(error_message);
        return 0;
    }

    private int plus (int a, int b)
    {
        return a + b;
    }
    private int minus (int a, int b)
    {
        return a - b;
    }
    private int multiply (int a, int b)
    {
        return a * b;
    }
    private int divide (int number, int devider)
    {
        if (devider == 0){
            return this.typeAnError("Nelzya na nol");
        } else {
            return number /devider;
        }
    }
}
