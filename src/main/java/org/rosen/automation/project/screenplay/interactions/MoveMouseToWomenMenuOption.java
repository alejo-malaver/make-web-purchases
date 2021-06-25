package org.rosen.automation.project.screenplay.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.rosen.automation.project.screenplay.pages.Main;

public class MoveMouseToWomenMenuOption implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(Main.WOMEN_MENU_OPTION));
    }

    public static MoveMouseToWomenMenuOption menuOption() {
        return instrumented(MoveMouseToWomenMenuOption.class);
    }
}
