package org.rosen.automation.project.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import org.rosen.automation.project.screenplay.pages.Main;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnDeployPopupWithProductDetail implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(Main.PRODUCT_IMAGE_DETAIL_OPTION).andAlignToBottom(),
                MoveMouse.to(Main.PRODUCT_IMAGE_DETAIL_OPTION),
                Click.on(Main.PRODUCT_DETAIL_OPTION));
    }

    public static ClickOnDeployPopupWithProductDetail productDetailOption() {
        return instrumented(ClickOnDeployPopupWithProductDetail.class);
    }
}
