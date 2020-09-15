var opacityValue = 0;
$(window).scroll(function() {
  var scrollTop = document.documentElement.scrollTop || document.body.scrollTop;
  if(scrollTop>$("#main_1").height()){
  	document.getElementById("head_down_main").style.visibility="hidden";
  	opacityValue = 1;
  }else{
  	document.getElementById("head_down_main").style.visibility="visible";
  	opacityValue = 0;
  }
})
var menuOpen = 0;
var searchOpen = 0;
var opacityTools=self.setInterval("changeOpacity()",50);
function changeOpacity(){
	var str = $("#head_top").css("background-color");
	var strArray = str.split(", ");
	var opacity = strArray[strArray.length-1].replace(")","");
  	if(opacityValue == 0){
  		//变透明
  		if(parseFloat(opacity)>0.0){
  			opacity = parseFloat(opacity) - 0.1;
  		}
  	}else{
  		//变不透明
  		if(parseFloat(opacity)<0.5){
  			opacity = parseFloat(opacity) + 0.1;
  		}
  	}
  	$("#head_top").css("background-color","rgba(0,0,0,"+opacity+")");
}
$(function(){
	$("#head_top_center_center").click(function(){
		alert("主页跳转");
	});
	$("#head_top_right_wechat").click(function(){
		alert("微信链接");
	});
	$("#head_top_right_weibo").click(function(){
		window.open("https://weibo.com/Pantrick?is_all=1");
	});
	$("#head_top_right_youku").click(function(){
		alert("优酷链接");
	});
	$("#showHesher_right_down").click(function(){
		window.open("https://weibo.com/Pantrick?is_all=1");
	});
	$("#showHesher_left_down").click(function(){
		window.open("https://space.bilibili.com/3113010?from=search&seid=11722697212181282065");
	});
	$("#showMasterTeacherUpLeft").click(function(){
		alert("跳转到优秀教师left");
	});
	$("#showMasterTeacherUpRight").click(function(){
		alert("跳转到优秀教师right");
	});
	$("#showMasterTeacherMore").click(function(){
		alert("跳转到展示更多优秀教师");
	});
	var menuBtn = $('#head_top_left_menu');
 	var oAside = $('#menu');
 	menuBtn.on("click",function(){
 		if(menuOpen == 0){
	 		$('.menuleftContent').show();
 			oAside.addClass('active');
 			menuOpen = 1;
 		}else{
 			menuOpen = 0;
 			oAside.removeClass('active');
 		}
 	});
 	var searchBtn = $('#head_top_left_search');
 	var searchAside = $('#search');
 	searchBtn.on("click",function(){
 		if(searchOpen == 0){
	 		$('.menuleftContent').show();
 			searchAside.addClass('active');
 			searchOpen = 1;
 		}else{
 			searchOpen = 0;
 			searchAside.removeClass('active');
 		}
 	});
});
//鼠标移动到上面颜色变浅
$(document).ready(function(){
  	$("#head_top_right_wechat").hover(function(){
  		$("#head_top_right_wechat").animate({opacity:'0.5'},200);
    },function(){
  		$("#head_top_right_wechat").animate({opacity:'1.0'},200);
  });
  	$("#head_top_right_weibo").hover(function(){
  		$("#head_top_right_weibo").animate({opacity:'0.5'},200);
    },function(){
  		$("#head_top_right_weibo").animate({opacity:'1.0'},200);
  });
  	$("#head_top_right_youku").hover(function(){
  		$("#head_top_right_youku").animate({opacity:'0.5'},200);
    },function(){
  		$("#head_top_right_youku").animate({opacity:'1.0'},200);
  });
  $("#showHesher_left_down").hover(function(){
  		$("#showHesher_left_down").animate({opacity:'0.5'},200);
    },function(){
  		$("#showHesher_left_down").animate({opacity:'1.0'},200);
  });
  $("#showHesher_right_down").hover(function(){
  		$("#showHesher_right_down").animate({opacity:'0.5'},200);
    },function(){
  		$("#showHesher_right_down").animate({opacity:'1.0'},200);
  });
  $("#showMasterTeacherUpLeft").hover(function(){
  		$("#showMasterTeacherUpLeft").animate({opacity:'0.5'},200);
    },function(){
  		$("#showMasterTeacherUpLeft").animate({opacity:'1.0'},200);
  });
  $("#showMasterTeacherUpRight").hover(function(){
  		$("#showMasterTeacherUpRight").animate({opacity:'0.5'},200);
    },function(){
  		$("#showMasterTeacherUpRight").animate({opacity:'1.0'},200);
  });
  $("#showMasterTeacherDown").hover(function(){
  		$("#showMasterTeacherMore").animate({opacity:'0.5'},200);
    },function(){
  		$("#showMasterTeacherMore").animate({opacity:'1.0'},200);
  });
});
function instrumentTeaching(){
	alert("乐器教学链接");
}
function undertakePerformance(){
	alert("演出承接链接");
}
function shortVideoOperation(){
	alert("短视频运营链接");
}