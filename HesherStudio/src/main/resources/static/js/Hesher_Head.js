//微博链接
var weiboUrl = "https://weibo.com/Pantrick?is_all=1";
//bilibilli链接
var bilibiliUrl = "https://space.bilibili.com/3113010?from=search&seid=11722697212181282065";
//头部左侧Menu信息
var leftMenuInfo = null;

//打开哔哩哔哩
function jumpToBiBiliPage() {
    window.open(bilibiliUrl);
}

//打开微博
function jumpToWeiBoPage() {
    window.open(weiboUrl);
}

function  getorientationSize() {
    var u = navigator.userAgent;
    var o = window.orientation;
    if(u.indexOf("Android")!=-1){
        if(o == 90|| o == -90){
            return 1;
        }else {
            return 2;
        }
    }else if(u.indexOf("iPhone")!=-1){
        if(o == 90|| o == -90){
            return 1;
        }else {
            return 2;
        }
    }else if(u.indexOf("Macintosh")!=-1){
        if(o == 90|| o == -90){
            return 1;
        }else {
            return 2;
        }
    }else {
        if(o == 90|| o == -90){
            return 2;
        }else {
            return 1;
        }
    }
}

/**
 * 初始化头部
 */
function initHeaderModel() {
    //初始化左侧menu信息
    getMenuInfo();
    if (getorientationSize()==2) {
        //手机端
        //隐藏head_down部分
        $("#head_down").css("display","none");
        $("#head_top").css("height", "40px");
        $("#head_top").css("margin-top", "20px");
        $("#head_top").css("border-bottom", "0px solid rgb(119,119,119)");
        $("#head_top").css("background-color", "rgba(0,0,0,0");
        opacityValue = 0;

        $("#head_top_left").css("padding-top", "0px");
        $("#head_top_left").css("width", "56px");

        $("#header-content-left-in").css("padding-left", "16px");

        $("#head-content-right").css("width", "40px");
        $("#head-content-right").css("height", "40px");
        $("#head-content-right").css("padding-right", "16px");

        $("#pos_relative").css("width", "40px");
        $("#pos_relative").css("height", "40px");

        $("#header-content-right-sp").css("display","block");
        $("#header-content-right-wrap").css("display","none");

        $("#logo_div").css("width", "calc(100% - 112px)");

        $("#head_top_logo").css("width", "85px");
        $("#head_top_logo").css("height", "50px");
        initLeftMenuMoble();
    } else {
        //电脑端
        //普通分辨率显示head_down部分
        $("#head_down").css("display","block");
        $("#head_top").css("height", "103px");
        $("#head_top").css("margin-top", "0px");
        $("#head_top").css("border-bottom", "1px solid rgb(119,119,119)");
        $("#head_top").css("background-color", "rgba(0,0,0,0.0");
        opacityValue = 0;

        $("#head_top_left").css("padding-top", "30px");
        $("#head_top_left").css("width", "160px");

        $("#header-content-left-in").css("padding-left", "40px");

        $("#head-content-right").css("width", "234");
        $("#head-content-right").css("height", "66px");
        $("#head-content-right").css("padding-right", "0px");

        $("#pos_relative").css("width", "234px");
        $("#pos_relative").css("height", "66px");

        $("#header-content-right-sp").css("display","none");
        $("#header-content-right-wrap").css("display","block");

        $("#logo_div").css("width", "calc(100% - 394px)");

        $("#head_top_logo").css("width", "170px");
        $("#head_top_logo").css("height", "104px");
        initLeftMenuComputer();
    }
};

/**
 * 局部更新获得菜单信息
 * @returns {jQuery|any|undefined}
 */
function getMenuInfo() {
    $.ajax({
        url: "/getHeaderLeftMenuInfo",
        type: "get",
        async: false,
        success: function f(data) {
            leftMenuInfo = $.parseJSON(data);
        }
    });
}

/**
 * 生成左侧menu信息（电脑分辨率下）
 * @param jsonArray
 * @param level
 * @param fatherId
 */
function createLeftMenuWeb(jsonArray, level, fatherId) {
    if (level > 2) {
        alert("左侧menu生成异常！存在4级menu！");
        return;
    }
    var divNeedDisplayNone = "";
    var fontNeedDisPlayNone = "";
    if (level != 0) {
        divNeedDisplayNone = "style='transition-property: height;transition-property:padding-top; transition-duration: 0.5s;height:0px;padding-top:0px'";
        fontNeedDisPlayNone = " display:none; "
    }
    for (var i = 0; i < jsonArray.length; i++) {
        var menuLeve1Json = jsonArray[i];
        var id = fatherId + "_" + i;
        if (menuLeve1Json.type == "address1") {
            $("#left_menu_web" + level).append("<div class=\"left_menu_web_box_style\" id=\"" + id + "\" onclick='openAddress()'" + divNeedDisplayNone + "><span style='overflow:hidden;white-space:nowrap;text-overflow: ellipsis;color: white;" + fontNeedDisPlayNone + "'>" + menuLeve1Json.name + "</span></div>");
            $("#" + id).bind("mouseenter", {childLevl: (level + 1)}, leftMenuBoxClearChildMenuMouseOn);
        } else if(menuLeve1Json.type == "address2"){
            $("#left_menu_web" + level).append("<div class=\"left_menu_web_box_style\" id=\"" + id + "\"" + divNeedDisplayNone + "><span style='overflow:hidden;white-space:nowrap;text-overflow: ellipsis;color: white;" + fontNeedDisPlayNone + "'>" + menuLeve1Json.name + "</span></div>");
            $("#" + id).bind("mouseenter", {childLevl: (level + 1)}, leftMenuBoxClearChildMenuMouseOn);
            $("#" + id).bind("click", {picUrl: menuLeve1Json.picUrl,type:"1"}, openPic);
        } else if (menuLeve1Json.type == "jump") {
            $("#left_menu_web" + level).append("<div class=\"left_menu_web_box_style\" id=\"" + id + "\"" + divNeedDisplayNone + "><span style='overflow:hidden;white-space:nowrap;text-overflow: ellipsis;color: white;" + fontNeedDisPlayNone + "'>" + menuLeve1Json.name + "</span></div>");
            $("#" + id).bind("mouseenter", {childLevl: (level + 1)}, leftMenuBoxClearChildMenuMouseOn);
            $("#" + id).bind("click", {jumpInfo: menuLeve1Json.typeInfo}, leftMenuJumpUrl);
        } else if (menuLeve1Json.type == "child") {
            $("#left_menu_web" + level).append("<div class=\"left_menu_web_box_style\" id=\"" + id + "\" " + divNeedDisplayNone + " ><span style='overflow:hidden;white-space:nowrap;text-overflow: ellipsis;color: white;" + fontNeedDisPlayNone + "'>" + menuLeve1Json.name + "</span></div>");
            createLeftMenuWeb(menuLeve1Json.chlidmenu, (level + 1), id);
            //绑定事件
            $("#" + id).bind("mouseenter", {
                id: id,
                childNum: menuLeve1Json.chlidmenu.length,
                childLevl: (level + 1)
            }, leftMenuBoxCreateChildMenuMouseOn);
            $("#" + id).bind("click", {jumpInfo: menuLeve1Json.typeInfo}, dontclose);
            if("开设课程" == menuLeve1Json.name){
            	$("#top_teach").bind("click",{
                id: id,
                childNum: menuLeve1Json.chlidmenu.length,
                childLevl: (level + 1)
            }, topTeachClickEvent);
            }
        } else if (menuLeve1Json.type == "extra_link") {
            $("#left_menu_web" + level).append("<div class=\"left_menu_web_box_style\" id=\"" + id + "\"" + divNeedDisplayNone + "><span style='overflow:hidden;white-space:nowrap;text-overflow: ellipsis;color: white;" + fontNeedDisPlayNone + "'>" + menuLeve1Json.name + "</span></div>");
            $("#" + id).bind("mouseenter", {childLevl: (level + 1)}, leftMenuBoxClearChildMenuMouseOn);
            $("#" + id).bind("click", {url: menuLeve1Json.url}, leftMenuJumpExtraUrl);
        }
    };
}

function dontclose(){
	e = window.event || e;
    if (e.stopPropagation) {
        e.stopPropagation();      //阻止事件 冒泡传播
    } else {
        e.cancelBubble = true;   //ie兼容
    }
}

/**
 * 跳转到外部链接
 * @param event
 */
function leftMenuJumpExtraUrl(event) {
	dontclose();
    window.open(event.data.url);
}

/**
 * 跳转到其他页面
 * @param event
 */
function leftMenuJumpUrl(event) {
	dontclose();
    jumpUrl(event.data.jumpInfo);
}

/**
 * 关闭电脑分辨率下的左侧menu的子菜单
 * @param event
 */
function leftMenuBoxClearChildMenuMouseOn(event) {
    var childLevel = event.data.childLevl;
    if (childLevel == 3) {
        return;
    }
    $("#left_menu_web2").css({"background-color": "rgba(77, 77, 77,0)"})
    $("#left_menu_web2").children().css({"padding-top": "0px", "height": "0px", "border-bottom": "0px solid white"});
    $("#left_menu_web2").find("span").css({"display": "none"});
    if (childLevel == 1) {
        $("#left_menu_web1").css({"background-color": "rgba(77, 77, 77,0)"})
        $("#left_menu_web1").children().css({
            "padding-top": "0px",
            "height": "0px",
            "border-bottom": "0px solid white"
        });
        $("#left_menu_web1").find("span").css({"display": "none"});
    }
}

/**
 * 打开电脑分辨率下的左侧menu的子菜单
 * @param event
 */
function leftMenuBoxCreateChildMenuMouseOn(event) {
    var id = event.data.id;
    var childNum = event.data.childNum;
    var childLevel = event.data.childLevl;
    var allChildMenuId = "left_menu_web" + childLevel;
    $("#" + allChildMenuId).css("background-color", "rgba(77, 77, 77,1)");
    $("#" + allChildMenuId).children().css({"padding-top": "0px", "height": "0px", "border-bottom": "0px solid white"});
    $("#" + allChildMenuId).find("span").css({"display": "none"});
    for (var i = 0; i < childNum; i++) {
        $("#" + id + "_" + i).css({
            "padding-top": "18px",
            "height": "50px",
            "border-bottom": "1px solid rgb(77,77,77)"
        });
        $("#" + id + "_" + i).find("span").css({"display": "block"});
    }
}

function topTeachClickEvent(event){
	setTimeout(() => {
    	leftMenuBoxCreateChildMenuMouseOn(event);
    }, 600);
	openOrCloseLeftMenu();
}

/**
 * 本地跳转
 * @param url
 */
function jumpUrl(url) {
    // 跳转链接
    window.location.href=url;
};

/**
 * menu电脑端菜单生成，先一股脑都加进去，然后再根据菜单id判断显示
 */
function initLeftMenuComputer() {
    //清空原有的
    $(".left_menu_web_style").empty();
    //获得
    createLeftMenuWeb(leftMenuInfo, 0, "left_menu_web_level");
    $("#left_menu_web").bind("click", {url: null}, openOrCloseLeftMenu);
}

/**
 * 左侧菜单在电脑端的一级菜单鼠标移动上面事件
 * @param event
 */
function menuComputerLeve1MoveOn(event) {
    var id = event.data.id;
    $("#" + id).css("backgroundColor", "rgba(255,255,255,0.5");
    //判断二级菜单是否有自己子元素
    for (var i = 0; i < $(".menu_computer_leve2").children().length; i++) {
        var childId = $(".menu_computer_leve2").children()[i].id;
        if (childId.search(id) != -1) {
            //属于自己的二级菜单元素
            $("#" + childId).css("display", "block");
        } else {
            //不属于自己的二级菜单
            $("#" + childId).css("display", "none");
        }
    }
}

/**
 * 左侧菜单在电脑端的一级菜单鼠标移动走了事件
 * @param event
 */
function menuComputerLeve1MoveOff(event) {
    var id = event.data.id;
    $("#" + id).css("backgroundColor", "rgba(255,255,255,0.0");
}

/**
 * 左侧菜单在电脑端的二级菜单鼠标移动走了面事件
 * @param event
 */
function menuComputerLeve2MoveOff(event) {
    var id = event.data.id;
    $("#" + id).css("backgroundColor", "rgba(255,255,255,0.0");
}

/**
 * 左侧菜单手机端初始化
 */
function initLeftMenuMoble() {
    $("#left_menu_web").css("display", "none");
    //清空原有菜单项目
    $("#left_menu_moble").css("display", "inline");
    createMobleLeftMenu(leftMenuInfo, "left_menu_moble_0", 0);
}

/**
 * 递归生成手机端左侧menu
 * @param jsonArray
 * @param fatherId
 * @param level
 */
function createMobleLeftMenu(jsonArray, fatherId, level) {
    if (level > 2) {
        alert("左侧menu生成异常！存在4级menu！");
        return;
    }
    var divNeedDisplayNone = "";
    if (level == 1) {
        divNeedDisplayNone = "style='overflow-y:hidden;height:0px;background-color:rgba(77,77,77,0.5);border-bottom:0px solid white;'";
    } else if (level == 2) {
        divNeedDisplayNone = "style='overflow-y:hidden;height:0px;background-color:rgba(77,77,77,1);border-bottom:0px solid white;'";

    }
    for (var i = 0; i < jsonArray.length; i++) {
        var menuLeve1Json = jsonArray[i];
        var id = fatherId + "_" + i;
        if (menuLeve1Json.type == "address1") {
            $("#left_menu_moble_0").append("<div class=\"left_menu_moble_style\" id=\"" + id + "\" onclick='openAddress()' " + divNeedDisplayNone + ">" +
                "<div style='padding-left: 20px;padding-top: 20px'>" +
                "<span style='font-size:18px;overflow:hidden;white-space:nowrap;text-overflow: ellipsis;color: white;" + "'>" + menuLeve1Json.name + "</span>" +
                "</div></div>");
        }else if(menuLeve1Json.type == "address2"){
            $("#left_menu_moble_0").append("<div class=\"left_menu_moble_style\" id=\"" + id + "\"" + divNeedDisplayNone + ">" +
                "<div style='padding-left: 20px;padding-top: 20px'>" +
                "<span style='font-size:18px;overflow:hidden;white-space:nowrap;text-overflow: ellipsis;color: white;" + "'>" + menuLeve1Json.name + "</span>" +
                "</div></div>");
            $("#" + id).bind("click", {picUrl: menuLeve1Json.picUrl,type:"2"}, openPic);
        } else if (menuLeve1Json.type == "jump") {
            $("#left_menu_moble_0").append("<div class=\"left_menu_moble_style\" id=\"" + id + "\"" + divNeedDisplayNone + ">" +
                "<div style='padding-left: 20px;padding-top: 20px'>" +
                "<span style='font-size:18px;overflow:hidden;white-space:nowrap;text-overflow: ellipsis;color: white;" + "" + "'>" + menuLeve1Json.name + "</span>" +
                "</div></div>");
            $("#" + id).bind("click", {jumpInfo: menuLeve1Json.typeInfo}, leftMenuJumpUrl);
        } else if (menuLeve1Json.type == "child") {
            $("#left_menu_moble_0").append("<div class=\"left_menu_moble_style\" id=\"" + id + "\" " + divNeedDisplayNone + ">" +
                "<div style='padding-left: 20px;padding-top: 20px'>" +
                "<span style='font-size:18px;overflow:hidden;white-space:nowrap;text-overflow: ellipsis;color: white;" + "" + "'>" + menuLeve1Json.name + "</span>" +
                "</div></div>");
            createMobleLeftMenu(menuLeve1Json.chlidmenu, id, (level + 1));
            //     //绑定事件
            $("#" + id).bind("click", {id: id}, leftMenuMobleFoder);
            
        } else if (menuLeve1Json.type == "extra_link") {
            $("#left_menu_moble_0").append("<div class=\"left_menu_moble_style\" id=\"" + id + "\"" + divNeedDisplayNone + ">" +
                "<div style='padding-left: 20px;padding-top: 20px;'>" +
                "<span style='font-size:18px;overflow:hidden;white-space:nowrap;text-overflow: ellipsis;color: white;'>" + menuLeve1Json.name + "</span>" +
                "</div></div>");
            $("#" + id).bind("click", {url: menuLeve1Json.url}, leftMenuJumpExtraUrl);
        }
    }
}

/**
 * 展开或折叠手机分辨率下左侧menu菜单
 * @param event
 */
function leftMenuMobleFoder(event) {
    dontclose();
    var id = event.data.id;
    var childrenNodes = $("#left_menu_moble_0").children();
    var isHidden = 1;
    for (var i = 0; i < childrenNodes.length; i++) {
        var childId = childrenNodes.get(i).id;
        if (childId.indexOf(id) != -1 && childId != id && $("#" + childId).css("height") != "0px") {
            //存在展开的
            isHidden = 0;
            break;
        }
    }
    if (isHidden == 1) {
        for (var i = 0; i < 20; i++) {
            if ($("#" + id + "_" + i) == undefined) {
                break;
            } else {
                $("#" + id + "_" + i).css("height", "58px");
                $("#" + id + "_" + i).css("border-bottom", "1px solid white");
            }
        }
    } else {
        for (var i = 0; i < childrenNodes.length; i++) {
            var childId = childrenNodes.get(i).id;
            if (childId.indexOf(id) != -1 && childId != id) {
                $("#" + childId).css("height", "0px");
                $("#" + childId).css("border-bottom", "0px solid white");
            }
        }
    }
}


function jumpToVideoPage(event) {
    jumpUrl("jumpUrl?page=video");
}

//电脑浏览器模式判断是否需要隐藏headdown以及headup颜色变化
var opacityValue = 0;

$(window).scroll(function () {
    if (getorientationSize()==2) {
        // 手机模式
        return;
    }
    var scrollTop = document.documentElement.scrollTop || document.body.scrollTop;
    if (scrollTop > $("#news").height()) {
        $("#head_down").hide();
        opacityValue = 1;
    } else {
        $("#head_down").show();
        opacityValue = 0;
    }
})

//定时任务判断是否需要头部信息变淡。
var opacityTools = self.setInterval("changeOpacity()", 50);

function changeOpacity() {
    var str = $("#head_top").css("background-color");
    var strArray = str.split(", ");
    var opacity = strArray[strArray.length - 1].replace(")", "");
    if (opacityValue == 0) {
        //变透明
        if (parseFloat(opacity) > 0.0) {
            opacity = parseFloat(opacity) - 0.1;
        }
    } else {
        //变不透明
        if (parseFloat(opacity) < 0.5) {
            opacity = parseFloat(opacity) + 0.1;
        }
    }
    $("#head_top").css("background-color", "rgba(0,0,0," + opacity + ")");
}

var menuOpen = 0;
$(function () {
    $("#head_top_logo").click(function () {
        $(location).attr("href", "/");
    });
});

/**
 * 打开关闭左侧menu
 */
function openOrCloseLeftMenu() {
    if (menuOpen == 0) {
        menuOpen = 1;
        $("#left_menu_0").css("transform", "translateX(0vw)");
        $("body").css("overflow-y", "hidden");
        $("html").css("overflow-y", "hidden");
    } else {
        menuOpen = 0;
        $("#left_menu_0").css("transform", "translateX(-100vw)");
        $("html").css("overflow-y", "auto");
        $("body").css("overflow-y", "auto");
    }
}

/**
 * 渐变动画效果
 */
$(document).ready(function () {
    $("#bilibili_logo").hover(function () {
        $("#bilibili_logo").animate({opacity: '0.5'}, 200);
    }, function () {
        $("#bilibili_logo").animate({opacity: '1.0'}, 200);
    });
    $("#weibo_logo").hover(function () {
        $("#weibo_logo").animate({opacity: '0.5'}, 200);
    }, function () {
        $("#weibo_logo").animate({opacity: '1.0'}, 200);
    });
    $("#wechat_logo").hover(function () {
        $("#wechat_logo").animate({opacity: '0.5'}, 200);
    }, function () {
        $("#wechat_logo").animate({opacity: '1.0'}, 200);
    });
    $("#head_top_logo").hover(function () {
        $("#head_top_logo").animate({opacity: '0.5'}, 200);
    }, function () {
        $("#head_top_logo").animate({opacity: '1.0'}, 200);
    });

});