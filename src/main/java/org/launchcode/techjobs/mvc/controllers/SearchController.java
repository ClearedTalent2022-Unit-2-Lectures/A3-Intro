package org.launchcode.techjobs.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.launchcode.techjobs.mvc.controllers.ListController.columnChoices;


/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @GetMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    // TODO #3 - Create a handler to process a search request and render the updated search view.
    //  What kind of request is this handler method going to be mapped to?
    //  What path do we need to map this method to?
    //  Since we are handling a request that's coming from a form, there is some data attached
    //  to our request. What is that data called?
    //  What html view should this method render?





}
