package org.rosen.automation.project.screenplay.interactions;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ClickInAddButtonForList implements Interaction {
    private Target image;
    private WebElementFacade button;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(image).andAlignToBottom(),
                MoveMouse.to(image),
                Click.on(button));
    }

    public static ClickInAddButtonForList buttonOption(Target image, WebElementFacade button) {
        return instrumented(ClickInAddButtonForList.class, image, button);
    }
}
