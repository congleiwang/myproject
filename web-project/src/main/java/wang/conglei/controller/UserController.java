package wang.conglei.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import wang.conglei.UserDto;

import java.sql.Date;

/**
 * @author lei
 */
@RestController
@RequestMapping("user")
@Api(value = "UserController")
public class UserController {

    @GetMapping(value = "getUserById")
    @ApiOperation(value = "查询用户信息")
    public UserDto getUserById(String id) {
        if (StringUtils.isNotEmpty(id)) {
            UserDto userDto = new UserDto();
            userDto.setId("1");
            userDto.setUserName("aa");
            userDto.setBirthday(new Date(1995,3,1));
            userDto.setCreateGmt(new java.util.Date());
            return userDto;
        }
        return null;
    }

    @PostMapping(value = "insertUser")
    @ApiOperation(value = "新增用户")
    public UserDto insertUser(@RequestBody UserDto userDto) {
        if (userDto != null) {
            userDto.setId("1001");
            return userDto;
        }
        return null;
    }


}
