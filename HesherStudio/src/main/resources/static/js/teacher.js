var name;
var teacherPagePic1;
var teacherPagePic2;
var instrument;
var shortInfo;
var Info;
var Info2;
var Info3;
var pic1;
var pic2;

//初始化方法
function initPage() {
    getAllInfo();
    initHeaderModel();
    //禁止头部自动滚动。太难看。
    $("#head").css("position","relative");
    initBottomModel();
    $("#waitingPic").css("display","none");
    initTeacherInfo();
    initInfoLength();
    $("#waitingPic").css("transition-duration","0.5s");
    $("#waitingPic").css("transform","rotate(45deg)");

    setTimeout(()=>{
        $("#waitingPic").css("transform","rotate(0deg)");
    },500);
    setTimeout(()=>{
        $("#contact").css("display","block");
        $("#head").css("display","block");
        $("#bottom-main").css("display","block");
        $("#contact").css("display","block");
        $("#waitingDiv").css("display","none");
    },1000);
}
function getAllInfo(){
    name = $("#name").text();
    teacherPagePic1 = $("#teacherPagePic1").text();
    teacherPagePic2 = $("#teacherPagePic2").text();
    instrument = $("#instrument").text();
    shortInfo = $("#shortInfo").text();
    Info = $("#Info").text();
    Info2 = $("#Info2").text();
    Info3 = $("#Info3").text();
    pic1 = $("#pic1").text();
    pic2 = $("#pic2").text();
}

function initInfoLength(){
    if($(window).width() > 1024){
        return ;
    }
    var info1length = Info.length;
    var info2length = Info2.length;
    var info3length = Info3.length;
    var maxlength = 0;
    if(info1length>info2length){
        maxlength = info1length;
    }else{
        maxlength = info2length;
    }
    if(info3length>maxlength){
        maxlength = info3length;
    }
    $(".teacher_page_down_right_page_in_p").css("max-height",(maxlength*16*(100/document.documentElement.clientWidth)/66+1)*32+"px");
}

function initTeacherInfo(){
    $("#top_pic1").css("background","url(../pic/"+teacherPagePic1+")");
    $("#top_pic1").css("background-size","cover");
    $("#pic2_img").css("background","url(../pic/"+teacherPagePic2+") no-repeat 0px 0px");
    $("#pic2_img").css("background-size","cover");
    $("#teacherName").text(name);
    $("#teacher_instrument").text(instrument);
    $("#short_intruduce_show").text(shortInfo);
    $("#teacher_info_1").text(Info);
    $("#teacher_info_2").text(Info2);
    $("#teacher_info_3").text(Info3);
}
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

function jumToTeacherPageByNews() {
    jumpUrl("jumpUrl?page=teacher&id="+now_animate_teacher_id);
}
function teacher_info_animate(page_size) {
    var runVal = 100;
    if($(window).width() > 1024){
        runVal = 50;
    }
    if("1"==page_size){
        $("#teacher_info_pages").css("transform","translateX(0vw)");
        $("#teacher_info_dot_1").css("background-color","rgb(0,167,142)");
        $("#teacher_info_dot_2").css("background-color","rgb(0,0,0)");
        $("#teacher_info_dot_3").css("background-color","rgb(0,0,0)");
    }else if("2"==page_size){
        $("#teacher_info_pages").css("transform","translateX(-"+runVal+"vw)");
        $("#teacher_info_dot_2").css("background-color","rgb(0,167,142)");
        $("#teacher_info_dot_1").css("background-color","rgb(0,0,0)");
        $("#teacher_info_dot_3").css("background-color","rgb(0,0,0)");
    }else if('3'==page_size){
        $("#teacher_info_pages").css("transform","translateX(-"+runVal*2+"vw)");
        $("#teacher_info_dot_3").css("background-color","rgb(0,167,142)");
        $("#teacher_info_dot_1").css("background-color","rgb(0,0,0)");
        $("#teacher_info_dot_2").css("background-color","rgb(0,0,0)");
    }
}