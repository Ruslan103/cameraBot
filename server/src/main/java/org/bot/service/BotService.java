package org.bot.service;

import org.bot.manager.BotManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BotService {
    private BotManager botManage;
    public void startKeyboardSimulate(){
        botManage.setDone(true);
        botManage.keyboardSimulate();
    }
    public void stopKeyboardSimulate(){
        botManage.setDone(false);
        botManage.keyboardSimulate();
    }
}
