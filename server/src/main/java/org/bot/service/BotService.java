package org.bot.service;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.awt.*;

import static java.awt.event.KeyEvent.VK_F4;
import static java.awt.event.KeyEvent.VK_F9;

@Service
@Data
public class BotService {
    private Boolean done;
    Robot robot = new Robot();

    public BotService() throws AWTException {
    }

    public void keyboardSimulate() {
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
