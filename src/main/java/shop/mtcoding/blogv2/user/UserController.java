package shop.mtcoding.blogv2.user;

import javax.print.DocFlavor.STRING;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    public static void main(String[] args) {
        System.out.println("-----");
    }


    @GetMapping("/join")
    public String join() {
        return "/";
    }

}
