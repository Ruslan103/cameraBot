package org.bot.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bot.service.BotService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/bot")
@RequiredArgsConstructor
@Slf4j
public class BotController {
    private BotService botService;

    @PostMapping("/start")
    public void startKeyboardSimulate() {
        botService.startKeyboardSimulate();
    }

    @PostMapping("/stop")
    public void stopKeyboardSimulate() {
        botService.stopKeyboardSimulate();
    }
}
