package org.rosen.automation.project.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.rosen.automation.project.screenplay.pages.Main;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickInTShirtsSubmenuOption implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Main.T_SHIRTS_SUBMENU_OPTION));
    }

    public static ClickInTShirtsSubmenuOption submenuOption() {
        return instrumented(ClickInTShirtsSubmenuOption.class);
    }
}
