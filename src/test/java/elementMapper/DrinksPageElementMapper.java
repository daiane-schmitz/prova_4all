package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrinksPageElementMapper {

    @FindBy(id = "add-product-0-btn")
    public WebElement addCocaColaToCartBtn;

    @FindBy(id = "add-product-1-btn")
    public WebElement addGrapeFantaToCartBtn;

    @FindBy(id = "add-product-2-btn")
    public WebElement addWaterToCartBtn;
}
