var timer = null;
var running = false;
$(document).ready(function(){
	$("#btn_time").click(function(e){
		// 남은시간 표시
		var display = $("#time");
		// 인증시간
		var leftSec = 10;
		
		if(running){
			clearInterval(timer);
		}
		startTimer(leftSec, display);
	});
});
//타이머
function startTimer(count, display){
	var minutes, seconds;
	timer = setInterval(function(){
		minutes = parseInt(count / 60, 10);
		seconds = parseInt(count % 60, 10);
		
		minutes = minutes < 10 ? "0"+minutes : minutes; 
		seconds = seconds < 10 ? "0"+seconds : seconds;
		
		display.html(minutes+":"+seconds);
		
		if(--count < 0){
			clearInterval(timer);
			alert("시간초과");
			display.html(minutes+":"+seconds);
			$("#btn_time").attr("disabled", "disabled");
			running = false;
		}
	}, 1000);
	running = true;
}
