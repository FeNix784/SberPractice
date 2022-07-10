package RESTful;

/**
 * @author Daniil Tkachev
 */
public class Resource {
    private final String content;

    public Resource(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
