package com.example.utp.Controller;

import com.example.utp.Config.ServerResponse;
import com.example.utp.Entity.User;
import com.example.utp.Service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@Api(tags = "用户注册登录功能相关接口")
public class LoginController {

    @Autowired
    private UserService userService;


    /*
    * 获取手机验证码*/
    @PostMapping("/tel")
    @ApiOperation("获取手机验证码")
    public ServerResponse getTel(){
        //调用短信服务接口
        return null;
    }




    @PostMapping("/users")
    @ApiOperation("注册功能相关接口(三要素加手机验证码比对)")
    public ServerResponse register(@RequestBody User user){
        return null;
    }





    @GetMapping("/users")
    @ApiOperation("登录功能接口")
    public ServerResponse login(User user){
        return null;
    }

}
