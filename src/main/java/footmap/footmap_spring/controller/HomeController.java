package footmap.footmap_spring.controller;

import footmap.footmap_spring.dto.teamDto.team;
import footmap.footmap_spring.dto.userDto.user;
import footmap.footmap_spring.service.teamService.TeamService;
import footmap.footmap_spring.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;



@Controller
public class HomeController {

    @Autowired
    private UserService userService;
    @Autowired
    private TeamService teamService;



    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/user")
    public String list(Model model){
        List<user> getUserList = userService.getUserList();
        model.addAttribute("user",getUserList);
        return "user";
    }
    @GetMapping("/team")
    public String list2(Model model){
        List<team> getTeamList = teamService.getTeamList();
        model.addAttribute("team",getTeamList);
        return "team";
    }

}
