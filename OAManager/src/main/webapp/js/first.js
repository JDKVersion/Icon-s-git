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
var zNode0 =[
    { id:1, pId:0, name:"首页信息"},
    { id:2, pId:1, name:"公司文化"},
    { id:3, pId:1, name:"联系我们"}
]

/* 初始化各个功能的树*/
$(function () {
    $.fn.zTree.init($("#ztree"), setting, zNode0);
    $("#index").click(function () {
        $.fn.zTree.init($("#ztree"), setting, zNode0);
    });
})

