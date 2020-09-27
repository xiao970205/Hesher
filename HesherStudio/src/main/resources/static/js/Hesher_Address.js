function openAddress() {
    $("body").css("overflow-y","hidden");
    $("html").css("overflow-y","hidden");
    $("#contact").css("transform", "translateX(-0vw)");
    setTimeout(()=>{
        $("#button_model_anime_1").css({"transform": "translate(0vh,0vw)"});
        $("#button_model_anime_2").css({"transform": "translate(0vh,0vw)"});
        $("#button_model_anime_3").css({"transform": "translate(0vh,0vw)"});
        $("#button_model_anime_4").css({"transform": "translate(0vh,0vw)"});
        $("#button_pic").css({"transform":"translateY(0vh)"});
        $("#closecontact").css({"transform":"scale(1.0)"});
    },300);
}

function closeImg() {
    $("html").css("overflow-y","auto");
    $("body").css("overflow-y","auto");
    $("#button_model_anime_1").css({"transform": "translate(-80vh,-80vw)"});
    $("#button_model_anime_2").css({"transform": "translate(80vh,-80vw)"});
    $("#button_model_anime_3").css({"transform": "translate(-80vh,80vw)"});
    $("#button_model_anime_4").css({"transform": "translate(80vh,80vw)"});
    $("#button_pic").css({"transform":"translateY(80vh)"});
    $("#closecontact").css({"transform":"scale(0.1)"});
    setTimeout(()=> {
        $("#contact").css("transform", "translateX(-100vw)");
    },500);
}
$(document).ready(function () {
    $("#contact").click(function () {
        closeImg();
    });
    $("#button_model_anime_3").click(function (){

    });
});