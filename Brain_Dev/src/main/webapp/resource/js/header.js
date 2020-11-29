

$(document).ready(function(){
    $(".gnb_list2>li, .gnb2_wrap").mouseover(function(){
    	$(this).children("a").css("border-bottom", "#333333 1px solid");
        $(".gnb2_wrap").stop().slideDown(300);
    });
    
    $(".gnb_list2>li, .gnb2_wrap").mouseleave(function(){
    	$(this).children("a").css("border-bottom", "none");
        $(".gnb2_wrap").stop().slideUp(300);
    });
    
    //X버튼 클릭시 배경색이 투명해지고 팝업창이 닫힘
    $(".main_login_pop_close").on("click", function(){
        $("#mark").animate({opacity:'0'}, 500, function(){
      	  $(this).remove();
        });
        $(".main_login_pop").fadeOut(500);
    })
    
    //팝업창 이외 영역 클릭시 배경색이 투명해지고 팝업창이 닫힘
    $(document).mouseup(function (e){
        var container = $(".main_login_pop");
        if( container.has(e.target).length === 0){
          $("#mark").animate({opacity:'0'}, 500, function(){
        	  $(this).remove();
          });
          container.fadeOut(500);
        }
    });    
    
    //id,password label default text 비노출
    $("input[id='userid'], input[id='password']").on("focus", function(){
    	var _this = $(this);
    	var target_id = _this[0].id;
    	
    	if(target_id == "userid") {
    		$("label[for='userid']").text("");
    	} else if (target_id == "password") {
    		$("label[for='password']").text("");
    	}
    	
    })
    
    //id,password label default text 노출
    $("input[id='userid'], input[id='password']").on("blur", function(){
    	var _this = $(this);
    	var target_id = _this[0].id;
    	
    	if(_this.val().length === 0 && target_id == "userid") {
    		$("label[for='userid']").text("아이디");
    	} else if(_this.val().length === 0 && target_id == "password") {
    		$("label[for='password']").text("패스워드");
    	}
    })
})

function Login_pop() {
	var width = document.body.offsetWidth;
	var height = document.body.offsetHeight;
	
	$("body").append("<div id='mark' style='width:"+width+"px; height: "+height+"px; position: absolute; opacity: 0; left: 0px; top: 0px; background: rgb(0, 0, 0); z-index: 100001;'></div>");
	$("#mark").animate({opacity:'0.7'}, 500);
    $(".main_login_pop").fadeIn(500);	
}

