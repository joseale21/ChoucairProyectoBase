package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChouicairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that show us the form to login")
            .located(By.xpath("//div[@class='d-none d-lg-block']//storng[contains(text(),'Ingresar')]"));
    public static final Target IMPUT_USER =Target.the("Where do write the user")
            .located(By.id("username"));
    public static final Target IMPUT_PASSWORD =Target.the("Where do write the password")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("button to confirn login")
            .located(By.xpath("//button[contains(@class, 'btn btn-primary')]"));
}
