package org.rosen.automation.project.screenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.rosen.automation.project.screenplay.pages.Main;

public class LoadingPopupInteractions implements Task {
    private static final int TIME_OUT = 10;

    public LoadingPopupInteractions() {
        super();
    }

    public static LoadingPopupInteractions validateLoadingPopup() {
        return instrumented(LoadingPopupInteractions.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toFrame(0),
                WaitUntil.the(Main.IMAGE_IN_POPUP_WITH_PRODUCT_DETAIL, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(TIME_OUT)
                        .seconds());
    }
}