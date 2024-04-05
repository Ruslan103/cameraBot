package org.bot.manager;

import lombok.Data;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.awt.*;

import static java.awt.event.KeyEvent.VK_F4;
import static java.awt.event.KeyEvent.VK_F9;

@Component
@Data
public class BotManager {
    private Boolean done=false;
    Robot robot;

    @SneakyThrows
    public void keyboardSimulate() {
        robot=new Robot();
        while (done) {
            robot.keyPress(VK_F9);
            robot.keyPress(VK_F4);
            robot.delay(100);
            robot.keyPress(VK_F4);
            robot.delay(100);
            robot.keyPress(VK_F4);
        }
    }
}
