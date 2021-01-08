$(window).bind( 'orientationchange', function(e){
    location.reload();
});
//初始化方法
function initPage() {
    initHeaderModel();
    //禁止头部自动滚动。太难看。
    $("#head").css("position", "relative");
    initBottomModel();
    $("#waitingPic").css("transition-duration", "0.5s");
    $("#waitingPic").css("transform", "rotate(45deg)");
    initVideo();
    setTimeout(() => {
        $("#waitingPic").css("transform", "rotate(0deg)");
    }, 500);
    setTimeout(() => {
        $("#contact").css("display", "block");
        $("#head").css("display", "block");
        $(".video_main").css("display", "block");
        $(".video_more_main").css("display", "block");
        $("#bottom-main").css("display", "block");
        $("#contact").css("display", "block");
        $("#waitingDiv").css("display", "none");
    }, 1000);
}

function initVideo() {
    var videoJsonInfo = $.parseJSON($("#videoJsonInfo").text());
    var videoJsonInfoLeft = videoJsonInfo.left;
    var videoJsonInfoRight = videoJsonInfo.right;
    for (var i = 0; i < videoJsonInfoLeft.length; i++) {
        $("#video_left").append('<div class="video_left_main">\n' +
            '<div class="video_show_tittle" style="background-color: ' + videoJsonInfoLeft[i].color + '">\n' +
            '<h5 class="video_show_tittle_h5">' + videoJsonInfoLeft[i].tittle1 + '</h5>\n' +
            '<p class="video_show_tittle_p">' + videoJsonInfoLeft[i].tittle2 + '</p>\n' +
            '</div>\n' +
            '<div class="video_show_video">\n' + videoJsonInfoLeft[i].url +
            '</div>\n' +
            '</div>');
    }
    for (var i = 0; i < videoJsonInfoRight.length; i++) {
        $("#video_right")
            .append('<div class="video_right_main">\n' +
                '<div class="video_show_tittle" style="background-color: ' + videoJsonInfoRight[i].color + '">\n' +
                '<h5 class="video_show_tittle_h5">' + videoJsonInfoRight[i].tittle1 + '</h5>\n' +
                '<p class="video_show_tittle_p">' + videoJsonInfoRight[i].tittle2 + '</p>\n' +
                '</div>\n' +
                '<div class="video_show_video">\n' + videoJsonInfoRight[i].url +
                '</div>\n' +
                '</div>\n' +
                '</div>')
    }
}