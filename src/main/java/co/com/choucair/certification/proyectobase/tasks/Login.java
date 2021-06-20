package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChouicairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String srtUser;
    private String srtPassword;
    public Login(String srtUser, String srtPassword) {
        this.srtUser = srtUser;
        this.srtPassword = srtPassword;
    }

    public static Login onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class,strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChouicairLoginPage.LOGIN_BUTTON),
                Enter.theValue(srtUser).into(ChouicairLoginPage.IMPUT_USER),
                Enter.theValue(srtPassword).into(ChouicairLoginPage.IMPUT_PASSWORD),
                Click.on(ChouicairLoginPage.ENTER_BUTTON)
        );
    }
}
