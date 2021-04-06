package pageObjects;

import elementMapper.AllPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AllPage extends AllPageElementMapper {

    public AllPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickAddRisoleToCart(){
        addRisoleToCartBtn.click();
    }


}
