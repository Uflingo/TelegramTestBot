package com.uflingo.bot.test;

import com.uflingo.bot.test.service.Bot;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

//@ComponentScan
public class Application/* extends SpringBootServletInitializer */{
    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new Bot());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }

    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.bannerMode(Banner.Mode.OFF).sources(applicationClass);
//    }
//
//    private static Class<Application> applicationClass = Application.class;
}
