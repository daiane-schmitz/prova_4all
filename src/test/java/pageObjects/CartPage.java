package pageObjects;

import elementMapper.CartPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartPage extends CartPageElementMapper {

    public CartPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickChocolateBallPlusBtn() {
        int i;
        for (i = 1; i <= 4; i++) {
            plusChocolateBallBtn.click();
        }
    }
    public void clickRisolePlusBtn(){
        int i;
        for (i = 1; i <= 9; i++) {
            plusRisoleBtn.click();
        }
    }

    public String getQtdChocolateBall(){
        return qtdChocolateBall.getText();
    }

    public boolean isQtdChocolateBallFive(){
        return getQtdChocolateBall().equals("5");
    }

    public String getQtdRisole(){
        return qtdRisole.getText();
    }

    public boolean isQtdRisoleTen(){
        return getQtdRisole().equals("10");
    }

    public void clickRisoleMinusBtn() {
        int i;
        for (i = 1; i <= 5; i++) {
            minusRisoleBtn.click();
        }
    }
    public boolean isQtdRisoleFive(){
        return getQtdRisole().equals("5");
    }

    public String getTotalPrice(){
        return totalPrice.getText();
    }

    public boolean isTotalPriceCorrect(){
        return getTotalPrice().contains("36,00");
    }

    public void clickCheckOutBtn(){
        checkOutBtn.click();
    }

    public String getSuccessMessage(){
        return successMessage.getText();
    }

    public boolean isSucessMessage(){
        return getSuccessMessage().equals("Pedido realizado com sucesso!");
    }

    public void clickCloseBtn(){
        closeBtn.click();
    }




}
