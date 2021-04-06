package pageObjects;

import elementMapper.CandyPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CandyPage extends CandyPageElementMapper {

    public CandyPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickAddChocolatBallToCart(){
        addChocolatBallToCartBtn.click();
    }

    public void clickAddAlfajorToCart(){
        addAlfajorToCartBtn.click();
    }

}
