package shop.mtcoding.blogv2.user;

import javax.print.DocFlavor.STRING;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/join")
    public String join() {
        return "/";
    }

    @PostMapping("/joinForm")
    public String joinForm() {
        return "redirect:/";
    }

}
