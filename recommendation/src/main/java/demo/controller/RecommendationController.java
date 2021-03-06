package demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="users/{userId}")
@RefreshScope
public class RecommendationController {

    @Value("${example.property}")
    private String exampleProperty;

    @RequestMapping(value="/movies",method=RequestMethod.GET)
    public String getMovies() {
        return exampleProperty + " " + "Frozen";
    }

}
