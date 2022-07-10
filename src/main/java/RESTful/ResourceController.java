package RESTful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daniil Tkachev
 */
@RestController
public class ResourceController {
    private static final String pattern = "Привет, %s!";

    @RequestMapping("/start")
    public Resource request(@RequestParam(value="name", required=false, defaultValue="друг") String name) {
        return new Resource(String.format(pattern, name));
    }
}
