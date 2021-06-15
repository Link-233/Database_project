package yyx.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import yyx.entity.UserInfo;
import yyx.service.UserService;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/findusers")
    public String getUser(@RequestParam(value="pn",defaultValue = "1")Integer pn,
                          Model model){
        //非常多的记录，需要分页
        //引入page helper插件
        //在查询之前只需要调用
        PageHelper.startPage(pn, 5);

        List<UserInfo> users = userService.getAll();
        //包装查询后的结果
        //封装了详细的信息，包括查询出来的数据，连续传入5页
        PageInfo page=new PageInfo(users,5);
        model.addAttribute("pageInfo",page);

        return "users";
    }
}
