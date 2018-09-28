/**
 * 登录初始化
 * 1、登录按钮事件绑定
 * 2、全局回车登录事件绑定
 */
$(document).ready(function(){
    $("#login").click(function(){
        login();
    });
    document.onkeydown=function(event){
        e = event ? event : (window.event ? window.event : null);
        if(e.keyCode==13){
        //执行的方法
            login();
        }else{
            $("#error_area").html('');
        }
    };
})
/**
 * 登录请求
 */
function login() {
    if (!checkForm()){
        return ; 
    }
    var obj = {
        username : $("#username").val(),
        password : $("#password").val()
    };
    $.ajax({
        type : "post",
        url : basePath + "login",
        dataType : "json",
        data : obj,
        async : false,
        success : function(data) {
            if (data.success) {
                window.location.href = basePath + "index";
            } else {
                areaAlert(data.msg);
            }
        }
    })
}
/**
 * 表单校验
 * @returns {Boolean}
 */
function checkForm(){
    var username = $.trim($("#username").val());
    if (username == ""){
        areaAlert("用户名不能为空！");
        return false;
    }
    var password = $.trim($("#password").val());
    if (password == ""){
        areaAlert("密码不能为空！");
        return false;
    }
    return true;
}
/**
 * 错误提示
 * @param msg 提示消息
 */
function areaAlert(msg){
    $("#error_area").html('<div class="alert alert-danger alert-dismissable"><button type="button" class="close" data-dismiss="alert" aria-hidden="true"> &times;</button>'+msg+'</div>');
}