package advancedAlgorithm.BreatdthFirstSearch.webCrawler;

public class App {
    public static void main(String[] args) {
        WebCrawler crawler = new WebCrawler();

        String rootURL = "https://www.startlap.hu/";

        crawler.discoverWeb(rootURL);


    }
}
