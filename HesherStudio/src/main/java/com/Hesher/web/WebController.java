package com.Hesher.web;

import com.Hesher.pojo.*;
import com.Hesher.service.LeftMenuServiceImpl;
import com.Hesher.service.TeacherServiceImpl;
import com.Hesher.service.WeChatGongServiceImpl;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static com.Hesher.pojo.Utils.strIsNull;

@Controller
public class WebController {

    @Autowired
    private TeacherServiceImpl teacherService;

    @Autowired
    private LeftMenuServiceImpl leftMenuService;

    @Autowired
    private WeChatGongServiceImpl weChatGongService;


    @RequestMapping("/")
    public String hello() {
        return "index";
    }

    @RequestMapping("/getTeacherRunInfo")
    @ResponseBody
    public String hello2() {
        TeacherExample teacherExample = new TeacherExample();
        teacherExample.createCriteria().andIndexShowEqualTo(1);
        teacherExample.setOrderByClause("index_range ASC");
        JSONArray jsonArray = new JSONArray();
        List<Teacher> teacherList = teacherService.selectByExample(teacherExample);
        for (Teacher teacher : teacherList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", teacher.getName());
            jsonObject.put("picWeb", teacher.getPic1());
            jsonObject.put("picMoblie", teacher.getPic2());
            jsonObject.put("info1", teacher.getTeacherinfo());
            jsonObject.put("info2", teacher.getTeachershortinfo());
            jsonArray.add(jsonObject);
        }
        System.out.println(jsonArray.toString());
        return jsonArray.toString();
    }

    @RequestMapping("/getHeaderLeftMenuInfo")
    @ResponseBody
    public String getHeaderLeftMenuInfo() {
        System.out.println(getLeftMenu(null));
        return getLeftMenu(null).toString();
    }

    @RequestMapping("/text")
    @ResponseBody
    public String text() {
        WechatgongExample example = new WechatgongExample();
        example.setOrderByClause("createTime desc LIMIT 5");
        List<Wechatgong> wechatgongList = weChatGongService.selectByExample(example);
        JSONArray jsonArray = new JSONArray();
        for(Wechatgong wechatgong:wechatgongList){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name",wechatgong.getTittle());
            jsonObject.put("url",wechatgong.getUrl());
            jsonObject.put("type","extra_link");
            jsonArray.add(jsonObject);
        }
        System.out.println(jsonArray);
        return jsonArray.toString();
    }

    private JSONArray getLeftMenu(String fatherMenuId) {
        JSONArray jsonArray = new JSONArray();
        LeftMenuExample leftMenuExample = new LeftMenuExample();
        if (strIsNull(fatherMenuId)) {
            leftMenuExample.createCriteria().andFatherMenuIdIsNull();
        } else {
            leftMenuExample.createCriteria().andFatherMenuIdEqualTo(fatherMenuId);
        }
        leftMenuExample.setOrderByClause("menu_order asc");
        List<LeftMenu> leftMenuList = leftMenuService.selectByExample(leftMenuExample);
        for (LeftMenu menuLeve1 : leftMenuList) {
            JSONObject jsonLeve1 = new JSONObject();
            jsonLeve1.put("name", menuLeve1.getMenuName());
            if (menuLeve1.getMenuType().equals("child")) {
                //拥有子链接
                jsonLeve1.put("type", "child");
                jsonLeve1.put("chlidmenu", getLeftMenu(menuLeve1.getId()));
            } else if (menuLeve1.getMenuType().equals("wechatGong")) {
                //微信公众号
                jsonLeve1.put("type", "child");
                jsonLeve1.put("chlidmenu", getWeChatLeftMenuArray());
            } else if (menuLeve1.getMenuType().equals("jump")) {
                //本页跳转
                jsonLeve1.put("type", "jump");
                jsonLeve1.put("typeInfo", menuLeve1.getMenuJumpInfo());
            } else if (menuLeve1.getMenuType().equals("address1")) {
                //弹出
                jsonLeve1.put("type", "address1");
            }
            jsonArray.add(jsonLeve1);
        }

        return jsonArray;
    }

    private JSONArray getWeChatLeftMenuArray(){
        WechatgongExample example = new WechatgongExample();
        example.setOrderByClause("createTime desc LIMIT 5");
        List<Wechatgong> wechatgongList = weChatGongService.selectByExample(example);
        JSONArray jsonArray = new JSONArray();
        for(Wechatgong wechatgong:wechatgongList){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name",wechatgong.getTittle());
            jsonObject.put("url",wechatgong.getUrl());
            jsonObject.put("type","extra_link");
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }
}
