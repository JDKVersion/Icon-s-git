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
    { id:1, pId:0, name:"员工信息"},
    { id:2, pId:1, name:"员工信息"},
]

/* 初始化各个功能的树*/
$(function () {
    $.fn.zTree.init($("#ztree"), setting, zNode1);
    $("#HR").click(function () {
        $.fn.zTree.init($("#ztree"), setting, zNode1);

    });
})