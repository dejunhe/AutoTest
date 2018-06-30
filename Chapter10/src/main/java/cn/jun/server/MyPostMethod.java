package cn.jun.server;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value = "/", description = "这是我全部的post接口")
@RequestMapping("/vi")
public class MyPostMethod {
    //这个变量用来装我们的cookies信息的
    private static Cookie cookies;

    //用户登录成功获取到的cookies，然后再访问其他接口获取列表
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "登录接口，成功后获取cookies信息", httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "userName", required = true) String userName,
                        @RequestParam(value = "password", required = true) String password) {
        if (userName.equals("zhangsan")&&password.equals("123456")) {
            cookies = new Cookie("login","true");
            response.addCookie(cookies);
            return "恭喜你登录成功了！";
        }
        return "用户名或密码错误！";
    }
    //
}
