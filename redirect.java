import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class redMalware {
    public static void main(String[] args) {
        String urlDestino = "https://destino.com";

        try {
            java.awt.Desktop.getDesktop().browse(new URL(urlDestino).toURI());

//reverifica
            URL url = new URL(urlDestino);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Este site está seguro.");
            } else {
                System.out.println("Este site pode apresentar riscos de segurança!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
