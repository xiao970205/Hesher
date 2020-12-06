package com.Hesher.web;

import com.Hesher.pojo.*;
import com.Hesher.service.LeftMenuServiceImpl;
import com.Hesher.service.TeacherServiceImpl;
import com.Hesher.service.VideoShowServiceImpl;
import com.Hesher.service.WeChatGongServiceImpl;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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


    @Autowired
    private VideoShowServiceImpl videoShowService;

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
            jsonObject.put("id", teacher.getId());
            jsonArray.add(jsonObject);
        }
        return jsonArray.toString();
    }

    @RequestMapping("/getHeaderLeftMenuInfo")
    @ResponseBody
    public String getHeaderLeftMenuInfo() {
        return getLeftMenu(null).toString();
    }

    @RequestMapping("/text")
    @ResponseBody
    public String text() {
        return null;
    }

    @RequestMapping("/jumpUrl")
    public String jumpUrl(HttpServletRequest request, Model model) {
        String jumpPage = request.getParameter("page");
        if ("teacher".equals(jumpPage)) {
            String teacherId = request.getParameter("id").toString();
            model.addAttribute("id", teacherId);
            Teacher teacher = teacherService.selectByPrimeKey(teacherId);
            if (teacher == null) {
                return "index";
            }
            model.addAttribute("name", teacher.getName());
            model.addAttribute("shortInfo", teacher.getTeachershortinfo());
            model.addAttribute("Info", teacher.getTeacherinfo());
            model.addAttribute("Info2", teacher.getTeacherinfo2());
            model.addAttribute("Info3", teacher.getTeacherinfo3());
            model.addAttribute("pic1", teacher.getPic1());
            model.addAttribute("pic2", teacher.getPic2());
            model.addAttribute("teacherPagePic1", teacher.getTeacherPagePic1());
            model.addAttribute("teacherPagePic2", teacher.getTeacherPagePic2());
            model.addAttribute("instrument", teacher.getInstrument());
        } else if ("video".equals(jumpPage)) {
            VideoShowExample example = new VideoShowExample();
            example.setOrderByClause("video_y");
            example.setOrderByClause("video_x");
            List<VideoShow> videoShows = videoShowService.selectByExample(example);
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArrayLeft = new JSONArray();
            JSONArray jsonArryRight = new JSONArray();
            for (VideoShow video : videoShows) {
                JSONObject jsonVideo = new JSONObject();
                jsonVideo.put("url", video.getVideoUrl());
                jsonVideo.put("tittle1",video.getVideoTittle1());
                jsonVideo.put("tittle2",video.getVideoTittle2());
                jsonVideo.put("color",video.getColor());
                if (video.getVideoY() == 0) {
                    jsonArrayLeft.add(jsonVideo);
                } else {
                    jsonArryRight.add(jsonVideo);
                }
            }
            jsonObject.put("left",jsonArrayLeft);
            jsonObject.put("right",jsonArryRight);
            model.addAttribute("videoInfo",jsonObject.toString());
        } else {
            jumpPage = "index";
        }
        return jumpPage;
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
            if ("child".equals(menuLeve1.getMenuType())) {
                //拥有子链接
                jsonLeve1.put("type", "child");
                jsonLeve1.put("chlidmenu", getLeftMenu(menuLeve1.getId()));
            } else if ("wechatGong".equals(menuLeve1.getMenuType())) {
                //微信公众号
                jsonLeve1.put("type", "child");
                jsonLeve1.put("chlidmenu", getWeChatLeftMenuArray());
            } else if ("jump".equals(menuLeve1.getMenuType())) {
                //本页跳转
                jsonLeve1.put("type", "jump");
                jsonLeve1.put("typeInfo", menuLeve1.getMenuJumpInfo());
            } else if ("address1".equals(menuLeve1.getMenuType())) {
                //弹出
                jsonLeve1.put("type", "address1");
            }
            jsonArray.add(jsonLeve1);
        }

        return jsonArray;
    }

    private JSONArray getWeChatLeftMenuArray() {
        WechatgongExample example = new WechatgongExample();
        example.setOrderByClause("createTime desc LIMIT 5");
        List<Wechatgong> wechatgongList = weChatGongService.selectByExampleWithBLOBs(example);
        JSONArray jsonArray = new JSONArray();
        for (Wechatgong wechatgong : wechatgongList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", wechatgong.getTittle());
            jsonObject.put("url", wechatgong.getUrl());
            jsonObject.put("type", "extra_link");
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }
}
