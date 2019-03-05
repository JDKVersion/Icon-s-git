
/*function zTreeOnClick(){
    $(".formu").addClass("formInfo")
    $(".formSchedule").removeClass("formInfo")
};*/
var setting = {
    /*callback: {
        onClick: zTreeOnClick
    },*/

    view: {
        showLine: true,
        showIcon: true
    },
    data: {
        simpleData: {
            enable: true
        }

    }
}
var zNode1 =[
    { id:1, pId:0, name:"个人信息"},
    { id:2, pId:1, name:"信息管理"},
    { id:3, pId:1, name:"个人日程" ,"url":"querySchedule"}
]


/* 初始化各个功能的树*/
$(function () {

    $.fn.zTree.init($("#ztree"), setting, zNode1);
    $("#user").click(function () {
        $.fn.zTree.init($("#ztree"), setting, zNode1);
        if($("#hid").val()==1){
            $(".formSchedule").addClass("formInfo")
            $(".formu").removeClass("formInfo")
        }else{
            $(".formu").addClass("formInfo")
            $(".formSchedule").removeClass("formInfo")
        }

    });



})