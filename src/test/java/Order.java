
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.crimearent.precondition.Precondition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class Order extends Precondition {
    



    @Test()
    public void crimeaRentPositiveOrder() throws Exception {
        //a[@id='linkprimary-tab-content00' and contains (text(), "Внешний вид")] String varCityOne = "Алушта";
        String varCityTwo = "Бахчисарай";

        String varTimeTake = "10.08.2018";
        String varTimeReturn = "14.08.2018";

        String varTimeOne = "00:00";
        String varTimeTwo= "00:00";

        String varPromoCode= "0";


//        mainPage.enterTakeAndReturnCityDataTimePromocodeSubmit(varCityOne,varCityTwo,varTimeTake,varTimeReturn
//                ,varTimeOne, varTimeTwo, varPromoCode);
        System.out.println();
        Thread.sleep(5555555);


    }
}
