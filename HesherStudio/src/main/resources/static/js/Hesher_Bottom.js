function initBottomModel() {
    //head标签
    if (getorientationSize()==2) {
        $("#bottom-main").css("background-position", "center center");
        $("#bottom-main").css("height", "400px");
        $("#bottom-logo-img").css("width", "85px");

        $(".address-us-li").css("width", "100%");
        $(".address-us-li").css("margin-top", "20px");
        $(".address-us-li").css("border-left", "0");
        $(".address-us-li").css("padding-left", "0");

    } else {
        $("#bottom-main").css("background-position", "bottom left");
        $("#bottom-main").css("height", "400px");
        $("#bottom-logo-img").css("width", "170px");

        $(".address-us-li").css("width", "auto");
        $(".address-us-li").css("margin-top", "0");
        $(".address-us-li").css("border-left", "1px solid rgb(136, 136, 136)");
        $(".address-us-li").css("padding-left", "10");
    }
}

$(document).ready(function () {
    $("#bottom-return-top-div").hover(function () {
        $("#bottom-return-top-div").animate({opacity: '0.5'}, 200);
    }, function () {
        $("#bottom-return-top-div").animate({opacity: '0.9'}, 200);
    });
    $("#bottom-logo-img").click(function () {
        $(location).attr("href", "/");
    });
});

/**
 * 需要header模块,弹出微信二维码
 */
function openWeChatInfo() {
    $("body").css("overflow-y", "hidden");
    $("html").css("overflow-y", "hidden");
    $(".getWeChatPic").css("transform","translateX(0vw)");
    if (getorientationSize()==2) {
        $(".getWeChatPic_pic").css("width","70vw");
        $(".getWeChatPic_pic").css("height","70vw");
    }else{
        $(".getWeChatPic_pic").css("width","400px");
        $(".getWeChatPic_pic").css("height","400px");
    }
    setTimeout(()=>{
        $(".getWeChatPic_pic").css("transform","scale(1.0)");
    },500);
}
function closeGetWeChatPic(){
    $(".getWeChatPic_pic").css("transform","scale(0.0)");
    setTimeout(()=>{
        $(".getWeChatPic").css("transform","translateX(-100vw)");
    },500);
}
function retrunToTop() {
    $("html,body").animate({scrollTop:'0'},500);
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