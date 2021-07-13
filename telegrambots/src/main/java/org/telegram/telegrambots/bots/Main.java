// import org.telegram.telegrambots.ApiContextInitializer;
//  import org.telegram.telegrambots.TelegramBotsApi;
//  import org.telegram.telegrambots.exceptions.TelegramApiException;
package TATA_TG_BOT;

import org.telegram.telegrambots.meta.api.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Main {
	public static void main(String[] args) {
		
		TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
		// Initialize Api Context
		ApiContextInitializer.init();

		// Instantiate Telegram Bots API
		TelegramBotsApi botsApi = new TelegramBotsApi();

		// Register our bot
		try {
			botsApi.registerBot(new MyAmazingBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}