package pageObjects;

import elementMapper.DrinksPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class DrinksPage extends DrinksPageElementMapper {

    public DrinksPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickAddCocaColaToCart(){
        addCocaColaToCartBtn.click();
    }

    public void clickAddGrapeFantaToCart(){
        addGrapeFantaToCartBtn.click();
    }

    public void clickAddWaterToCart(){
        addWaterToCartBtn.click();
    }
}
