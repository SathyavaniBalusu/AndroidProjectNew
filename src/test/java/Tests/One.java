package Tests;

import BusinessLogic.ChoosePartner;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class One {
    @Test
    public static void newmethod() throws MalformedURLException, InterruptedException {
        System.out.println("in method");
        ChoosePartner P= new ChoosePartner();
        P.Choose();
    }
}
