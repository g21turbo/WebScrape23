import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class WebScraper {
    public static void main(String[] args) {
        try {
            // Connect to the webpage
            Document doc = Jsoup.connect("https://www.reddit.com").get();

            // Extract the title of the webpage
            String title = doc.title();

            // Print the title
            System.out.println("Title: " + title);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
