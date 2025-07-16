package learn.web;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvLoader {
    public static void loadEnv() {
        Dotenv dotenv = Dotenv.load();

        System.setProperty("MONGO_DATABASE", dotenv.get("MONGO_DATABASE"));
        System.setProperty("MONGO_USERNAME", dotenv.get("MONGO_USERNAME"));
        System.setProperty("MONGO_PASSWORD", dotenv.get("MONGO_PASSWORD"));
        System.setProperty("MONGO_CLUSTER", dotenv.get("MONGO_CLUSTER"));
    }
}
