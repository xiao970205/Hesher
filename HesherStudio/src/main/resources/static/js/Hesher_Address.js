function openPic(event){
    dontclose();
    $("body").css("overflow-y", "hidden");
    $("html").css("overflow-y", "hidden");
    $(".jumpPic").css("transform", "translateX(-0vw)");
    $(".jumpPic").append("<div class='openPic_pic' style = \"" +
        "background: url('../pic/"+event.data.picUrl+"'"+") no-repeat;\n" +
        "background-size: cover;" +
        "position: absolute;" +
        "left: 0;" +
        "top: 0;" +
        "bottom: 0;" +
        "right: 0;" +
        "margin: auto;" +
        "transition: transform 0.5s;" +
        "transform: scale(0.0)"+
        "\"></div>");
    if(event.data.type == "1"){
        $(".openPic_pic").css("width","70vh");
        $(".openPic_pic").css("height","100vh");
    }else if(event.data.type == "2"){
        $(".openPic_pic").css("width","100vw");
        $(".openPic_pic").css("height","140vw");
    }
    setTimeout(()=>{
        $(".openPic_pic").css("transform","scale(1.0)");
    },500)

}
function closePic(){
    $(".openPic_pic").css("transform","scale(0.0)");
    setTimeout(()=>{
        $("html").css("overflow-y", "auto");
        $("body").css("overflow-y", "auto");
        $(".jumpPic").css("transform", "translateX(-100vw)");
        $(".jumpPic").empty();
    },500);
}
function openAddress() {
	dontclose();
    $("body").css("overflow-y", "hidden");
    $("html").css("overflow-y", "hidden");
    $("#contact").css("transform", "translateX(-0vw)");
    $("#button_model_anime_1").css("display", "block");
    $("#button_model_anime_2").css("display", "block");
    $("#button_model_anime_3").css("display", "block");
    $("#button_model_anime_4").css("display", "block");
    $("#button_model_anime_5").css("display", "block");
    $("#button_model_anime_6").css("display", "block");
    $("#contact_weChat_div").css("display", "block");
    $("#contact_DouYin_div").css("display", "block");
    $("#closecontact").css({"display": "block"});
    setTimeout(() => {
        $("#button_model_anime_1").css({"transform": "scale(1.0)"});
        $("#button_model_anime_2").css({"transform": "scale(1.0)"});
        $("#button_model_anime_3").css({"transform": "scale(1.0)"});
        $("#button_model_anime_4").css({"transform": "scale(1.0)"});
        $("#button_model_anime_5").css({"transform": "scale(1.0)"});
        $("#button_model_anime_6").css({"transform": "scale(1.0)"});
        // $("#contact_weChat_div").css({"transform": "translateY(0vh)"});
        $("#contact_weChat_div").css({"transform": "scale(0.0)"});
        // $("#contact_DouYin_div").css({"transform": "translateY(0vh)"});
        $("#contact_DouYin_div").css({"transform": "scale(0.0)"});
        $("#closecontact").css({"transform": "scale(1.0)"});
    }, 300);
}

function closeImg() {
    $("html").css("overflow-y", "auto");
    $("body").css("overflow-y", "auto");
    $("#button_model_anime_1").css({"transform": "scale(0.0)"});
    $("#button_model_anime_2").css({"transform": "scale(0.0)"});
    $("#button_model_anime_3").css({"transform": "scale(0.0)"});
    $("#button_model_anime_4").css({"transform": "scale(0.0)"});
    ;
    $("#button_model_anime_5").css({"transform": "scale(0.0)"});
    $("#button_model_anime_6").css({"transform": "scale(0.0)"});
    // $("#contact_weChat_div").css({"transform": "translateY(80vh)"});
    $("#contact_weChat_div").css({"transform": "scale(1.0)"});
    // $("#contact_DouYin_div").css({"transform": "translateY(80vh)"});
    $("#contact_DouYin_div").css({"transform": "scale(1.0)"});
    $("#closecontact").css({"transform": "scale(0.1)"});
    if (WechatPicOpen == 1) {
        weChatClick(null);
    }
    if (DouYinPicOpen == 1) {
        douYinCLick(null);
    }
    setTimeout(() => {
        $("#button_model_anime_1").css("display", "none");
        $("#button_model_anime_2").css("display", "none");
        $("#button_model_anime_3").css("display", "none");
        $("#button_model_anime_4").css("display", "none");
        $("#button_model_anime_5").css("display", "none");
        $("#button_model_anime_6").css("display", "none");
        $("#contact_weChat_div").css("display", "none");
        $("#contact_DouYin_div").css("display", "none");
        $("#closecontact").css("display", "none");
        $("#contact").css("transform", "translateX(-100vw)");
    }, 500);
}


function phoneButtonClick(divInfo) {
    dontclose();
    douDong(divInfo);
    setTimeout(() => {
        window.open("tel:13333110964");
    }, 300);
}

function jumpToWeiBoAndDou(divInfo) {
    dontclose();
    douDong(divInfo);
    setTimeout(() => {
        jumpToWeiBoPage();
    }, 300);

}

function onClickEmail(divInfo) {
    dontclose();
    douDong(divInfo);
    setTimeout(() => {
        window.open("mailto:hesherstudio@foxmail.com");
    }, 300);
}

var WechatPicOpen = 0;

function weChatClick(divInfo) {
    dontclose()
    if (divInfo != null) {
        douDong(divInfo);
    }
    setTimeout(() => {
        if (WechatPicOpen == 0) {
            //打开微信二维码
            $("#contact_weChat_div").animate({height:'340px'},500);
            $("#contact_weChat_div").css({"transform": "scale(1.0)"});
            WechatPicOpen = 1;
        } else {
            //关闭微信二维码
            $("#contact_weChat_div").animate({height:'0px'},500);
            $("#contact_weChat_div").css({"transform": "scale(0.0)"});
            WechatPicOpen = 0;
        }
    }, 300);
}

var DouYinPicOpen = 0;

function douYinCLick(divInfo) {
    dontclose();
    if (divInfo != null) {
        douDong(divInfo);
    }
    setTimeout(() => {
        if (DouYinPicOpen == 0) {
            //打开抖音二维码
            $("#contact_DouYin_div").animate({height:'340px'},500);
            $("#contact_DouYin_div").css({"transform": "scale(1.0)"});
            DouYinPicOpen = 1;
        } else {
            //关闭抖音二维码
            $("#contact_DouYin_div").animate({height:'0px'},500);
            $("#contact_DouYin_div").css({"transform": "scale(0.0)"});
            DouYinPicOpen = 0;
        }
    }, 300);
}

function jumpToBiliBililAndAnmite(divInfo) {
    dontclose();
    douDong(divInfo);
    setTimeout(() => {
        jumpToBiBiliPage();
    }, 300);
}

function douDong(divInfo) {
    $(divInfo).css("transform", "translateY(-2vw)");
    $(divInfo).children(".address_img").css("transform", "translateY(-2vw)");
    setTimeout(() => {
        $(divInfo).css("transform", "translateY(0vw)");
        $(divInfo).children(".address_img").css("transform", "translateY(0vw)");
    }, 100);
}