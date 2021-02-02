package bg.softuni.mobilele.mobilele.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/brands")
public class BrandsController {

    @GetMapping("/all")
    public String allBrands(){
        return "brands";
    }
}
