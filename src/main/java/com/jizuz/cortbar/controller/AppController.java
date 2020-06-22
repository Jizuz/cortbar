package com.jizuz.cortbar.controller;

import com.alibaba.fastjson.JSON;
import com.jizuz.cortbar.model.TsUserVO;
import com.jizuz.cortbar.service.ITsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    private ITsUserService tsUserService;

    @RequestMapping(value = "/ok", method = RequestMethod.GET)
    public String getStr() {
        System.out.println("O j b k");
        return "O j b k";
    }

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public String getTsUSer() {
        List<TsUserVO> resp = tsUserService.selectAllTsUsers();
        return JSON.toJSONString(resp);
    }
}
