package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChouicairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {


    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChouicairLoginPage.LOGIN_BUTTON),
                Enter.theValue("ingresarTuUsuario").into(ChouicairLoginPage.IMPUT_USER),
                Enter.theValue("ingresarTuContraseña").into(ChouicairLoginPage.IMPUT_PASSWORD),
                Click.on(ChouicairLoginPage.ENTER_BUTTON)
        );
    }
}
