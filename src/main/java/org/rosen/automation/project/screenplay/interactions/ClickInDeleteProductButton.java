package org.rosen.automation.project.screenplay.interactions;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ClickInDeleteProductButton implements Interaction {
    private WebElementFacade deleteOption;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(deleteOption));
    }

    public static ClickInDeleteProductButton deleteProductButton(WebElementFacade deleteOption) {
        return instrumented(ClickInDeleteProductButton.class, deleteOption);
    }
}
