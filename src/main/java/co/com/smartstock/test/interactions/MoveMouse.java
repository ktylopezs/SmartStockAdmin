//package co.com.smartstock.test.interactions;
//
//import co.com.smartstock.test.userinterfaces.ObjectOrdenEntrada;
//import net.serenitybdd.core.steps.Instrumented;
//import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Interaction;
//import net.serenitybdd.screenplay.actions.Click;
//
//import java.awt.*;
//
//public class MoveMouse implements Interaction {
//
//    public static final int MAX_Y = 380;
//    public static final int MAX_X = 250;
//
//    public static void movermouse() throws AWTException {
//        Robot robot = new Robot();
//        robot.mouseMove((MAX_X), (MAX_Y));
//    }
//
//
//    @Override
//    public <T extends Actor> void performAs(T actor) {
//        try {
//            MoveMouse.movermouse();
//        } catch (AWTException e) {
//            throw new RuntimeException(e);
//        }
//        actor.attemptsTo(Click.on(ObjectOrdenEntrada.Bodega1));
//    }
//
//    public static MoveMouse mover() {
//        return Instrumented.instanceOf(MoveMouse.class).withProperties();
//    }
//}
