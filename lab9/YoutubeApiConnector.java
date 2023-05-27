public class YoutubeApiConnector implements ApiConnector {
    private String url;
    private String key;

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void setApiKey(String key) {
        this.key = key;
    }

    @Override
    public void doRequest(String query) {
        if (key != null && url != null) {
            System.out.printf("QUERY '%s' to %s with API key '%s'%n", query, url, key);
        } else {
            System.out.println("ERROR: URL or API KEY is null");
        }
    }

    @Override
    public void closeConnection() {
        url = null;
        key = null;
    }
}