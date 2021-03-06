//判断横屏竖屏 1为横屏，2为竖屏
var orientationSize;
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

$(window).bind( 'orientationchange', function(e){
    location.reload();
});
//初始化方法
function initPage() {
    initHeaderModel();
    initVideoDiv();
    initNews();
    initBottomModel();
    $("#waitingPic").css("transition-duration","0.5s");
    $("#waitingPic").css("transform","rotate(45deg)");
    setTimeout(()=>{
        $("#waitingPic").css("transform","rotate(0deg)");
    },500);
    setTimeout(()=>{
        $("#contact").css("display","block");
        $("#newsTop").css("display","block");
        $("#news").css("display","block");
        $("#pure-g").css("display","block");
        $("#showHesher").css("display","block");
        $("#display").css("display","block");
        $("#head").css("display","block");
        $("#bottom-main").css("display","block");
        $("#hesher_video_vid").css("display","block");
        $("#waitingDiv").css("display","none");
        $("#waitingPic").css("display","none");
        newsAnmiate();
        news_animate = setInterval(() => newsAnmiate(), 6000);
    },1000);

}

var now_animate_size = 3;
var now_animate_teacher_id = "";
var piclist = null;
var userJsonArray = null;

/**
 * 获取json数组长度
 * @param json
 * @returns {number}
 */
function getHsonLength(json){
    var jsonLength=0;
    for (var i in json) {
        jsonLength++;
    }
    return jsonLength;
}
var os = function (){
    var ua = navigator.userAgent,
        isWindowsPhone = /(?:Windows Phone)/.test(ua),
        isSymbian = /(?:SymbianOS)/.test(ua) || isWindowsPhone,
        isAndroid = /(?:Android)/.test(ua),
        isFireFox = /(?:Firefox)/.test(ua),
        isChrome = /(?:Chrome|CriOS)/.test(ua),
        isTablet = /(?:iPad|PlayBook)/.test(ua) || (isAndroid && !/(?:Mobile)/.test(ua)) || (isFireFox && /(?:Tablet)/.test(ua)),
        isPhone = /(?:iPhone)/.test(ua) && !isTablet,
        isPc = !isPhone && !isAndroid && !isSymbian;
    return {
        isTablet: isTablet,
        isPhone: isPhone,
        isAndroid: isAndroid,
        isPc: isPc
    };
}();
function initNews() {
    orientationSize = getorientationSize();
    $.ajax({
        url: "/getTeacherRunInfo",
        type: "get",
        async:false,
        success: function f(data) {
            userJsonArray = $.parseJSON(data);
        }
    })
    if(getHsonLength(userJsonArray)!=4){
        alert("教师人数不足4！请联系管理员！");
        return;
    }
    if(orientationSize == 1){
        piclist = [userJsonArray[0].picWeb,userJsonArray[1].picWeb,userJsonArray[2].picWeb,userJsonArray[3].picWeb];
        $("#news_bottom_0").css({"background": "url(../pic/" + piclist[0] + ") no-repeat", "background-size": "cover"});
        $("#news_bottom_1").css({"background": "url(../pic/" + piclist[1] + ") no-repeat", "background-size": "cover"});
        $("#news_bottom_2").css({"background": "url(../pic/" + piclist[2] + ") no-repeat", "background-size": "cover"});
        $("#news_bottom_3").css({"background": "url(../pic/" + piclist[3] + ") no-repeat", "background-size": "cover"});
    } else {
        piclist = [userJsonArray[0].picMoblie,userJsonArray[1].picMoblie,userJsonArray[2].picMoblie,userJsonArray[3].picMoblie];
    }
    $("#news-pic").css({
        "background": "url(../pic/" + piclist[3] + ") no-repeat",
        "background-size": "cover",
        "height": "100%",
        "width": "100%"
    });

}

var news_animate = null;

function newsAnmiate() {
    $(".new_bottom_blue").css({width: '0%'});
    var next_ainmate_size = now_animate_size + 1;
    if (next_ainmate_size == 4) {
        next_ainmate_size = 0;
    }
    $(".new_bottom_blue").css({width: '0%'});
    $("#news-pic").css({
        "transition": "transform 0s",
        "transform": "scale(1.0)",
        "background": "url(../pic/" + piclist[next_ainmate_size] + ") no-repeat",
        "background-size": "cover"
    });
    $("#news_teacher_name").html(userJsonArray[next_ainmate_size].name);
    $("#news_teacher_info").html(userJsonArray[next_ainmate_size].info2);
    now_animate_size = next_ainmate_size;
    now_animate_teacher_id = userJsonArray[next_ainmate_size].id;
    setTimeout(() => {
        $("#news-pic").css({"transition": "transform 5s", "transform": "scale(1.2)"});
        $("#news_bottom_" + now_animate_size + "_blue").animate({width: '100%'}, 5000);
    }, 10);
}

function jumToTeacherPageByNews() {
    jumpUrl("jumpUrl?page=teacher&id="+now_animate_teacher_id);
}

function clickNews(select_animate_size) {
    if (select_animate_size == now_animate_size) {
        return;
    }
    if (select_animate_size == 0) {
        select_animate_size = 3
    } else {
        select_animate_size = select_animate_size - 1;
    }
    clearInterval(news_animate);
    news_animate = null;
    $(".new_bottom_blue").stop();
    $(".new_bottom_blue").css({width: '0%'});
    $("#news-pic").attr("style", "");
    $("#news-pic").css({
        "background": "url(../pic/" + piclist[select_animate_size] + ") no-repeat",
        "background-size": "cover",
        "height": "100%",
        "width": "100%"
    });
    now_animate_size = select_animate_size;
    newsAnmiate();
    news_animate = setInterval(() => newsAnmiate(), 6000);
}

/**
 * 初始化视频模块
 */
function initVideoDiv() {
    $("#hesher_video_bottom_p").hover(function () {
        $("#hesher_video_bottom_p").animate({opacity: '0.5'}, 200);
    }, function () {
        $("#hesher_video_bottom_p").animate({opacity: '1.0'}, 200);
    });

    $("#heasher_video_logo").hover(function () {
        $("#heasher_video_logo").animate({opacity: '0.5'}, 200);
    }, function () {
        $("#heasher_video_logo").animate({opacity: '1.0'}, 200);
    });

    $("#pure-g-div-bottom_left_t").hover(function () {
        $("#pure-g-div-bottom_left_t").animate({opacity: '0.5'}, 200);
    }, function () {
        $("#pure-g-div-bottom_left_t").animate({opacity: '1.0'}, 200);
    });

    $("#pure-g-div-bottom_right_t").hover(function () {
        $("#pure-g-div-bottom_right_t").animate({opacity: '0.5'}, 200);
    }, function () {
        $("#pure-g-div-bottom_right_t").animate({opacity: '1.0'}, 200);
    });
    $("#showHesher_right_down").hover(function () {
        $("#showHesher_right_down p").animate({opacity: '0.5'}, 200);
    }, function () {
        $("#showHesher_right_down p").animate({opacity: '1.0'}, 200);
    });
    $("#showHesher_left_down").hover(function () {
        $("#showHesher_left_down p").animate({opacity: '0.5'}, 200);
    }, function () {
        $("#showHesher_left_down p").animate({opacity: '1.0'}, 200);
    });
    $("#news-pic").on("touchmove",function (e) {
        console.log("调用");
        var _touch = e.originalEvent.targetTouches[0];
        var _x= _touch.pageX;
        console.log(_x);
    })
}

document.documentElement.addEventListener('touchstart', function (event) {
    if (event.touches.length > 1) {
        event.preventDefault();
    }
}, false);
var lastTouchEnd = 0;
document.documentElement.addEventListener('touchend', function (event) {
    var now = Date.now();
    if (now - lastTouchEnd <= 300) {
        event.preventDefault();
    }
    lastTouchEnd = now;
}, false);