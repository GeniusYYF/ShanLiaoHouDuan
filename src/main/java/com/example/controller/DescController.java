package com.example.controller;

import com.example.entity.Response;
import com.example.entity.Desc;
import com.example.service.DescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/desc")
public class DescController {
    @Autowired
    private DescService descService;

    //@PathVariable int id
    //查找我和某人的所有记录，点击某人开始聊天用
    @RequestMapping(value = "getMsgs", method = RequestMethod.GET)
    public Response GetMsgs(String myId, String youId) {
        System.out.println(myId + youId);
        List<Desc> msgs = descService.GetMsgs(myId, youId);
        //查找我注册时候的description，用于聊天记录第一条显示
        Desc descsFirst = descService.GetMsgsInitDesc(myId).get(0);
        msgs.add(0, descsFirst);
        System.out.println("查询聊天信息成功" + msgs);
        return new Response(200, msgs, "查询聊天信息成功");
    }

    //查找我和所有人的记录,更新对应的description，加载消息列表用
    //在UserController中用到descService.GetMsgsInitDesc(myId);
//    @RequestMapping(value = "getMsgsInitDesc", method = RequestMethod.GET)
//    public Response GetMsgsInitDesc(String myId) {
//        List<Desc> msgs = descService.GetMsgsInitDesc(myId);
//        System.out.println("查询聊天信息成功" + msgs);
//        return new Response(200, msgs, "查找成功");
//    }
    //保存一条聊天信息
    @RequestMapping(value = "saveDesc", method = RequestMethod.POST)
    public Response SaveDesc(@RequestBody Desc desc) {
        System.out.println("Desc:" + desc);
        //一条消息需要存两次
        descService.SaveDesc(desc.getMyId(), desc.getMyMsg(), desc.getYouId(), desc.getYouMsg(), new Date().getTime() + "", null);
        descService.SaveDesc(desc.getYouId(), desc.getYouMsg(), desc.getMyId(), desc.getMyMsg(), new Date().getTime() + "", null);
        return new Response(200, null, "保存聊天信息成功：" + desc.getMyMsg() + desc.getYouMsg());
    }
}
