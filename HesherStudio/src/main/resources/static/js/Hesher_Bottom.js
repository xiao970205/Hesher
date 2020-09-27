function initBottomModel() {
    var scarmWidth = $(window).width();
    //head标签
    if (scarmWidth <= 1024) {
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
});

$(function () {
    $("#bottom-return-top-div").click(function () {
        $("html,body").animate({scrollTop: 0}, 500);
    });
});

$(function () {
    $("#bottom-logo-img").click(function () {
        $(location).attr("href", "/");
    });
})

/**
 * 需要header模块,弹出微信二维码
 */
function openWeChatInfo() {
    document.getElementById('weChatModel').style.display = "block";
}