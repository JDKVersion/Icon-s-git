var setting = {
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
    { id:1, pId:0, name:"考勤管理"},
    { id:2, pId:1, name:"考勤统计"},
    { id:3, pId:1, name:"加班申请"}
]

/* 初始化各个功能的树*/
$(function () {
    $.fn.zTree.init($("#ztree"), setting, zNode1);
    $("#attendance").click(function () {
        $.fn.zTree.init($("#ztree"), setting, zNode1);
    });
})