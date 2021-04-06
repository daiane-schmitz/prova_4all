package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageElementMapper {


    @FindBy(css = "#add-product-4-qtd > span")
    public WebElement plusChocolateBallBtn;

    @FindBy(id = "product-4-qtd")
    public WebElement qtdChocolateBall;

    @FindBy(css = "#remove-product-3-qtd > span")
    public WebElement minusRisoleBtn;

    @FindBy(css = "#add-product-3-qtd > span")
    public WebElement plusRisoleBtn;

    @FindBy(id = "product-3-qtd")
    public WebElement qtdRisole;

    @FindBy(id = "price-total-checkout")
    public WebElement totalPrice;

    @FindBy(id = "finish-checkout-button")
    public WebElement checkOutBtn;

    @FindBy(css = "#root > div.ReactModalPortal > div > div > div > h2")
    public WebElement successMessage;

    @FindBy(css = "button.close-modal.sc-jqCOkK.ippulb")
    public WebElement closeBtn;

}
