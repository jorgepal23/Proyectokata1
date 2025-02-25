package net.orangehrmlive.questions;

import net.orangehrmlive.UI.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
//esto es una validacion

public class ValidateWelcomePage implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginUI.LBL_INVALID.resolveFor(actor).isVisible();
    }
    public static Question validate(){
        return new ValidateWelcomePage();
    }
}