import views.Welcome;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Welcome w = new Welcome();
        do {
            w.welcomeScreen();
        }while(true);
    }

}
